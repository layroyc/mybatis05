/*
 Navicat Premium Data Transfer

 Source Server         : lxytjy
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : citys

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 10/09/2021 17:49:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cantonal
-- ----------------------------
DROP TABLE IF EXISTS `cantonal`;
CREATE TABLE `cantonal`  (
  `qid` int(11) NOT NULL,
  `cid` int(11) DEFAULT NULL,
  `qname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`qid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cantonal
-- ----------------------------
INSERT INTO `cantonal` VALUES (1, 2, '宛城区', '中国', '河南省的');
INSERT INTO `cantonal` VALUES (2, 1, '金水区', '中国', '俺河南省');
INSERT INTO `cantonal` VALUES (3, 4, '合川区', '中国', '四川省');
INSERT INTO `cantonal` VALUES (4, 1, '管城回族区', '中国', '河南省');
INSERT INTO `cantonal` VALUES (5, 1, '二七区', '中国', '河南那疙瘩');
INSERT INTO `cantonal` VALUES (6, 2, '卧龙区', '中国', '河南省');
INSERT INTO `cantonal` VALUES (7, 5, '淮滨县', '中国', '河南的');
INSERT INTO `cantonal` VALUES (8, 1, '中原区', '中国', '河南省');
INSERT INTO `cantonal` VALUES (9, 6, '青山区', '中国', '湖北省');

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `cid` int(11) NOT NULL,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `csk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '城市备注',
  `personCount` int(255) DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, '郑州', '人都说好啊', 55555);
INSERT INTO `city` VALUES (2, '南阳', '风景还不错啊', 1905);
INSERT INTO `city` VALUES (3, '洛阳', '龙门石窟好啊', 27836);
INSERT INTO `city` VALUES (4, '重庆', '九宫格火锅真好吃', 6756666);
INSERT INTO `city` VALUES (5, '信阳', '哪的人啊', 68376);
INSERT INTO `city` VALUES (6, '武汉', '热干面呐', 1257654);

SET FOREIGN_KEY_CHECKS = 1;
