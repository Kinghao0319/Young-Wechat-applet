/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : wxdemo

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2020-06-20 11:25:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `place` varchar(255) default NULL,
  `time` varchar(255) default NULL,
  `maxnum` int(8) default NULL,
  `description` varchar(255) default NULL,
  `imgpath` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES ('2', '学习五十音', '2020/01/20', '你猜', '200', '真好', 'E:\\IEDA_sr\\helloworld\\wxdemo/src/main/resources/static/img/2167五十音图.jpg');
INSERT INTO `activity` VALUES ('3', '再次学习五十音', '2098', 'hhh', '12', '真好', '2690五十音图.jpg');
INSERT INTO `activity` VALUES ('4', '1', '1', '1', '1', '1', '5850五十音图.jpg');
INSERT INTO `activity` VALUES ('5', '1', '1', '1', '1', '1', '5463五十音图.jpg');
INSERT INTO `activity` VALUES ('6', 'hello', '1', '1', '1', '1', '8512asc2表.jpg');
INSERT INTO `activity` VALUES ('7', 'hello', '1', '1', '1', '1', '7239asc2表.jpg');
INSERT INTO `activity` VALUES ('8', 'hello', '1', '1', '1', '1', '9359asc2表.jpg');
INSERT INTO `activity` VALUES ('9', 'hello', '1', '1', '200', '1', '77172020春季课表.jpg');
INSERT INTO `activity` VALUES ('10', 'hello', '1', '1', '200', '1', '38482020春季课表.jpg');
INSERT INTO `activity` VALUES ('11', 'hello', '1', '1', '200', '1', '40672020春季课表.jpg');
INSERT INTO `activity` VALUES ('12', 'hello', '1', '1', '200', '真好', '32182020春季课表.jpg');
INSERT INTO `activity` VALUES ('13', 'hello', '1', '1', '200', '1', '87692020春季课表.jpg');

-- ----------------------------
-- Table structure for display1
-- ----------------------------
DROP TABLE IF EXISTS `display1`;
CREATE TABLE `display1` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `icon` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of display1
-- ----------------------------
INSERT INTO `display1` VALUES ('1', 'honghong', null);

-- ----------------------------
-- Table structure for display2
-- ----------------------------
DROP TABLE IF EXISTS `display2`;
CREATE TABLE `display2` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `icon` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of display2
-- ----------------------------

-- ----------------------------
-- Table structure for display3
-- ----------------------------
DROP TABLE IF EXISTS `display3`;
CREATE TABLE `display3` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `icon` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of display3
-- ----------------------------

-- ----------------------------
-- Table structure for official
-- ----------------------------
DROP TABLE IF EXISTS `official`;
CREATE TABLE `official` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `icon` varchar(255) default NULL,
  `hotnum` int(8) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of official
-- ----------------------------
INSERT INTO `official` VALUES ('1', 'xiaoming', 'hhh', null, '0');

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `id` int(3) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `icon` varchar(255) default NULL,
  `hotnum` int(8) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES ('1', '桌游社', '大家一起玩桌游', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579448155599&di=b839eaffa399a374c75460a530acc40b&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D672563365%2C60458630%26fm%3D214%26gp%3D0.jpg', '500');
INSERT INTO `organization` VALUES ('2', '话剧社', '唱话剧很有意思', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579448234719&di=85b60db47a6652806e238c8b62c82ee8&imgtype=0&src=http%3A%2F%2Fp0.so.qhimgs1.com%2Ft01195f882a1e391b9c.jpg', '300');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(3) NOT NULL auto_increment,
  `wxid` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `gender` int(2) default NULL,
  `email` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'whsu', null, '0', null, null);
INSERT INTO `user` VALUES ('3', 'whsu23', null, '0', null, null);
INSERT INTO `user` VALUES ('4', 'yyy', null, '0', null, '23');
INSERT INTO `user` VALUES ('5', 'xxx', null, '0', null, null);
