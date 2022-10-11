/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.27 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `ssm`;

/*Table structure for table `t_employee` */

DROP TABLE IF EXISTS `t_employee`;

CREATE TABLE `t_employee` (
  `emp_id` int NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `emp_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '员工姓名',
  `age` int DEFAULT NULL COMMENT '员工邮箱',
  `sex` char(1) DEFAULT NULL COMMENT '员工性别 1 男 0 女',
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=170 DEFAULT CHARSET=utf8mb3;

/*Data for the table `t_employee` */

insert  into `t_employee`(`emp_id`,`emp_name`,`age`,`sex`,`email`) values (132,'nmu',32,'男','nmu@qq.com'),(133,'hcv',26,'女','hcv@qq.com'),(134,'lkb',22,'男','lkb@qq.com'),(135,'tyr',57,'女','tyr@qq.com'),(136,'kdr',95,'女','kdr@qq.com'),(137,'lyh',48,'男','lyh@qq.com'),(144,'sym',46,'男','sym@qq.com'),(145,'qjo',38,'女','qjo@qq.com'),(146,'jsu',41,'男','jsu@qq.com'),(149,'atg',57,'男','atg@qq.com'),(152,'rnb',28,'女','rnb@qq.com'),(153,'rxs',15,'女','rxs@qq.com'),(154,'bpu',35,'男','bpu@qq.com'),(155,'qud',81,'男','qud@qq.com'),(156,'aas',79,'男','aas@qq.com'),(157,'xxo',82,'男','xxo@qq.com'),(158,'fuy',65,'女','fuy@qq.com'),(165,'ysx',18,NULL,'test@qq.com'),(166,'test111',18,'男','test111@qq.com'),(167,'test1111',18,'男','test@qq.com'),(168,'test2222',18,'男','test@qq.com'),(169,'test2222222',18,'男','test@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
