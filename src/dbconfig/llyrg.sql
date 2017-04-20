-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: LlantasyReencacuhesGriegos
-- ------------------------------------------------------
-- Server version	5.7.17

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aro`
--

LOCK TABLES `Aro` WRITE;
/*!40000 ALTER TABLE `Aro` DISABLE KEYS */;
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
  `Direccion` varchar(100) NOT NULL,
  `Cedula` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
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
  `NombreCliente` varchar(45) DEFAULT NULL,
  `TelefonoCliente` varchar(35) DEFAULT NULL,
  `DireccionCliente` varchar(100) DEFAULT NULL,
  `PrecioTotal` double DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Factura`
--

LOCK TABLES `Factura` WRITE;
/*!40000 ALTER TABLE `Factura` DISABLE KEYS */;
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
  `idFactura` int(11) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Detalle` varchar(45) DEFAULT NULL,
  `PrecioUnitario` double DEFAULT NULL,
  `PrecioTotalLinea` double DEFAULT NULL,
  PRIMARY KEY (`idLineaFactura`),
  KEY `fk_LineaFactura_1_idx` (`idFactura`),
  CONSTRAINT `fk_LineaFactura_1` FOREIGN KEY (`idFactura`) REFERENCES `Factura` (`idFactura`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LineaFactura`
--

LOCK TABLES `LineaFactura` WRITE;
/*!40000 ALTER TABLE `LineaFactura` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Llanta`
--

LOCK TABLES `Llanta` WRITE;
/*!40000 ALTER TABLE `Llanta` DISABLE KEYS */;
/*!40000 ALTER TABLE `Llanta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Telefono`
--

DROP TABLE IF EXISTS `Telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Telefono` (
  `idTelefono` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  PRIMARY KEY (`idTelefono`),
  KEY `fk_Telefono_1_idx` (`idCliente`),
  CONSTRAINT `fk_Telefono_1` FOREIGN KEY (`idCliente`) REFERENCES `Cliente` (`idCliente`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Telefono`
--

LOCK TABLES `Telefono` WRITE;
/*!40000 ALTER TABLE `Telefono` DISABLE KEYS */;
/*!40000 ALTER TABLE `Telefono` ENABLE KEYS */;
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
  `Contraseña` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'LlantasyReencacuhesGriegos'
--

--
-- Dumping routines for database 'LlantasyReencacuhesGriegos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-19 18:20:29
