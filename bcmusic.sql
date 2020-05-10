/*
 Navicat Premium Data Transfer

 Source Server         : www
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : bcmusic

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 20/04/2020 12:49:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for constractdetail
-- ----------------------------
DROP TABLE IF EXISTS `constractdetail`;
CREATE TABLE `constractdetail`  (
  `constract_detail_id` int(0) NOT NULL,
  `constract_id` int(0) NOT NULL,
  `Music_id` int(0) NOT NULL,
  `Auz_type` int(0) NULL DEFAULT NULL,
  `Auz_region` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Auz_duration` datetime(0) NULL DEFAULT NULL,
  `Price_per_day` double NULL DEFAULT NULL,
  `Expiration_time` datetime(0) NULL DEFAULT NULL,
  `Valid_status` tinyint(0) NULL DEFAULT NULL,
  `open_status` tinyint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`constract_detail_id`) USING BTREE,
  INDEX `constract_id`(`constract_id`) USING BTREE,
  INDEX `Music_id`(`Music_id`) USING BTREE,
  CONSTRAINT `constractdetail_ibfk_1` FOREIGN KEY (`constract_id`) REFERENCES `distributeconstract` (`constract_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `constractdetail_ibfk_2` FOREIGN KEY (`Music_id`) REFERENCES `music` (`music_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for distributeconstract
-- ----------------------------
DROP TABLE IF EXISTS `distributeconstract`;
CREATE TABLE `distributeconstract`  (
  `constract_id` int(0) NOT NULL,
  `User_id` int(0) NOT NULL,
  `Distribute_ratio` double NULL DEFAULT NULL,
  `Own_ratio` double NULL DEFAULT NULL,
  `End_user_ratio` double NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`constract_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `distributeconstract_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for distributedetail
-- ----------------------------
DROP TABLE IF EXISTS `distributedetail`;
CREATE TABLE `distributedetail`  (
  `distr_detail_id` int(0) NOT NULL,
  `Order_id` int(0) NOT NULL,
  `User_id` int(0) NOT NULL,
  `Order_point` double NULL DEFAULT NULL,
  PRIMARY KEY (`distr_detail_id`) USING BTREE,
  INDEX `Order_id`(`Order_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `distributedetail_ibfk_1` FOREIGN KEY (`Order_id`) REFERENCES `order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `distributedetail_ibfk_2` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for distributor
-- ----------------------------
DROP TABLE IF EXISTS `distributor`;
CREATE TABLE `distributor`  (
  `Application_id` int(0) NOT NULL,
  `User_id` int(0) NULL DEFAULT NULL,
  `Distr_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distr_uscc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Card_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distr_manager` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distr_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distr_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distr_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Node_number` int(0) NULL DEFAULT NULL,
  `Valid_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Submitter_id` int(0) NULL DEFAULT NULL,
  `Auditor_id` int(0) NULL DEFAULT NULL,
  `Submit_timestamp` datetime(0) NULL DEFAULT NULL,
  `Check_timestamp` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`Application_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `distributor_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for enterprise
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise`  (
  `Application_id` int(0) NOT NULL,
  `User_id` int(0) NULL DEFAULT NULL,
  `Ent_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ent_uscc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Card_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ent_manager` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ent_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ent_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Ent_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Node_number` int(0) NULL DEFAULT NULL,
  `Valid_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Submitter_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Auditor_id` int(0) NULL DEFAULT NULL,
  `Submit_timestamp` datetime(0) NULL DEFAULT NULL,
  `Check_timestamp` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`Application_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `enterprise_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for music
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music`  (
  `music_id` int(0) NOT NULL,
  `Music_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `music_maker` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `User_id` int(0) NULL DEFAULT NULL,
  `Music_style` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Music_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Upload_timestamp` datetime(0) NULL DEFAULT NULL,
  `Check_timestamp` datetime(0) NULL DEFAULT NULL,
  `Valid_status` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`music_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `music_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for musician
-- ----------------------------
DROP TABLE IF EXISTS `musician`;
CREATE TABLE `musician`  (
  `Application_id` int(0) NOT NULL,
  `User_id` int(0) NOT NULL,
  `Id_number` int(0) NULL DEFAULT NULL,
  `Card_id` int(0) NULL DEFAULT NULL,
  `User_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `User_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Valid_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Submitter_id` int(0) NULL DEFAULT NULL,
  `Auditor_id` int(0) NULL DEFAULT NULL,
  `Submit_timestamp` datetime(0) NULL DEFAULT NULL,
  `Check_timestamp` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`Application_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `User_id` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for musicpublication
-- ----------------------------
DROP TABLE IF EXISTS `musicpublication`;
CREATE TABLE `musicpublication`  (
  `pub_id` int(0) NOT NULL,
  `Music_id` int(0) NULL DEFAULT NULL,
  `Allow_type` int(0) NULL DEFAULT NULL,
  `Allow_region` int(0) NULL DEFAULT NULL,
  `Allow_start_time` datetime(0) NULL DEFAULT NULL,
  `Allow_end_time` datetime(0) NULL DEFAULT NULL,
  `Price_per_day` double(255, 0) NULL DEFAULT NULL,
  `Valid_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Submitter_id` int(0) NULL DEFAULT NULL,
  `Auditor_id` int(0) NULL DEFAULT NULL,
  `Submit_timestamp` datetime(0) NULL DEFAULT NULL,
  `Check_timestamp` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`pub_id`) USING BTREE,
  INDEX `Music_id`(`Music_id`) USING BTREE,
  CONSTRAINT `musicpublication_ibfk_1` FOREIGN KEY (`Music_id`) REFERENCES `music` (`music_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int(0) NOT NULL,
  `User_id` int(0) NULL DEFAULT NULL,
  `Payment_method` int(0) NULL DEFAULT NULL,
  `Order_amount` double NULL DEFAULT NULL,
  `Discount_amount` double NULL DEFAULT NULL,
  `Payment_amount` double NULL DEFAULT NULL,
  `Order_point` int(0) NULL DEFAULT NULL,
  `Valid_status` int(0) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `Pay_time` datetime(0) NULL DEFAULT NULL,
  `finish_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ordercart
-- ----------------------------
DROP TABLE IF EXISTS `ordercart`;
CREATE TABLE `ordercart`  (
  `Order_card_id` int(0) NOT NULL,
  `User_id` int(0) NOT NULL,
  `Music_id` int(0) NOT NULL,
  `Auz_type` int(0) NULL DEFAULT NULL,
  `Auz_region` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Auz_duration` datetime(0) NULL DEFAULT NULL,
  `Price_per_day` double NULL DEFAULT NULL,
  `Add_time` datetime(0) NULL DEFAULT NULL,
  `Modify_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`Order_card_id`) USING BTREE,
  INDEX `User_id`(`User_id`) USING BTREE,
  INDEX `Music_id`(`Music_id`) USING BTREE,
  CONSTRAINT `ordercart_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `user` (`User_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `ordercart_ibfk_2` FOREIGN KEY (`Music_id`) REFERENCES `music` (`music_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail`  (
  `Order_detail_id` int(0) NOT NULL,
  `Order_id` int(0) NOT NULL,
  `Music_id` int(0) NOT NULL,
  `Auz_type` int(0) NULL DEFAULT NULL,
  `Auz_region` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Auz_duration` datetime(0) NULL DEFAULT NULL,
  `Price_per_day` double NULL DEFAULT NULL,
  `Payment_money` double NULL DEFAULT NULL,
  `Discount_money` double NULL DEFAULT NULL,
  `MB_point` double NULL DEFAULT NULL,
  PRIMARY KEY (`Order_detail_id`) USING BTREE,
  INDEX `Order_id`(`Order_id`) USING BTREE,
  INDEX `Music_id`(`Music_id`) USING BTREE,
  CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`Order_id`) REFERENCES `order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`Music_id`) REFERENCES `music` (`music_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `User_id` int(0) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `User_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Passwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Is_valid` tinyint(0) NOT NULL,
  `User_type` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`User_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
