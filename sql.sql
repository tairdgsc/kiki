CREATE DATABASE  IF NOT EXISTS `banco_kiki`;
USE `banco_kiki`;

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NULL,
  `email` VARCHAR(255) NULL,
  `senha` VARCHAR(255) NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `cadastro_prestadores`;
CREATE TABLE `cadastro_prestadores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idproduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NULL,
  `cod_produto` VARCHAR(255) NULL,
  `quantidade` VARCHAR(255) NULL,
  `validade` VARCHAR(255) NULL,
  `descricao` VARCHAR(255) NULL,
  PRIMARY KEY (`idproduto`))
ENGINE = InnoDB;
