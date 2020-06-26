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

 Date: 26/06/2020 20:55:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_settlement
-- ----------------------------
DROP TABLE IF EXISTS `tb_settlement`;
CREATE TABLE `tb_settlement`  (
  `order_id` bigint(20) NOT NULL,
  `settlement_id` bigint(20) NULL DEFAULT NULL,
  `shop_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `order_time` timestamp(0) NULL DEFAULT NULL,
  `billing_time` timestamp(0) NULL DEFAULT NULL,
  `settlement_time` timestamp(0) NULL DEFAULT NULL,
  `order_price` decimal(10, 2) NULL DEFAULT NULL,
  `platform_allowance_price` decimal(10, 2) NULL DEFAULT NULL,
  `commission_money` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
