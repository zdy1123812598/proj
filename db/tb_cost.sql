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

 Date: 26/06/2020 20:54:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_cost
-- ----------------------------
DROP TABLE IF EXISTS `tb_cost`;
CREATE TABLE `tb_cost`  (
  `order_id` bigint(20) NOT NULL,
  `payment_channel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `shop_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `order_payment_time` timestamp(0) NULL DEFAULT NULL,
  `order_completion_time` timestamp(0) NULL DEFAULT NULL,
  `platform_allowance_price` decimal(10, 2) NULL DEFAULT NULL,
  `platform_trading_fee` decimal(10, 2) NULL DEFAULT NULL,
  `total_cost` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
