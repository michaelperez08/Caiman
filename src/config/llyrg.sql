CREATE DATABASE  IF NOT EXISTS `llyrg` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `llyrg`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: llyrg
-- ------------------------------------------------------
-- Server version	5.7.19

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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Aro`
--

LOCK TABLES `Aro` WRITE;
/*!40000 ALTER TABLE `Aro` DISABLE KEYS */;
INSERT INTO `Aro` VALUES (7,'RZ','13x5.5','L821',1),(8,'BBS','13x6','L247',2),(9,'RZ','14','L068',0),(10,'BBS','15x7','6x139.7',0),(11,'RZ','15x7','L0802',2),(12,'RZ','15x7','L002',0),(13,'BBS','15x7','L1405',1),(14,'Orbital','15x7','4x100mm',0),(17,'Orbital','15x7','4x100',0),(18,'RZ','15x7.5','L142',0),(19,'Orbital','15x7','6x139.7mm',3),(20,'BBS','15x8','N/A',0),(21,'Orbital','15x8','4x100mm',4),(22,'Orbital','15x8','114.3mm',1),(23,'BBS','16x7','6x139.7mm',2),(24,'Orbital','16x7.5','6x139.7mm',3),(25,'Orbital','16x8','5x114.3mm',3),(26,'Orbital','16x8','6x139.7mm',0),(27,'RZ','17','10x100',2),(28,'RZ','17x8.5','L867',3),(29,'Orbital','17x8','6x139.7mm',1),(30,'RZ','15x8','B15S',4);
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
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES (10,'Acarreos y Excavaciones Salazar','San Rafael, Sarchí','','',''),(11,'Acarreos Avicolas Arfujo SA','Turrucares','','','8341-7980 / '),(12,'Alberto Muñoz Ramírez','Dulce Nombre, Naranjo','','','2451-1887 / 2454-3624 / '),(13,'Alberto Ramírez Guerrero','Sarchí Sur','','','2454-3070 / '),(14,'Alonso Molina Fonseca','Vara Blanca','','','8846-5600 / '),(15,'Alquileres Kepa','Grecia','','','2494-4155 / '),(16,'Alvaro Adelso Campos Ugalde','Sarchí Sur','','','2454-4774 / '),(17,'Alvaro Murillo Castro','N/A','','',''),(18,'Andres Murillo Castro','Naranjo','','','8823-4672 / '),(19,'Carlos Eduardo Sanabria Sibaja','Tambor, Alajuela','','','7114-9765 / '),(20,'Carlos Herrera Rodríguez','Santa Gertrudis','','','8558-9866 / '),(21,'Carlos Gonzáles Delgado','Ciruelas, Alajuela','','','8359-7158 / '),(22,'Carlos Soto Solorzano','Poasito','','','8825-1520 / '),(23,'Cesar Antonio Abarca López','Grecia','','','8766-6000 / '),(24,'Chavez y Quesada','Tacares','','',''),(25,'Concretos del Poás','San Juan, Poás','','','8835-9261 / '),(26,'Corporación Ind de Trans Patica','Turrucares','','','8389-1257 / '),(27,'Danny Rojas Vargas','El Rosario, Naranjo','','','8850-3409 / '),(28,'Delicias leche y miel','Carillos','','','2458-3256 / '),(29,'Dist Diroa','Lotes Murillo, Alajuela','','','8325-0231 / '),(30,'Donald Oviedo Barrantes','Grecia','','','8833-0016 / '),(31,'Eddy Hernández Jiménez','Dulce Nombre, Naranjo','','','8827-7696 / '),(32,'Elías Vargas Solís','Guatuso, Alajuela','','','8890-6125 / '),(33,'El Triunfo Mercantil','Alajuela','','','2443-2833 / '),(34,'Francisco Arrieta Céspedez','Villa Bonita','','','7252-2687 / '),(35,'Federico Rojas González','Santa Gertrudis','','',''),(36,'Fernando Nuñez Oviedo','Ciruelas, Alajuela','','','8856-4339 / '),(37,'Ferreteria Manuel Ledezma e Hijos','Sarchí Norte','','','2454-3931 / '),(38,'Follajes Telon SA','Sabana Redonda, Poás','','','2435-8000 / '),(39,'Gerardo Enrique Barrantes Barrantes','Los Ángeles, Grecia','','','6107-1331 / '),(40,'Gerardo Espinoza Salas','Alajuela','','','8351-9199 / '),(41,'Harlan Céspedez Barrantes','El Llano, Naranjo','','','2450-3026 / '),(42,'Henry González González','La Guacima','','','8358-0155 / '),(43,'Herberth Araya Campos','Santa Gertrudis','','','8706-6693 / '),(44,'Hernan Salazar Corrales','Dulce Nombre, Naranjo','','','2451-0972 / '),(45,'Inversiones Nuñez Alvarado','Villa Bonita, Alajuela','','','8363-6784 / '),(46,'Inversiones Quemare','La Garita','','','2487-8105 / '),(47,'Inversiones Soso','N/A','','',''),(48,'Ivan Gutierrez Fallas','San Rafael, Alajuela','','',''),(49,'Javier Vargas Ugalde','Poasito','','','8836-5133 / '),(50,'Jorge Antonio Campos López','Atenas','','',''),(51,'Jorge Arturo Miranda Vargas','Puente Piedra, Grecia','','','2494-5930 / '),(52,'Jorge Isaac Viquez León','Santa Gertrudis','','','6111-9981 / '),(53,'Jorge Ulate Murillo','Sarchí Sur','','','8556-7988 / '),(54,'José Ángel Murillo Chacón','El Llano, Naranjo','','','8930-3714 / '),(55,'José Enrique Campos Morales','Villa Bonita, Alajuela','','','8703-6543 / '),(56,'Juan Carlos Espinoza Nuñez','Santa Gertrudis','','',''),(57,'Juan Carlos Rojas Alvarado','Dulce Nombre, Naranjo','','','8878-7879 / '),(58,'Leonardo González Araya','Ciruelas, Alajuela','','','8830-8090 / '),(59,'Leonel Salazar Corrales','Dulce Nombre, Naranjo','','','813-2891 / '),(60,'Luis Aurelio Herrera Rodriguez','Santa Gertrudis','','','8751-5070 / '),(61,'Luis Enrique Hidalgo Acuña','Sarchí Sur','','','8823-3987 / '),(62,'Luis Gerardo Vargas Alvarado','Poasito','','','8854-4423 / '),(63,'Luis Gustavo Vargas Murillo','San Roque, Grecia','','',''),(64,'Luis Vargas Vargas','Poasito','','','8349-5377 / '),(65,'Maikol Corrales Varela','San Ramón','','','8809-0555 / '),(66,'Marcos Castro Medina','Sarchí Sur','','','8313-2360 / '),(67,'Maria Lidieth Villegas Herrera','San Ramón','','','8889-9663 / '),(68,'Mario Enrique Solís Vargas','Ciruelas, Alajuela','','','8811-8310 / '),(69,'Mario Hernández Prado','San José','','',''),(70,'Mario Zamora','Grecia','','','2494-4380 / '),(71,'Miguel Chacón Pérez','Sarchí Sur','','','8766-6007 / '),(72,'Miguel Cubero González','Sarchí Norte','','','8609-4766 / '),(73,'Olivier Vega','Sarchí Norte','','','2454-4182 / '),(74,'Propiedades Roko S.A','Rincón de Salas','','','2444-8761 / '),(75,'Rafael Ángel Cambronero Zuñiga','Naranjo','','','2451-5398 / '),(76,'Rafael Ángel Ulate Murillo','Sarchí Norte, San Rafael','','','8605-9426 / '),(77,'Rafael Araya Fuentes','Turrucares','','','8842-6676 / '),(78,'Rafael Rodríguez Jiménez','Los Ángeles, Grecia.','','','8915-5294 / '),(79,'Rafael Segura Muñoz','Poasito','','208760654','8839-2388 / ');
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
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Factura`
--

