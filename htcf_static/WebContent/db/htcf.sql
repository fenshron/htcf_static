/*
SQLyog v10.2 
MySQL - 5.1.42-community : Database - hfdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`htcf` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `htcf`;

/*Table structure for table `manage` */

DROP TABLE IF EXISTS `manage`;

CREATE TABLE `manage` (
  `manageId` int(11) NOT NULL AUTO_INCREMENT,
  `manageName` varchar(60) DEFAULT NULL,
  `managePwd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`manageId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `manage` */

LOCK TABLES `manage` WRITE;

insert  into `manage`(`manageId`,`manageName`,`managePwd`) values (1,'admin','000000');

UNLOCK TABLES;

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `userName` varchar(45) DEFAULT NULL COMMENT '用户名称',
  `userPhone` varchar(20) DEFAULT NULL COMMENT '用户电话',
  `userEmail` varchar(60) DEFAULT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `userinfo` */

LOCK TABLES `userinfo` WRITE;

insert  into `userinfo`(`userId`,`userName`,`userPhone`,`userEmail`) values (1,'张三','13762365884','13762365884@163.com'),(2,'李四','13525456666','13525456666@163.com'),(3,'rrr','2222','www'),(4,'777777','777777','777777'),(5,'966','55555','5555'),(6,'111111','111111','111111'),(7,'111111','111111','111111'),(8,'jjjjjkjkjkkjjkhjkh','56465465','65465465'),(21,'长大的','16546546546','5465465');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
