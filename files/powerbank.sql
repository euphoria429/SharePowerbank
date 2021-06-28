/*
Navicat MySQL Data Transfer

Source Server         : 本地连接
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : powerbank

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2021-06-28 14:40:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_account` varchar(16) NOT NULL COMMENT '管理员账号',
  `admin_password` varchar(32) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`),
  UNIQUE KEY `adminAccount` (`admin_account`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456');
INSERT INTO `admin` VALUES ('2', 'admin2', '123456');

-- ----------------------------
-- Table structure for cupboard
-- ----------------------------
DROP TABLE IF EXISTS `cupboard`;
CREATE TABLE `cupboard` (
  `cupboard_id` int(11) NOT NULL COMMENT '充电柜id',
  `location_id` int(11) DEFAULT NULL COMMENT '定位id',
  `pobk_num` int(11) DEFAULT NULL COMMENT '电宝数量',
  `pobk_available_num` int(11) DEFAULT NULL COMMENT '电宝可用数量',
  PRIMARY KEY (`cupboard_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cupboard
-- ----------------------------
INSERT INTO `cupboard` VALUES ('1', '1', '6', '4');
INSERT INTO `cupboard` VALUES ('2', '2', '6', '6');
INSERT INTO `cupboard` VALUES ('3', '3', '5', '5');

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `location_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址id',
  `location_city` varchar(16) NOT NULL COMMENT '城市',
  `location_district` varchar(16) NOT NULL COMMENT '区',
  `location_address` varchar(64) NOT NULL COMMENT '街道',
  `location_alias` varchar(32) NOT NULL COMMENT '地址名',
  `location_amount` int(11) unsigned zerofill DEFAULT NULL COMMENT '充电柜数量',
  PRIMARY KEY (`location_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES ('1', '广州市', '番禺区', '小谷围街道广东药科大学生活区4栋', '4栋', '00000000001');
INSERT INTO `location` VALUES ('2', '广州市', '番禺区', '小谷围街道广东药科大学生活区6栋', '6栋', '00000000001');
INSERT INTO `location` VALUES ('3', '广州市', '番禺区', '小谷围街道广东药科大学生活区8栋', '8栋', '00000000001');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_userid` int(11) DEFAULT NULL,
  `order_pobkid` int(11) DEFAULT NULL,
  `order_createtime` varchar(255) DEFAULT NULL,
  `order_finishtime` varchar(255) DEFAULT NULL,
  `order_cost` int(10) DEFAULT NULL,
  `order_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('2', '1', '3', '2021-06-21 13:18:14', '2021-06-21 14:18:17', '3', '已支付');
INSERT INTO `orders` VALUES ('5', '1', '2', '2021-06-25 00:02:23', '2021-06-25 21:33:57', '21', '已支付');
INSERT INTO `orders` VALUES ('47', '1', '3', '2021-06-26 14:51:32', '2021-06-26 17:38:38', '3', '已支付');
INSERT INTO `orders` VALUES ('48', '1', '2', '2021-06-26 14:54:01', '2021-06-26 17:38:46', '3', '已支付');
INSERT INTO `orders` VALUES ('49', '1', '7', '2021-06-26 14:54:05', '2021-06-26 17:38:46', '3', '已支付');
INSERT INTO `orders` VALUES ('50', '1', '1', '2021-06-26 18:22:45', '2021-06-26 17:38:46', '3', '已支付');
INSERT INTO `orders` VALUES ('51', '1', '2', '2021-06-26 18:22:48', '2021-06-26 17:38:46', '3', '已支付');
INSERT INTO `orders` VALUES ('52', '1', '3', '2021-06-26 18:22:51', '2021-06-26 17:38:46', '3', '已支付');
INSERT INTO `orders` VALUES ('53', '6', '6', '2021-06-26 21:16:13', null, null, '未归还');
INSERT INTO `orders` VALUES ('54', '1', '1', '2021-06-27 14:17:58', '2021-06-27 14:45:38', '1', '已支付');
INSERT INTO `orders` VALUES ('55', '1', '7', '2021-06-27 14:48:51', '2021-06-27 14:58:32', '1', '已支付');
INSERT INTO `orders` VALUES ('56', '1', '7', '2021-06-27 21:13:41', null, null, '未归还');

-- ----------------------------
-- Table structure for powerbank
-- ----------------------------
DROP TABLE IF EXISTS `powerbank`;
CREATE TABLE `powerbank` (
  `pobk_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电宝id',
  `pobk_cupboard_id` int(11) DEFAULT NULL COMMENT '所在柜id',
  `pobk_status` varchar(255) NOT NULL DEFAULT 'available' COMMENT '租借状态',
  PRIMARY KEY (`pobk_id`),
  KEY `pobk_location_key` (`pobk_cupboard_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of powerbank
-- ----------------------------
INSERT INTO `powerbank` VALUES ('1', '2', 'available');
INSERT INTO `powerbank` VALUES ('2', '2', 'available');
INSERT INTO `powerbank` VALUES ('3', '2', 'available');
INSERT INTO `powerbank` VALUES ('4', '0', 'recycle');
INSERT INTO `powerbank` VALUES ('5', '0', 'recycle');
INSERT INTO `powerbank` VALUES ('6', '0', 'lent');
INSERT INTO `powerbank` VALUES ('7', '0', 'lent');
INSERT INTO `powerbank` VALUES ('8', '2', 'available');
INSERT INTO `powerbank` VALUES ('9', '0', 'recycle');
INSERT INTO `powerbank` VALUES ('10', '2', 'available');
INSERT INTO `powerbank` VALUES ('11', '1', 'available');
INSERT INTO `powerbank` VALUES ('12', '3', 'available');
INSERT INTO `powerbank` VALUES ('13', '3', 'available');
INSERT INTO `powerbank` VALUES ('14', '3', 'available');
INSERT INTO `powerbank` VALUES ('15', '3', 'available');
INSERT INTO `powerbank` VALUES ('17', '1', 'available');
INSERT INTO `powerbank` VALUES ('18', '3', 'available');
INSERT INTO `powerbank` VALUES ('19', '2', 'available');
INSERT INTO `powerbank` VALUES ('20', '1', 'available');
INSERT INTO `powerbank` VALUES ('21', '0', 'recycle');
INSERT INTO `powerbank` VALUES ('22', '1', 'available');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户昵称',
  `user_phone` varchar(12) NOT NULL COMMENT '用户手机',
  `user_alias` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  `user_balance` float(11,0) unsigned zerofill DEFAULT NULL COMMENT '用户余额',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `userPhone` (`user_phone`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '17520098429', '弥音', '123456', '00000000097');
INSERT INTO `user` VALUES ('2', '16626713429', '风间', '123456', '00000000050');
INSERT INTO `user` VALUES ('3', '13545298844', '风间', '123456', '00000000050');
INSERT INTO `user` VALUES ('6', '166267134289', 'test2', '123456', '00000000005');
