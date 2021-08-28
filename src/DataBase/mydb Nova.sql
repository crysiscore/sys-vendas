-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 17, 2012 at 11:02 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mydb`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `AdicionarStock`(in codProduto int, IN quant int )
BEGIN
UPDATE  `mydb`.`produto` SET  `QuantidadeStock` =`QuantidadeStock`+quant  WHERE  `produto`.`Cod_Produto` =codProduto;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ApagarProduto`(IN `Cod_Produto` varchar(50))
BEGIN
  
  DELETE FROM `produto` WHERE Cod_Produto=Cod_Produto;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ApagarUnidade`(IN `idUnidade` int)
BEGIN
  
  DELETE FROM `unidade` WHERE idUnidade=idUnidade;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ApagarUsuario`(IN `Cod_Funcionario` int)
BEGIN
  
  DELETE FROM `usuario` WHERE Cod_Funcionario=Cod_Funcionario;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `CodVendaCorrente`()
begin 
SELECT  `Cod_venda` 
FROM venda
ORDER BY  `Cod_venda` DESC 
LIMIT 1;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `DetalhesProdutos`(in codProduto int )
BEGIN
SELECT distinct `Cod_Produto` AS Codigo, P.`Nome`,`PrecoUnitario` AS Preco,`QuantidadeStock` as Quantidade, U.Descricao_Unidade AS Unidade, C.Nome as Categoria
 FROM produto P, categoria C, unidade U
 WHERE `Cod_Produto`=codProduto and P.`Unidade`=U.idUnidade and P.`Categoria`=C.idCategoria	;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `DETALHESVENDA`(CODP INT, IN CODV INT, IN PREC DOUBLE, IN QUANT INT)
BEGIN

INSERT INTO `mydb`.`detalhesvenda` (`Produto_Cod_Produto`, `Venda_Cod_venda`, `preco`, `Quantidade`) VALUES (CODP, CODV, PREC, QUANT);
UPDATE  `mydb`.`produto` SET  `QuantidadeStock` =`QuantidadeStock`-QUANT   WHERE  `produto`.`Cod_Produto` =CODP;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarProdutos`()
BEGIN
  SELECT * FROM `produto` ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarUnidade`()
BEGIN
  SELECT * FROM  `unidade`;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarUsuarios`()
BEGIN
  SELECT * FROM `usuario` ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Login`(IN username varchar (50), IN password varchar(50))
