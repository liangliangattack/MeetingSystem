/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : mobilemeeting

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-05-16 15:48:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `friend_id` int(11) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('1', '2', '1');
INSERT INTO `friend` VALUES ('2', '3', '1');
INSERT INTO `friend` VALUES ('3', '4', '1');

-- ----------------------------
-- Table structure for invitation
-- ----------------------------
DROP TABLE IF EXISTS `invitation`;
CREATE TABLE `invitation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `init_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of invitation
-- ----------------------------
INSERT INTO `invitation` VALUES ('1', '1', '2', '2019-04-01 15:34:02');
INSERT INTO `invitation` VALUES ('2', '1', '3', '2019-05-16 15:36:23');
INSERT INTO `invitation` VALUES ('3', '1', '4', '2019-05-11 15:36:48');

-- ----------------------------
-- Table structure for meeting
-- ----------------------------
DROP TABLE IF EXISTS `meeting`;
CREATE TABLE `meeting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_title` varchar(255) DEFAULT NULL,
  `meeting_content` varchar(700) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `createby_id` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting
-- ----------------------------
INSERT INTO `meeting` VALUES ('1', 'g20峰会', '律回春晖渐，万象始更新。2月8日宁波惠康实业以“不忘初心，砥砺前行，幸福都是奋斗出来的”为主题的2017年度总结表彰大会暨迎春联欢酒会在泗门宾馆隆重举行，惠康集团董事长、监事长、惠康实业陈越增董事长等领导与全体员工欢聚一堂，共度新春佳节。2017年表现突出的优秀团队和先进个人进行了表彰，颁发了年度优秀经理人、先进部门、先进班组、先进工作者,迎春联欢酒会在欢乐喜庆的舞蹈中拉开序幕，随着幸运奖、三等奖、二等奖、一等奖抽取，不断掀起年会的高潮。迎春联欢酒会不仅给大家带来了欢声笑语，同时也让同事之间彼此的心更加贴近。公司领导与员工亲情互动、相互敬酒、激动人心的抽奖活动，让歌声、掌声、欢呼声一直在会场上荡漾，呈现出惠康这个大家庭的欢乐和谐。', '2018-02-09 15:31:57', '1', '100', '', '4308');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'liang', '123', '男', 'http', '123');
INSERT INTO `user` VALUES ('2', 'mm', '123', '女', 'http', '123');
INSERT INTO `user` VALUES ('3', 'ppp', '123', '男', 'htpp', '123');
INSERT INTO `user` VALUES ('4', 'll', '123', '男', 'http', '123');
