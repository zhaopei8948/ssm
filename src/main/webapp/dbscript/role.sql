/*
Navicat MySQL Data Transfer

Source Server         : public_declaration
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : public_declaration

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2016-09-02 15:23:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '角色名称',
  `create_time` varchar(19) NOT NULL,
  `update_time` varchar(19) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('45882123cf424aeeb16670ae83d9fd13', 'staff', '2016-09-01 17:58:42', '2016-09-01 17:58:42');
INSERT INTO `role` VALUES ('7363e52258b442f39567ac25945ea2f8', 'superadmin', '2016-09-01 17:57:47', '2016-09-01 17:57:47');
INSERT INTO `role` VALUES ('87caf65565d7428f967dd7fdd7e6cc9b', 'supervisor', '2016-09-01 17:59:12', '2016-09-01 17:59:12');
INSERT INTO `role` VALUES ('9e303dbbdb384ed687b01b2c663415ab', 'groupleader', '2016-09-01 17:58:32', '2016-09-01 17:58:32');
INSERT INTO `role` VALUES ('ba97ad6bcfe24e438a316040fabc353f', 'admin', '2016-09-01 17:57:57', '2016-09-01 17:57:57');
INSERT INTO `role` VALUES ('cb8045dc58754718adf891e7a22651c3', 'submanager', '2016-09-01 17:58:12', '2016-09-01 17:58:12');
