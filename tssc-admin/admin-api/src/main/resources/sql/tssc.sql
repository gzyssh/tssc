/*
 Navicat Premium Data Transfer

 Source Server         : 本机库
 Source Server Type    : MySQL
 Source Server Version : 50525
 Source Host           : localhost:3306
 Source Schema         : tssc

 Target Server Type    : MySQL
 Target Server Version : 50525
 File Encoding         : 65001

 Date: 24/06/2019 10:18:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `a_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键ID',
  `a_uname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `a_pwd` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`a_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `bid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `bname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书名称',
  `author` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者',
  `price` decimal(8, 2) NULL DEFAULT NULL COMMENT '定价',
  `curr_price` decimal(8, 2) NULL DEFAULT NULL COMMENT '售价',
  `discount` decimal(3, 1) NULL DEFAULT NULL COMMENT '折扣',
  `press` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出版社',
  `publish_time` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出版时间',
  `edition` int(11) NULL DEFAULT NULL COMMENT '版次',
  `page_num` int(11) NULL DEFAULT NULL COMMENT '页数',
  `word_num` int(11) NULL DEFAULT NULL COMMENT '字数',
  `print_time` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '印刷时间',
  `booksize` int(11) NULL DEFAULT NULL COMMENT '开本',
  `paper` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纸质',
  `cid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类ID',
  `image_w` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '大图',
  `image_b` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小图',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `creater` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`bid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图书表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_cartitem
-- ----------------------------
DROP TABLE IF EXISTS `t_cartitem`;
CREATE TABLE `t_cartitem`  (
  `ct_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `quantity` int(11) NULL DEFAULT NULL COMMENT '数量',
  `bid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书ID',
  `uid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`ct_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category`  (
  `c_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `cname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `pid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父分类ID',
  `desc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类描述',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分类表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `o_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `o_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下单时间',
  `total` decimal(10, 2) NULL DEFAULT NULL COMMENT '总计',
  `status` int(11) NULL DEFAULT NULL COMMENT '订单状态 0:未付款  1:已付款未发货  2:已发货未确认收货  3:确认收货交易成功 4:已取消',
  `address` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货地址',
  `uid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `t_orderitem`;
CREATE TABLE `t_orderitem`  (
  `ot_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `quantity` int(11) NULL DEFAULT NULL COMMENT '数量',
  `subtotal` decimal(8, 2) NULL DEFAULT NULL COMMENT '小计',
  `bid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书ID',
  `bname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图书名称',
  `curr_price` decimal(8, 2) NULL DEFAULT NULL COMMENT '售价',
  `image_b` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小图',
  `oid` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单ID',
  PRIMARY KEY (`ot_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单条目表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `u_id` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '状态 0：未删除  1：已删除',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `creater` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
