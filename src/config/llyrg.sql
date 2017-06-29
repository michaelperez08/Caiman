-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: LlantasyReencauchesGriegos
-- ------------------------------------------------------
-- Server version	5.7.18

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aro`
--

LOCK TABLES `Aro` WRITE;
/*!40000 ALTER TABLE `Aro` DISABLE KEYS */;
INSERT INTO `Aro` VALUES (1,'Horizon','15x8','25hY',1),(2,'Horizon','14','LK8',5),(3,'brigstone','15','b15',4),(5,'Horizon','15','KJ5',6),(6,'PruebaBLIngresar','26','PBLIn',2);
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
  `Direccion_Simple` varchar(100) DEFAULT NULL,
  `Direccion_Exacta` varchar(150) DEFAULT NULL,
  `Cedula` varchar(25) DEFAULT NULL,
  `Telefonos` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES (1,'Michael Perez Murillo','Alto Castro, Sarchi Sur, Valverde Vega','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','207350735','(+506) 2454-3624 / (+506) 8766-3723 / '),(2,'Alberto Ugalde Murillo','Santa Gertrudis, Grecia, Alajuela','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','207450335','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / '),(4,'Victor Ugalde Quesada','San Isidro, Poas, Alajuela','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','207450335','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / '),(5,'Oscar Perez Lopez','Tacares, grecia, Alajuela','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','208750456','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / '),(7,'Juan Rodriguez','Sarchi, Alajuela, Costa Rica','Del parque 50 mts sur','209840336','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / '),(9,'Antonio Alavarez','Pital de San Carlos','Por la salchichoneria de los caballeros del sodiaco, cerca de la entrada al inframundo permidada por haya','2245678','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ');
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
  `TelefonoCliente` varchar(60) DEFAULT NULL,
  `DireccionCliente` varchar(100) DEFAULT NULL,
  `FechaExpiracion` date NOT NULL,
  `SubTotal` double NOT NULL,
  `ImpVenta` double NOT NULL,
  `PrecioTotal` double NOT NULL,
  `Contado` tinyint(4) NOT NULL,
  `CedulaCliente` varchar(25) NOT NULL,
  `FechaFactura` date DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Factura`
--

LOCK TABLES `Factura` WRITE;
/*!40000 ALTER TABLE `Factura` DISABLE KEYS */;
INSERT INTO `Factura` VALUES (1,'Naruto','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-09',9999,6666,77777,0,'2074503624','2017-06-01'),(2,'Alberto Ugalde Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-29',31000,4030,35030,0,'2074503624','2017-06-05'),(3,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','2017-06-29',1000,130,1130,0,'2074503624','2017-06-10'),(4,'Victor Ugalde Quesada','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-29',25000,3250,28250,0,'2074503624','2017-06-15'),(5,'Antonio Alavarez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Pital de San Carlos','2017-07-01',60000,7800,67800,0,'2074503624','2017-06-20'),(6,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Alto Castro, Sarchi Sur, Valverde Vega','2017-07-04',12500,1625,14125,0,'207350735','2017-06-25'),(7,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Alto Castro, Sarchi Sur, Valverde Vega','2017-07-04',12500,1625,14125,0,'207350735','2017-06-25'),(8,'Oscar Perez Lopez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Tacares, grecia, Alajuela','2017-07-13',1810000,235300,2045300,0,'208750456','2017-06-28');
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LineaFactura`
--

LOCK TABLES `LineaFactura` WRITE;
/*!40000 ALTER TABLE `LineaFactura` DISABLE KEYS */;
INSERT INTO `LineaFactura` VALUES (1,1,0,'detalle#0',0,0),(2,1,1,'detalle#1',100,1000),(3,1,2,'detalle#2',200,2000),(4,1,3,'detalle#3',300,3000),(5,1,4,'detalle#4',400,4000),(6,1,5,'detalle#5',500,5000),(7,1,6,'detalle#6',600,6000),(8,1,7,'detalle#7',700,7000),(9,1,8,'detalle#8',800,8000),(10,1,9,'detalle#9',900,9000),(11,2,3,'Aro 15x8 Horizon 25hY',10000,30000),(12,2,2,'Aro 15x8 BBS LK5',500,1000),(13,3,1,'Aro 15x8 Horizon 25hY',1000,1000),(14,4,1,'Aro 20 BBS KJB4',10000,10000),(15,4,3,'Aro 15x8 BBS LK5',5000,15000),(16,5,1,'Aro 15x8 Horizon 25hY',10000,10000),(17,5,1,'Aro 26 PruebaBLIngresar PBLIn',50000,50000),(18,6,5,'Llanta Normal 205/70/14 Aeulos hn08',2500,12500),(19,7,5,'Llanta Normal 205/70/14 Aeulos hn08',2500,12500),(20,8,5,'Llanta Normal 205/70/14 Aeulos hn08',250000,1250000),(21,8,1,'Aro 15x8 Horizon 25hY',560000,560000);
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
INSERT INTO `Llanta` VALUES (1,'205/70/14','Aeulos','hn08','3',5,'Normal'),(3,'11-24.5','Ovation','VI 312','16',10,'Normal');
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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-28 15:57:53
