/*
 Navicat Premium Data Transfer

 Source Server         : 10.80.253.16_mysql
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 10.80.253.16:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 27/06/2020 16:33:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_users
-- ----------------------------
DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE `tb_users`  (
  `id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_users
-- ----------------------------
INSERT INTO `tb_users` VALUES (1, 'admin', '123');

SET FOREIGN_KEY_CHECKS = 1;
