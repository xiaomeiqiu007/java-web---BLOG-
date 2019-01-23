# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.19)
# Database: blog
# Generation Time: 2018-12-27 04:41:57 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table blog_table
# ------------------------------------------------------------

DROP TABLE IF EXISTS `blog_table`;

CREATE TABLE `blog_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL,
  `tag` int(11) DEFAULT NULL,
  `content` text,
  `lasttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(4) DEFAULT NULL,
  `readnum` int(11) DEFAULT NULL,
  `good` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `blog_table` WRITE;
/*!40000 ALTER TABLE `blog_table` DISABLE KEYS */;

INSERT INTO `blog_table` (`id`, `title`, `tag`, `content`, `lasttime`, `status`, `readnum`, `good`, `uid`)
VALUES
	(1,'hello',2,'1234567','2018-12-27 12:41:19',1,0,0,1),
	(2,'890',3,'ghjkl','2018-12-27 12:41:22',1,0,0,1),
	(3,'asdfasdfas',6,'asdfasf','2018-12-27 12:41:23',1,0,0,1),
	(4,'pinads',5,'减0','2018-12-27 12:41:24',1,0,0,1),
	(5,'历史的天空',4,'被人遗忘的历史','2018-12-27 12:41:28',1,0,0,1),
	(6,'hello',1,'历史的天空','2018-12-27 12:41:33',1,0,0,1),
	(7,'热门',1,'热门博客','2018-12-27 12:41:35',1,0,0,1);

/*!40000 ALTER TABLE `blog_table` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table tag_table
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tag_table`;

CREATE TABLE `tag_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tag_title` varchar(20) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `tag_table` WRITE;
/*!40000 ALTER TABLE `tag_table` DISABLE KEYS */;

INSERT INTO `tag_table` (`id`, `tag_title`, `status`)
VALUES
	(1,'热门',1),
	(2,'娱乐',1),
	(3,'科技',1),
	(4,'历史',1),
	(5,'军事',1),
	(6,'电影',1),
	(7,'体育',1);

/*!40000 ALTER TABLE `tag_table` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_table
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_table`;

CREATE TABLE `user_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `nickname` varchar(15) DEFAULT NULL,
  `email` varchar(26) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