BEGIN
UPDATE  `mydb`.`usuario` SET  `EstaAutenticado` =  'false' ;
UPDATE  `mydb`.`usuario` SET  `EstaAutenticado` =  'true' WHERE  `Nome`=username and `Senha`=password;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Logout`()
BEGIN
UPDATE  `mydb`.`usuario` SET  `EstaAutenticado` =  'false' ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `PesquisaProduto`(IN Nome varchar(50))
BEGIN
  SELECT * FROM  `produto` where Nome= "%Nome%";
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `PesquisaUnidade`(IN `Descricao_Unidade` varchar(50))
BEGIN
  SELECT * FROM  `produto` where Nome= "%Descricao_Unidade%";
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `PesquisaUsuario`(IN Nome varchar(50))
BEGIN
  SELECT * FROM  `unidade` where Nome= "%Nome%";
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ProcurarProdutos`(in param varchar (40))
BEGIN
SELECT distinct `Cod_Produto` AS Codigo, `Nome`,`PrecoUnitario` AS Preco,`QuantidadeStock` as Quantidade
 FROM produto 
 WHERE `Cod_Produto`  like CONCAT('%', param, '%') or `Nome` like CONCAT('%', param, '%') ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_produto`(IN Cod_Produto int,IN Nome varchar(50),IN PrecoUnitario Double,IN QuantidadeStock int,IN Unidade_Cod_unidade int,IN Categoria int,IN quantidadeUnidade int,IN Descricao varchar(50))
BEGIN
 
 INSERT INTO `produto`(`Cod_Produto`,`Nome`,`PrecoUnitario`,`QuantidadeStock`,`Unidade_Cod_unidade`,`Categoria`,`quantidadeUnidade`,`Descricao `) VALUES(NULL,Nome ,PrecoUnitario,QuantidadeStock,Unidade_Cod_unidade,Categoria,quantidadeUnidade);
 
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_unidade`(IN Cod_Unidade int,IN Descricao varchar(50))
BEGIN

    INSERT INTO `mydb`.`unidade` (`Cod_Unidade`,`Descricao_Unidade`) VALUES (NULL,Descricao);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_usuario`(IN Cod_Funcionario int,IN Nome  varchar(50),IN  Senha varchar(50),IN  Categoria varchar(50))
BEGIN

    INSERT INTO `usuario`(`Cod_Funcionario`, `Nome`, `Senha`, `Categoria`) VALUES (NULL, Nome , Senha, Categoria);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `SearchProdutoVenda`(in Param varchar(50))
BEGIN
 SELECT distinct  P.`Cod_Produto` AS Codigo,P.`Nome`,`PrecoUnitario` AS Preco,`QuantidadeStock` as Quantidade,U.Descricao_Unidade as Unidade, C.Nome
 FROM produto P inner join unidade U on  P.Unidade=U.idUnidade 
inner join categoria C on  P.Categoria=C.idCategoria 
Where  `Cod_Produto`  like CONCAT('%', param, '%') or P.`Nome` like CONCAT('%', param, '%');
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `TodosProdutos`()
BEGIN
 SELECT  `Cod_Produto` AS Codigo,P. `Nome`,`PrecoUnitario` AS Preco,`QuantidadeStock` as Quantidade, U.Descricao_Unidade, C.Nome
 FROM produto P, unidade U,categoria C
Where P.Unidade=U.idUnidade and P.Categoria=C.idCategoria;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `UsuarioAutenticado`()
BEGIN
  SELECT * FROM  `usuario` where `EstaAutenticado`= "true";
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `VENDA`( IN TOTAL DOUBLE, IN NOMEC VARCHAR(50) ,IN FUNC INT )
BEGIN
INSERT INTO `mydb`.`venda` (`Cod_venda`, `Data_venda`, `Total_venda`, `Nome_Cliente`, `usuario_Cod_Funcionario`) VALUES (NULL, CURDATE(), TOTAL, NOMEC, FUNC);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `Nome`, `Descricao`) VALUES
(2, 'Cosmeticos', ''),
(3, 'Nenhuma', '');

-- --------------------------------------------------------

--
-- Table structure for table `detalhesvenda`
--

CREATE TABLE IF NOT EXISTS `detalhesvenda` (
  `Produto_Cod_Produto` int(11) NOT NULL,
  `Venda_Cod_venda` int(11) NOT NULL,
  `preco` double DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`Produto_Cod_Produto`,`Venda_Cod_venda`),
  KEY `fk_Produto_has_Venda_Venda1_idx` (`Venda_Cod_venda`),
  KEY `fk_Produto_has_Venda_Produto1_idx` (`Produto_Cod_Produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detalhesvenda`
--

INSERT INTO `detalhesvenda` (`Produto_Cod_Produto`, `Venda_Cod_venda`, `preco`, `Quantidade`) VALUES
(1, 14, 190, 1),
(1, 15, 190, 1),
(1, 16, 380, 2),
(1, 17, 190, 1),
(1, 18, 190, 1),
(2, 14, 180, 1),
(2, 15, 180, 1),
(2, 16, 180, 1);

-- --------------------------------------------------------

--
-- Table structure for table `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `Cod_Produto` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `PrecoUnitario` double NOT NULL,
  `QuantidadeStock` int(11) NOT NULL,
  `Unidade` int(11) DEFAULT NULL,
  `Categoria` int(11) DEFAULT NULL,
  `quantidadeUnidade` int(11) DEFAULT NULL,
  `Descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cod_Produto`),
  KEY `fk_Produto_Unidade_idx` (`Unidade`),
  KEY `fk_produto_catgoria1` (`Categoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `produto`
--

INSERT INTO `produto` (`Cod_Produto`, `Nome`, `PrecoUnitario`, `QuantidadeStock`, `Unidade`, `Categoria`, `quantidadeUnidade`, `Descricao`) VALUES
(1, 'Nivea For Man', 190, 10, 1, 3, 190, NULL),
(2, 'Leite Cremora', 180, 9, 2, 3, 180, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `unidade`
--

CREATE TABLE IF NOT EXISTS `unidade` (
  `idUnidade` int(11) NOT NULL AUTO_INCREMENT,
  `Descricao_Unidade` varchar(45) NOT NULL,
  PRIMARY KEY (`idUnidade`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `unidade`
--

INSERT INTO `unidade` (`idUnidade`, `Descricao_Unidade`) VALUES
(1, 'Singular'),
(2, 'Kg'),
(3, 'Singular');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `Cod_Funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Senha` varchar(45) DEFAULT NULL,
  `Categoria` varchar(45) NOT NULL,
  `EstaAutenticado` char(5) NOT NULL DEFAULT 'false',
  PRIMARY KEY (`Cod_Funcionario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`Cod_Funcionario`, `Nome`, `Senha`, `Categoria`, `EstaAutenticado`) VALUES