LOCK TABLES `Factura` WRITE;
/*!40000 ALTER TABLE `Factura` DISABLE KEYS */;
INSERT INTO `Factura` VALUES (1,'Francisco Lopez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-09',9999,6666,77777,0,'2074503624','2017-04-06'),(2,'Alberto Ugalde Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-29',31000,4030,35030,0,'2074503624','2017-04-07'),(3,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','350 metros noreste de la escuela, despues del segundo muerto la segunda entrada a mano izquierda','2017-06-29',1000,130,1130,0,'2074503624','2017-04-09'),(4,'Victor Ugalde Quesada','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','konoha','2017-06-29',25000,3250,28250,0,'2074503624','2017-04-11'),(5,'Antonio Alavarez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Pital de San Carlos','2017-07-01',60000,7800,67800,0,'2074503624','2017-04-13'),(6,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Alto Castro, Sarchi Sur, Valverde Vega','2017-07-04',12500,1625,14125,0,'207350735','2017-04-15'),(7,'Michael Perez Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Alto Castro, Sarchi Sur, Valverde Vega','2017-07-04',12500,1625,14125,0,'207350735','2017-04-17'),(8,'Oscar Perez Lopez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Tacares, grecia, Alajuela','2017-07-13',1810000,235300,2045300,0,'208750456','2017-04-19'),(9,'Victor Ugalde Quesada','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','San Isidro, Poas, Alajuela','2017-10-05',2377775,309110.75,2686885.75,1,'207450335','2017-04-21'),(10,'Juan Rodriguez','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Sarchi, Alajuela, Costa Rica','2017-07-23',150000,19500,169500,1,'209840336','2017-04-23'),(11,'Alberto Ugalde Murillo','(+889) 9665-5555 / (+506) 2454-3624 / (+506) 8766-3723 / ','Santa Gertrudis, Grecia, Alajuela','2017-07-23',252000,32760,284760,1,'207450335','2017-04-25'),(12,'Follajes Telon SA','(+506) 2435-8000 / ','Sabana Redonda, Poás','2017-07-23',2000,260,2260,1,'','2017-04-27'),(13,'Acarreos Avicolas Arfujo SA','(+506) 8341-7980 / ','Turrucares','2017-08-23',468000,60840,528840,1,'','2017-04-29'),(14,'Acarreos y Excavaciones Salazar','','San Rafael, Sarchí','2017-08-23',154000,20020,174020,1,'','2017-05-01'),(15,'Alberto Muñoz Ramírez','(+506) 2451-1887 / ','Dulce Nombre, Naranjo','2017-07-24',370000,48100,418100,1,'','2017-05-03'),(16,'Alberto Muñoz Ramírez','(+506) 2451-1887 / ','Dulce Nombre, Naranjo','2017-08-08',298000,38740,336740,1,'','2017-05-05'),(17,'Alonso Molina Fonseca','(+506) 8846-5600 / ','Vara Blanca','2017-07-24',240000,31200,271200,1,'','2017-05-07'),(18,'Alquileres Kepa','(+506) 2494-4155 / ','Grecia','2017-09-22',200000,26000,226000,1,'','2017-05-09'),(19,'Alonso Molina Fonseca','(+506) 8846-5600 / ','Vara Blanca','2017-07-24',350000,45500,395500,1,'','2017-05-11'),(20,'Alberto Muñoz Ramírez','(+506) 2451-1887 / ','Dulce Nombre, Naranjo','2017-07-24',1140000,148200,1288200,1,'','2017-05-13'),(23,'Carlos Eduardo Sanabria Sibaja','(+506) 7114-9765 / ','Tambor, Alajuela','2017-07-24',214000,27820,241820,1,'','2017-05-15'),(24,'Cesar Antonio Abarca López','(+506) 8766-6000 / ','Grecia','2017-07-24',324000,42120,366120,1,'','2017-05-17'),(25,'Donald Oviedo Barrantes','(+506) 8833-0016 / ','Grecia','2017-07-24',146000,18980,164980,1,'','2017-05-19'),(26,'Gerardo Enrique Barrantes Barrantes','(+506) 6107-1331 / ','Los Ángeles, Grecia','2017-07-24',158000,20540,178540,1,'','2017-05-21'),(27,'Danny Rojas Vargas','(+506) 8850-3409 / ','El Rosario, Naranjo','2017-07-24',189000,24570,213570,1,'','2017-05-23'),(28,'Elías Vargas Solís','(+506) 8890-6125 / ','Guatuso, Alajuela','2017-07-24',340000,44200,384200,1,'','2017-05-25'),(29,'Maikol Corrales Varela','(+506) 8809-0555 / ','San Ramón','2017-07-24',209000,27170,236170,1,'','2017-05-27'),(30,'Eddy Hernández Jiménez','(+506) 8827-7696 / ','Dulce Nombre, Naranjo','2017-07-24',320200,41626,361826,1,'','2017-05-29'),(31,'Alvaro Adelso Campos Ugalde','(+506) 2454-4774 / ','Sarchí Sur','2017-07-24',313000,40690,353690,1,'','2017-05-31'),(33,'Propiedades Roko S.A','(+506) 2444-8761 / ','Rincón de Salas','2017-07-24',125000,16250,141250,1,'','2017-06-02'),(34,'Chavez y Quesada','','Tacares','2017-07-24',126000,16380,142380,1,'','2017-06-04'),(36,'Danny Rojas Vargas','(+506) 8850-3409 / ','El Rosario, Naranjo','2017-07-24',396000,51480,447480,1,'','2017-06-06'),(38,'Follajes Telon SA','(+506) 2435-8000 / ','Sabana Redonda, Poás','2017-07-24',442000,57460,499460,1,'','2017-06-08'),(40,'Chavez y Quesada','','Tacares','2017-07-24',900000,117000,1017000,1,'','2017-06-10'),(41,'El Triunfo Mercantil','(+506) 2443-2833 / ','Alajuela','2017-07-24',189800,24674,214474,1,'','2017-06-12'),(42,'Concretos del Poás','(+506) 8835-9261 / ','San Juan, Poás','2017-07-24',720000,93600,813600,1,'','2017-06-14'),(43,'Donald Oviedo Barrantes','(+506) 8833-0016 / ','Grecia','2017-07-24',92000,11960,103960,1,'','2017-06-16'),(44,'Fernando Nuñez Oviedo','(+506) 8856-4339 / ','Ciruelas, Alajuela','2017-07-24',140000,18200,158200,1,'','2017-06-18'),(45,'Dist Diroa','(+506) 8325-0231 / ','Lotes Murillo, Alajuela','2017-07-24',188000,24440,212440,1,'','2017-06-20'),(46,'Ivan Gutierrez Fallas','','San Rafael, Alajuela','2017-07-24',216000,28080,244080,1,'','2017-06-22'),(47,'Luis Vargas Vargas','(+506) 8349-5377 / ','Poasito','2017-07-24',231200,30056,261256,1,'','2017-06-24'),(48,'Gerardo Enrique Barrantes Barrantes','(+506) 6107-1331 / ','Los Ángeles, Grecia','2017-07-24',397000,51610,448610,1,'','2017-06-26'),(49,'Luis Gerardo Vargas Alvarado','(+506) 8854-4423 / ','Poasito','2017-07-24',244000,31720,275720,1,'','2017-06-28'),(50,'Henry González González','(+506) 8358-0155 / ','La Guacima','2017-07-24',116000,15080,131080,1,'','2017-06-30'),(51,'Olivier Vega','(+506) 2454-4182 / ','Sarchí Norte','2017-07-24',218000,28340,246340,1,'','2017-07-01'),(52,'Acarreos y Excavaciones Salazar','','San Rafael, Sarchí','2017-07-24',78000,10140,88140,1,'','2017-07-03'),(53,'Corporación Ind de Trans Patica','(+506) 8389-1257 / ','Turrucares','2017-07-24',56000,7280,63280,1,'','2017-07-05'),(54,'Leonel Salazar Corrales','(+506) 8813-2891 / ','Dulce Nombre, Naranjo','2017-07-24',384000,49920,433920,1,'','2017-07-07'),(56,'Rafael Araya Fuentes','(+506) 8842-6676 / ','Turrucares','2017-07-24',180000,23400,203400,1,'','2017-07-09'),(57,'Delicias leche y miel','(+506) 2458-3256 / ','Carillos','2017-07-24',156000,20280,176280,1,'','2017-07-09'),(58,'Juan Carlos Rojas Alvarado','(+506) 8878-7879 / ','Dulce Nombre, Naranjo','2017-10-07',260800,33904,294704,1,'','2017-07-09'),(59,'Chavez y Quesada','','Tacares','2017-07-24',54000,7020,61020,1,'','2017-07-09'),(61,'Rafael Araya Fuentes','(+506) 8842-6676 / ','Turrucares','2017-07-24',344000,44720,388720,1,'','2017-07-09'),(62,'Hernan Salazar Corrales','(+506) 2451-0972 / ','Dulce Nombre, Naranjo','2017-07-24',93000,12090,105090,1,'','2017-07-09'),(63,'Inversiones Soso','','N/A','2017-07-24',72000,9360,81360,1,'','2017-07-09'),(64,'Acarreos Avicolas Arfujo SA','(+506) 8341-7980 / ','Turrucares','2017-07-24',200000,26000,226000,1,'','2017-07-09'),(65,'Propiedades Roko S.A','(+506) 2444-8761 / ','Rincón de Salas','2017-07-24',75000,9750,84750,1,'','2017-07-09'),(66,'Donald Oviedo Barrantes','(+506) 8833-0016 / ','Grecia','2017-07-24',1456620,189360.6,1645980.6,1,'','2017-07-09'),(68,'Ivan Gutierrez Fallas','','San Rafael, Alajuela','2017-07-24',274200,35646,309846,1,'','2017-07-09'),(69,'Carlos Eduardo Sanabria Sibaja','(+506) 7114-9765 / ','Tambor, Alajuela','2017-07-24',1100000,143000,1243000,1,'','2017-07-09'),(70,'Alquileres Kepa','(+506) 2494-4155 / ','Grecia','2017-07-24',30000,3900,33900,1,'','2017-07-09'),(71,'Propiedades Roko S.A','(+506) 2444-8761 / ','Rincón de Salas','2017-07-24',528000,68640,596640,1,'','2017-07-09'),(72,'Miguel Chacón Pérez','(+506) 8766-6007 / ','Sarchí Sur','2017-07-24',77500,10075,87575,1,'','2017-07-09'),(73,'Miguel Chacón Pérez','(+506) 8766-6007 / ','Sarchí Sur','2017-07-24',200000,26000,226000,1,'','2017-07-09'),(74,'Alberto Muñoz Ramírez','(+506) 2451-1887 / (+506) 2454-3624 / ','Dulce Nombre, Naranjo','2017-08-08',101600,3458,105058,1,'204450788','2017-07-09');
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
  `Detalle` varchar(100) NOT NULL,
  `PrecioUnitario` double NOT NULL,
  `PrecioTotalLinea` double NOT NULL,
  PRIMARY KEY (`idLineaFactura`),
  KEY `fk_LineaFactura_1_idx` (`idFactura`),
  CONSTRAINT `fk_LineaFactura_1` FOREIGN KEY (`idFactura`) REFERENCES `Factura` (`idFactura`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LineaFactura`
--

LOCK TABLES `LineaFactura` WRITE;
/*!40000 ALTER TABLE `LineaFactura` DISABLE KEYS */;
INSERT INTO `LineaFactura` VALUES (1,1,0,'detalle#0',0,0),(2,1,1,'detalle#1',100,1000),(3,1,2,'detalle#2',200,2000),(4,1,3,'detalle#3',300,3000),(5,1,4,'detalle#4',400,4000),(6,1,5,'detalle#5',500,5000),(7,1,6,'detalle#6',600,6000),(8,1,7,'detalle#7',700,7000),(9,1,8,'detalle#8',800,8000),(10,1,9,'detalle#9',900,9000),(11,2,3,'Aro 15x8 Horizon 25hY',10000,30000),(12,2,2,'Aro 15x8 BBS LK5',500,1000),(13,3,1,'Aro 15x8 Horizon 25hY',1000,1000),(14,4,1,'Aro 20 BBS KJB4',10000,10000),(15,4,3,'Aro 15x8 BBS LK5',5000,15000),(16,5,1,'Aro 15x8 Horizon 25hY',10000,10000),(17,5,1,'Aro 26 PruebaBLIngresar PBLIn',50000,50000),(18,6,5,'Llanta Normal 205/70/14 Aeulos hn08',2500,12500),(19,7,5,'Llanta Normal 205/70/14 Aeulos hn08',2500,12500),(20,8,5,'Llanta Normal 205/70/14 Aeulos hn08',250000,1250000),(21,8,1,'Aro 15x8 Horizon 25hY',560000,560000),(22,9,5,'Llanta Normal 205/70/14 Aeulos hn08',455555,2277775),(23,9,4,'Aro 15 brigstone b15',25000,100000),(24,10,6,'Aro 15 Horizon KJ5',25000,150000),(25,11,6,'Llanta Normal 175/70R14 GT Radial 728GT',42000,252000),(26,12,1,'Aro 15x7 RZ L0802',2000,2000),(27,13,1,'Aro 15x7 RZ L0802',25000,25000),(28,13,4,'Llanta Normal 185/65/14 Ovation VI682',35000,140000),(29,13,2,'Aro 13x6 BBS L247',38000,76000),(30,13,2,'Llanta Normal 185/65/14 GT Radial 128GT',100000,200000),(31,13,1,'Aro 15x7 BBS 6x139.7',12000,12000),(32,13,1,'Aro 17x8 Orbital 6x139.7mm',15000,15000),(33,14,2,'Llanta Normal 185/70/14 Farroad FRD16',37000,74000),(34,14,4,'Llanta Normal 185/70/14 Westlake RP18',12000,48000),(35,14,1,'Aro 15x7.5 RZ L142',32000,32000),(36,15,2,'Aro 15x7 BBS L1405',50000,100000),(37,15,2,'Llanta Normal 700R16 Firestone CV5000',75000,150000),(38,15,2,'Llanta Normal 185R14 Antares SU810',60000,120000),(39,16,2,'Llanta Normal 750R15 Firestone CV5000',23000,46000),(40,16,4,'Llanta Normal 195R14 GT Radial Maximiler',28000,112000),(41,16,4,'Llanta Normal 205/55R16 GT Radial UHP1',32000,128000),(42,16,1,'Aro 13x5.5 RZ L821',12000,12000),(43,17,4,'Llanta Normal 175/65R14 Ovation VI682',52000,208000),(44,17,1,'Aro 15x8 Orbital 4x100mm',32000,32000),(45,18,1,'Aro 15x8 Orbital 4x100mm',80000,80000),(46,18,2,'Llanta Normal 225/60/16 GT Radial 128',60000,120000),(47,19,1,'Aro 15x7 Orbital 6x139.7mm',120000,120000),(48,19,2,'Llanta Normal 175/70/13 Ovation Vi682',55000,110000),(49,19,2,'Llanta Normal P185/60R15 GT Radial VP1',60000,120000),(50,20,2,'Llanta Normal 175/65R14 Ovation VI682',120000,240000),(51,20,2,'Llanta Industrial',450000,900000),(52,23,2,'Aro 15x7 RZ L0802',10000,20000),(53,23,2,'Llanta Normal 185/60/14 GT Radial 128GT',45000,90000),(54,23,4,'Aro 15x7 RZ L0802',26000,104000),(55,24,2,'Aro 15x7 Orbital 6x139.7mm',54000,108000),(56,24,4,'Llanta Normal 185/65/14 GT Radial 128GT',45000,180000),(57,24,1,'Aro 13x5.5 RZ L821',36000,36000),(58,25,2,'Llanta Normal 195/70/14 Ovation VI682',24000,48000),(59,25,2,'Llanta Normal 205/70/14 Ovation VI682',12000,24000),(60,25,2,'Aro 15x7 RZ L0802',37000,74000),(61,26,4,'Llanta Normal 185/60/14 GT Radial 128GT',39500,158000),(62,27,2,'Llanta Normal 185/65/14 GT Radial 128GT',52000,104000),(63,27,1,'Aro 17x8.5 RZ L867',85000,85000),(64,28,4,'Llanta Normal 185/65/14 Ovation VI682',45000,180000),(65,28,2,'Llanta Normal 175/65R14 Ovation VI682',15000,30000),(66,28,2,'Aro 14 RZ L068',65000,130000),(67,29,2,'Llanta Normal 195/45R15 Wanli S1088Y',43500,87000),(68,29,2,'Llanta Normal LT235/75R15 Westlake SL366 MT',61000,122000),(69,30,4,'Llanta Normal 185/70/14 Farroad FRD16',66000,264000),(70,30,1,'Aro 13x6 BBS L247',56200,56200),(71,31,4,'Llanta Normal 265/70/16 Ovation VI286 HT',35000,140000),(72,31,4,'Llanta Normal 185/70/13 Ovation VI682',22000,88000),(73,31,2,'Llanta Normal 195R14 Westlake SC301',42500,85000),(74,33,1,'Aro 15x8 BBS N/A',53000,53000),(75,33,2,'Llanta Normal 185/65/14 GT Radial 128GT',36000,72000),(76,34,2,'Llanta Normal 185/65/14 GT Radial 128GT',63000,126000),(77,36,4,'Llanta Normal 205/55R16 GT Radial UHP1',99000,396000),(78,38,2,'Llanta Normal 265/70/16 Ovation VI286 HT',80000,160000),(79,38,1,'Aro 15x7 Orbital 4x100',88000,88000),(80,38,2,'Llanta Normal 185/70/14 Farroad FRD16',64000,128000),(81,38,1,'Aro 16x8 Orbital 5x114.3mm',66000,66000),(82,40,2,'Llanta Normal 195R14 GT Radial Maximiler',450000,900000),(83,41,2,'Aro 15x7 BBS 6x139.7',56000,112000),(84,41,2,'Aro 15x7 BBS 6x139.7',38900,77800),(85,42,8,'Llanta Normal 750R15 Firestone CV5000',90000,720000),(86,43,2,'Aro 15x7 RZ L002',46000,92000),(87,44,2,'Aro 17x8 Orbital 6x139.7mm',45000,90000),(88,44,2,'Aro 15x7 RZ L0802',25000,50000),(89,45,4,'Llanta Normal 265/70/16 Ovation VI286 HT',47000,188000),(90,46,4,'Llanta Normal 195/50/15 Wanli S1088Y',54000,216000),(91,47,8,'Llanta Normal 195R14 GT Radial Maximiler',28900,231200),(92,48,4,'Llanta Normal 225/70R16 GT Radial HTII',52000,208000),(93,48,3,'Llanta Normal 195/50/15 Wanli S1088Y',63000,189000),(94,49,4,'Llanta Normal 205/70/15 Westlake SL366 MT',36000,144000),(95,49,4,'Llanta Normal 185/70/14 Farroad FRD16',25000,100000),(96,50,4,'Llanta Normal 185/70/14 Westlake RP18',29000,116000),(97,51,2,'Aro 15x7 RZ L002',46000,92000),(98,51,2,'Llanta Normal 175/65R14 Ovation VI682',63000,126000),(99,52,1,'Aro 15x8 Orbital 114.3mm',78000,78000),(100,53,2,'Llanta Normal 235/70/16 Ecovision VI286 AT',28000,56000),(101,54,4,'Llanta Normal 205/55R16 GT Radial UHP1',96000,384000),(102,56,4,'Llanta Normal P215/70R16 GT Radial HTII',45000,180000),(103,57,2,'Llanta Normal 31x105R15 GT Radial MT',78000,156000),(104,58,2,'Aro 13x5.5 RZ L821',26700,53400),(105,58,2,'Aro 15x7 BBS L1405',25300,50600),(106,58,2,'Aro 17 RZ 10x100',27000,54000),(107,58,4,'Aro 14 RZ L068',25700,102800),(108,59,2,'Llanta Normal P185/60R15 GT Radial VP1',27000,54000),(109,61,2,'Aro 15x7 RZ L0802',25000,50000),(110,61,14,'Aro 14 RZ L068',21000,294000),(111,62,3,'Aro 13x5.5 RZ L821',31000,93000),(112,63,2,'Llanta Normal 205R14 Ovation V02',36000,72000),(113,64,4,'Aro 15x7.5 RZ L142',50000,200000),(114,65,6,'Aro 16x8 Orbital 6x139.7mm',12500,75000),(115,66,4,'Llanta Normal 225/70/15 Ovation V-02',28000,112000),(116,66,6,'Llanta Normal 185R14 Antares SU810',67770,406620),(117,66,8,'Aro 13x6 BBS L247',78000,624000),(118,66,6,'Aro 15x7 Orbital 4x100mm',19000,114000),(119,66,2,'Llanta Normal 225/60/16 GT Radial 128',28000,56000),(120,66,4,'Llanta Normal 195R14 Ovation V02',36000,144000),(121,68,6,'Llanta Normal 175/70R13 Continental ContiPowerContact',45700,274200),(122,69,1,'Aro 15x7.5 RZ L142',250000,250000),(123,69,4,'Llanta Normal 195/50/15 Wanli S1088Y',175000,700000),(124,69,2,'Llanta Normal 195/50R15 Ovation VI682',75000,150000),(125,70,1,'Llanta Normal 185/60/15 Ovation VI682',5000,5000),(126,70,1,'Aro 17x8.5 RZ L867',25000,25000),(127,71,2,'Llanta Normal 205R14 Ovation V02',100000,200000),(128,71,1,'Aro 15x7 BBS 6x139.7',150000,150000),(129,71,2,'Llanta Normal 205/70/15 Ovation VI682',89000,178000),(130,72,1,'Llanta Normal P215/70R16 GT Radial HTII',75000,75000),(131,72,1,'Llanta Normal 195/70/14 Ovation VI682',2500,2500),(132,73,1,'Aro 15x7 BBS L1405',50000,50000),(133,73,2,'Llanta Normal 195/50R15 Ovation VI682',75000,150000),(134,74,2,'Llanta Normal 195R14 Westlake SC301',2500,5000),(135,74,3,'LLanta Agricola Aeulus 11R22.5 HN08',25000,75000),(136,74,4,'Llanta Normal 205/55R16 GT Radial UHP1',5400,21600);
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
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Llanta`
--

LOCK TABLES `Llanta` WRITE;
/*!40000 ALTER TABLE `Llanta` DISABLE KEYS */;
INSERT INTO `Llanta` VALUES (8,'175/70R14','GT Radial','728GT','0',0,'Normal'),(9,'185/60/14','GT Radial','128GT','0',2,'Normal'),(10,'185/65/14','GT Radial','128GT','0',2,'Normal'),(11,'185/65/14','Ovation','VI682','0',4,'Normal'),(12,'185/70/14','Farroad','FRD16','0',2,'Normal'),(13,'185/70/14','Westlake','RP18','0',4,'Normal'),(14,'195/70/14','Ovation','VI682','0',4,'Normal'),(15,'185R14','Antares','SU810','0',2,'Normal'),(16,'185R14','Ovation','V02','8',4,'Normal'),(17,'195R14','Westlake','SC301','8',0,'Normal'),(19,'195R14','GT Radial','Maximiler','8',4,'Normal'),(20,'205/70/14','Ovation','VI682','0',2,'Normal'),(21,'205R14','Ovation','V02','8',2,'Normal'),(22,'185/55R15','Ovation','VI682','0',4,'Normal'),(23,'185/60/15','Ovation','VI682','0',1,'Normal'),(24,'P185/60R15','GT Radial','VP1','0',4,'Normal'),(25,'185/65/15','GT Radial','Champiro VP-1','0',2,'Normal'),(26,'185/65/15','Ovation','VI-182','0',4,'Normal'),(27,'195/45R15','Wanli','S1088Y','0',4,'Normal'),(28,'195/50R15','Ovation','VI682','0',8,'Normal'),(29,'195/50/15','Wanli','S1088Y','0',3,'Normal'),(30,'195/65/15','Ovation','VI682','0',6,'Normal'),(31,'195R15','Ovation','V-02','8',6,'Normal'),(32,'205/60R15','Ovation','VI682','0',2,'Normal'),(33,'205/60/15','GT Radial','VP1','0',4,'Normal'),(34,'205/70/15','Ovation','VI682','0',0,'Normal'),(35,'P205/70R15','GT Radial','VP1','0',8,'Normal'),(36,'205/70/15','Westlake','SL366 MT','6',4,'Normal'),(37,'215/70/15','Ovation','VI-682','0',4,'Normal'),(39,'225/70/15','Ovation','V-02','8',6,'Normal'),(40,'LT235/75R15','Westlake','SL366 MT','6',8,'Normal'),(42,'LT235/75R15','Ovation','VI-186 AT','6',4,'Normal'),(43,'30x9.5R15','GT Radial','Adventuro AT','0',4,'Normal'),(44,'31x105R15','Ovation','VI-286 AT','6',0,'Normal'),(45,'31x105R15','Ovation','VI-186 MT','0',6,'Normal'),(46,'31x105R15','GT Radial','MT','0',6,'Normal'),(47,'33x12.5R15','GT Radial','MT','6',4,'Normal'),(48,'700R15','GT Radial','Traveler 668','10',4,'Normal'),(49,'700R15','Westlake','ST313','10',4,'Normal'),(50,'750-15','Westlake','CR852','12',2,'Normal'),(51,'750R15','Firestone','CV5000','10',2,'Normal'),(52,'205/55R16','GT Radial','UHP1','0',0,'Normal'),(53,'P215/70R16','GT Radial','HTII','0',3,'Normal'),(54,'225/60/16','GT Radial','128','0',4,'Normal'),(55,'225/70R16','GT Radial','HTII','0',6,'Normal'),(57,'235/70/16','Ecovision','VI286 AT','0',2,'Normal'),(58,'265/70/16','Ovation','VI286 HT','0',0,'Normal'),(59,'LT265/75R16','GT Radial','Adventuro MT','10',4,'Normal');
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (2,'michael','mike','Administrador'),(7,'alberto','alberto','Estandar'),(8,'kenneth','kenneth','Estandar');
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

-- Dump completed on 2017-08-01 17:31:18
