/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.6.16 : Database - db_teman
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_teman` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_teman`;

/*Table structure for table `tbl_teman` */

DROP TABLE IF EXISTS `tbl_teman`;

CREATE TABLE `tbl_teman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `nope` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `alamat` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_teman` */

insert  into `tbl_teman`(`id`,`nama`,`nope`,`email`,`alamat`) values (1,'Sanriomi Sintaro','08992277917','kumpultugas@mail.com','Jalan Alam Gaya');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
