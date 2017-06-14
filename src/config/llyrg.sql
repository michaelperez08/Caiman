CREATE DATABASE  IF NOT EXISTS `LlantasyReencauchesGriegos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `LlantasyReencauchesGriegos`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: LlantasyReencauchesGriegos
-- ------------------------------------------------------
-- Server version	5.7.18-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Aro`
--

DROP TABLE IF EXISTS `Aro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aro` (
  `idAro` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(25) NOT NULL,
  `NumeroAro` varchar(25) NOT NULL,
  `Codigo` varchar(10) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAro`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aro`
--

LOCK TABLES `Aro` WRITE;
/*!40000 ALTER TABLE `Aro` DISABLE KEYS */;
INSERT INTO `Aro` VALUES (1,'Horizon','15x8','25hY',4),(2,'Horizon','14','LK8',5),(3,'BBS','20','KJB4',6),(4,'BBS','15x8','LK5',4),(5,'Horizon','15','KJ5',6);
/*!40000 ALTER TABLE `Aro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Direccion_Simple` varchar(100) NOT NULL,
  `Direccion_Exacta` varchar(150) NOT NULL,
  `Cedula` varchar(25) NOT NULL,
  `Telefonos` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES (1,'Michael Perez Murillo','Alto Castro, Sarchi Sur, Valverde Vega','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','207350735','24543624 87363723 '),(2,'Alberto Ugalde Murillo','Santa Gertrudis, Grecia, Alajuela','','207450335','88996655'),(4,'Victor Ugalde Quesada','San Isidro, Poas, Alajuela','','207450335','55661100'),(5,'Oscar Perez Lopez','Tacares, grecia, Alajuela','','208750456','24447567 87896534 '),(7,'Juan Rodriguez','Sarchi, Alajuela, Costa Rica','Del parque 50 mts sur','209840336','22222222 111111111 333333333 '),(9,'Antonio Alavarez','Pital de San Carlos','Por la salchichoneria de los caballeros del sodiaco, cerca de la entrada al inframundo permidada por haya','2245678','3456543 3434455 ');
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Factura`
--

DROP TABLE IF EXISTS `Factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `NombreCliente` varchar(45) NOT NULL,
  `TelefonoCliente` varchar(35) DEFAULT NULL,
  `DireccionCliente` varchar(100) DEFAULT NULL,
  `FechaExpiracion` date NOT NULL,
  `SubTotal` double NOT NULL,
  `ImpVenta` double NOT NULL,
  `PrecioTotal` double NOT NULL,
  `Contado` tinyint(4) NOT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Factura`
--

LOCK TABLES `Factura` WRITE;
/*!40000 ALTER TABLE `Factura` DISABLE KEYS */;
INSERT INTO `Factura` VALUES (1,'Naruto','90909090','konoha','2017-06-09',9999,6666,77777,0),(2,'Alberto Ugalde Murillo','88996655','','2017-06-29',31000,4030,35030,0),(3,'Michael Perez Murillo','24543624 87363723 ','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','2017-06-29',1000,130,1130,0);
/*!40000 ALTER TABLE `Factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LineaFactura`
--

DROP TABLE IF EXISTS `LineaFactura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LineaFactura` (
  `idLineaFactura` int(11) NOT NULL AUTO_INCREMENT,
  `idFactura` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Detalle` varchar(45) NOT NULL,
  `PrecioUnitario` double NOT NULL,
  `PrecioTotalLinea` double NOT NULL,
  PRIMARY KEY (`idLineaFactura`),
  KEY `fk_LineaFactura_1_idx` (`idFactura`),
  CONSTRAINT `fk_LineaFactura_1` FOREIGN KEY (`idFactura`) REFERENCES `Factura` (`idFactura`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LineaFactura`
--

LOCK TABLES `LineaFactura` WRITE;
/*!40000 ALTER TABLE `LineaFactura` DISABLE KEYS */;
INSERT INTO `LineaFactura` VALUES (1,1,0,'detalle#0',0,0),(2,1,1,'detalle#1',100,1000),(3,1,2,'detalle#2',200,2000),(4,1,3,'detalle#3',300,3000),(5,1,4,'detalle#4',400,4000),(6,1,5,'detalle#5',500,5000),(7,1,6,'detalle#6',600,6000),(8,1,7,'detalle#7',700,7000),(9,1,8,'detalle#8',800,8000),(10,1,9,'detalle#9',900,9000),(11,2,3,'Aro 15x8 Horizon 25hY',10000,30000),(12,2,2,'Aro 15x8 BBS LK5',500,1000),(13,3,1,'Aro 15x8 Horizon 25hY',1000,1000);
/*!40000 ALTER TABLE `LineaFactura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Llanta`
--

DROP TABLE IF EXISTS `Llanta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Llanta` (
  `idLlanta` int(11) NOT NULL AUTO_INCREMENT,
  `NumeroLlanta` varchar(25) NOT NULL,
  `Marca` varchar(25) NOT NULL,
  `Diseno` varchar(25) NOT NULL,
  `NumeroCapas` varchar(15) DEFAULT NULL,
  `Cantidad` int(11) NOT NULL,
  `TipoLlanta` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idLlanta`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Llanta`
--

LOCK TABLES `Llanta` WRITE;
/*!40000 ALTER TABLE `Llanta` DISABLE KEYS */;
INSERT INTO `Llanta` VALUES (1,'205/70/14','Aeulos','hn08','3',10,'Normal'),(3,'11-24.5','Ovation','VI 312','16',10,'Normal');
/*!40000 ALTER TABLE `Llanta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `NombreUsuario` varchar(15) NOT NULL,
  `Contrasena` varchar(20) NOT NULL,
  `Tipo` varchar(15) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (1,'admin','admin','Estandar'),(2,'michael','mike9538','Administrador'),(6,'vic','1234','Estandar');
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'LlantasyReencauchesGriegos'
--

--
-- Dumping routines for database 'LlantasyReencauchesGriegos'
--
/*!50003 DROP PROCEDURE IF EXISTS `InsertarFacturaNueva` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarFacturaNueva`(
IN NombreCliente varchar(45),IN TelefonoCliente varchar(35),IN DireccionCliente varchar(100), IN PrecioTotal double, OUT idFactura int)
BEGIN
insert into Factura (NombreCliente,TelefonoCliente,DireccionCliente,PrecioTotal,Fecha) 
	values (NombreCliente, TelefonoCliente,DireccionCliente,PrecioTotal,current_date());
select last_insert_id() into idFactura;    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-14 11:19:30