(1, 'Agnaldo', 'crisis', 'Funcionario', 'true'),
(2, 'Bonomar', 'ola2011', 'Gerente', 'false');

-- --------------------------------------------------------

--
-- Table structure for table `venda`
--

CREATE TABLE IF NOT EXISTS `venda` (
  `Cod_venda` int(11) NOT NULL AUTO_INCREMENT,
  `Data_venda` date NOT NULL,
  `Total_venda` double NOT NULL,
  `Nome_Cliente` varchar(45) NOT NULL,
  `usuario_Cod_Funcionario` int(11) NOT NULL,
  PRIMARY KEY (`Cod_venda`),
  KEY `fk_venda_usuario1` (`usuario_Cod_Funcionario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `venda`
--

INSERT INTO `venda` (`Cod_venda`, `Data_venda`, `Total_venda`, `Nome_Cliente`, `usuario_Cod_Funcionario`) VALUES
(1, '2012-12-16', 123, 'Bonomar', 1),
(2, '2012-12-16', 540, 'bonomar', 1),
(3, '2012-12-16', 360, 'sbonomar', 1),
(4, '2012-12-16', 560, 'Bonomas', 1),
(5, '2012-12-16', 370, 'acsxasc', 1),
(6, '2012-12-16', 370, 'zxcvbn', 1),
(7, '2012-12-16', 380, 'xzcvscvzs', 1),
(8, '2012-12-16', 190, 'sdvsdvds', 1),
(9, '2012-12-16', 380, 'ZX AS cas', 1),
(10, '2012-12-16', 570, 'sacsc', 1),
(11, '2012-12-16', 550, 'saC szx', 1),
(12, '2012-12-16', 370, 'ZXC', 1),
(13, '2012-12-16', 930, 'samuel', 1),
(14, '2012-12-16', 370, 'samuel', 1),
(15, '2012-12-16', 370, 'samuel', 1),
(16, '2012-12-17', 560, 'afnas titods', 1),
(17, '2012-12-17', 190, 'qewasczx', 1),
(18, '2012-12-17', 190, 'ewafdszvx', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detalhesvenda`
--
ALTER TABLE `detalhesvenda`
  ADD CONSTRAINT `fk_Produto_has_Venda_Produto1` FOREIGN KEY (`Produto_Cod_Produto`) REFERENCES `produto` (`Cod_Produto`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Produto_has_Venda_Venda1` FOREIGN KEY (`Venda_Cod_venda`) REFERENCES `venda` (`Cod_venda`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `fk_produto_catgoria1` FOREIGN KEY (`Categoria`) REFERENCES `categoria` (`idCategoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Produto_Unidade` FOREIGN KEY (`Unidade`) REFERENCES `unidade` (`idUnidade`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `fk_venda_usuario1` FOREIGN KEY (`usuario_Cod_Funcionario`) REFERENCES `usuario` (`Cod_Funcionario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
