/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : mobilemeeting

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-05-16 13:05:04
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
  `id` int(11) NOT NULL,
  `meeting_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `init_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of invitation
-- ----------------------------

-- ----------------------------
-- Table structure for meeting
-- ----------------------------
DROP TABLE IF EXISTS `meeting`;
CREATE TABLE `meeting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meeting_title` varchar(255) DEFAULT NULL,
  `meeting_content` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `createby_id` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting
-- ----------------------------

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
