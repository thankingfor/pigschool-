/*
Navicat MySQL Data Transfer

Source Server         : 阿里云
Source Server Version : 50642
Source Host           : 47.95.196.58:3306
Source Database       : schoolpig

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-07-02 15:48:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for xyz_content
-- ----------------------------
DROP TABLE IF EXISTS `xyz_content`;
CREATE TABLE `xyz_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键 广告位具体内容',
  `category_id` bigint(10) NOT NULL COMMENT '内容类目ID',
  `title` varchar(200) DEFAULT NULL COMMENT '内容标题',
  `sub_title` varchar(100) DEFAULT NULL COMMENT '子标题',
  `title_desc` varchar(500) DEFAULT NULL COMMENT '标题描述',
  `url` varchar(500) DEFAULT NULL COMMENT '链接,点击跳转的连接',
  `pic` varchar(300) DEFAULT NULL COMMENT '图片绝对路径',
  `pic2` varchar(300) DEFAULT NULL COMMENT '图片，可以做图片备份或者手机端显示的图片',
  `content` text COMMENT '内容',
  `created` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `updated` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `sort` int(4) DEFAULT '0' COMMENT '0为默认 随便排序  随后按照数字的大小排序',
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='主页中所显示的广告内容';

-- ----------------------------
-- Records of xyz_content
-- ----------------------------
INSERT INTO `xyz_content` VALUES ('17', '16', null, '/TB1r9iTKNjaK1RjSZKzSutVwXXa.jpg', null, null, null, null, null, '2019-03-08 16:25:43', '2019-03-08 16:25:43', '1');
INSERT INTO `xyz_content` VALUES ('18', '16', null, '/TB150frJYrpK1RjSZTESuwWAVXa.jpg', null, null, null, null, null, '2019-03-08 16:28:02', '2019-03-08 16:28:02', '3');
INSERT INTO `xyz_content` VALUES ('19', '16', null, '/TB1Q2nvKbrpK1RjSZTESuwWAVXa.jpg', null, null, null, null, null, '2019-03-08 16:29:01', '2019-03-08 16:29:01', '2');
INSERT INTO `xyz_content` VALUES ('20', '19', '154478247835675', null, null, null, null, null, null, '2019-03-08 17:37:54', '2019-03-08 17:37:54', '0');
INSERT INTO `xyz_content` VALUES ('21', '19', '154478247835676', null, null, null, null, null, null, '2019-03-08 17:38:06', '2019-03-08 17:38:06', '0');
INSERT INTO `xyz_content` VALUES ('22', '19', '154478247835677', null, null, null, null, null, null, '2019-03-08 17:38:22', '2019-03-08 17:38:22', '0');
INSERT INTO `xyz_content` VALUES ('23', '19', '154478247835678', null, null, null, null, null, null, '2019-03-08 17:38:33', '2019-03-08 17:38:33', '0');
INSERT INTO `xyz_content` VALUES ('24', '19', '154478247835679', null, null, null, null, null, null, '2019-03-08 17:38:42', '2019-03-08 17:38:42', '0');
INSERT INTO `xyz_content` VALUES ('25', '21', '154478247835680', null, null, null, null, null, null, '2019-03-08 17:48:23', '2019-03-08 17:48:23', '0');
INSERT INTO `xyz_content` VALUES ('26', '21', '154478247835681', null, null, null, null, null, null, '2019-03-08 17:48:28', '2019-03-08 17:48:28', '0');
INSERT INTO `xyz_content` VALUES ('27', '21', '154478247835682', null, null, null, null, null, null, '2019-03-08 17:48:30', '2019-03-08 17:48:30', '0');
INSERT INTO `xyz_content` VALUES ('28', '22', '154478247835683', null, null, null, null, null, null, '2019-03-08 18:14:09', '2019-03-08 18:14:09', '0');
INSERT INTO `xyz_content` VALUES ('29', '22', '154478247835684', null, null, null, null, null, null, '2019-03-08 18:14:13', '2019-03-08 18:14:13', '0');
INSERT INTO `xyz_content` VALUES ('30', '22', '154478247835685', null, null, null, null, null, null, '2019-03-08 18:14:15', '2019-03-08 18:14:15', '0');
INSERT INTO `xyz_content` VALUES ('31', '23', '154478247835686', null, null, null, null, null, null, '2019-03-08 18:15:08', '2019-03-08 18:15:08', '0');
INSERT INTO `xyz_content` VALUES ('32', '23', '154478247835687', null, null, null, null, null, null, '2019-03-08 18:15:13', '2019-03-08 18:15:13', '0');
INSERT INTO `xyz_content` VALUES ('33', '23', '154478247835688', null, null, null, null, null, null, '2019-03-08 18:15:16', '2019-03-08 18:15:16', '0');
INSERT INTO `xyz_content` VALUES ('34', '25', '154478247835689', null, null, null, null, null, null, '2019-03-08 18:31:03', '2019-03-08 18:31:03', '0');
INSERT INTO `xyz_content` VALUES ('35', '25', '154478247835690', null, null, null, null, null, null, '2019-03-08 18:31:08', '2019-03-08 18:31:08', '0');
INSERT INTO `xyz_content` VALUES ('36', '25', '154478247835691', null, null, null, null, null, null, '2019-03-08 18:31:13', '2019-03-08 18:31:13', '0');
INSERT INTO `xyz_content` VALUES ('37', '25', '154478247835692', null, null, null, null, null, null, '2019-03-08 18:31:15', '2019-03-08 18:31:15', '0');
INSERT INTO `xyz_content` VALUES ('38', '25', '154478247835693', null, null, null, null, null, null, '2019-03-08 18:31:17', '2019-03-08 18:31:17', '0');
INSERT INTO `xyz_content` VALUES ('39', '25', '154478247835694', null, null, null, null, null, null, '2019-03-08 18:31:20', '2019-03-08 18:31:20', '0');
INSERT INTO `xyz_content` VALUES ('40', '25', '154478247835695', null, null, null, null, null, null, '2019-03-08 18:31:22', '2019-03-08 18:31:22', '0');
INSERT INTO `xyz_content` VALUES ('41', '25', '154478247835696', null, null, null, null, null, null, '2019-03-08 18:31:24', '2019-03-08 18:31:24', '0');
INSERT INTO `xyz_content` VALUES ('42', '26', null, '/TB1r9iTKNjaK1RjSZKzSutVwXXa.jpg', null, null, null, null, null, '2019-03-10 21:16:29', '2019-03-10 21:16:29', '0');
INSERT INTO `xyz_content` VALUES ('43', '26', null, '/TB150frJYrpK1RjSZTESuwWAVXa.jpg', null, null, null, null, null, '2019-03-10 21:16:36', '2019-03-10 21:16:36', '0');
INSERT INTO `xyz_content` VALUES ('44', '26', null, '/TB1Q2nvKbrpK1RjSZTESuwWAVXa.jpg', null, null, null, null, null, '2019-03-10 21:16:52', '2019-03-10 21:16:52', '0');
INSERT INTO `xyz_content` VALUES ('45', '27', '8', null, null, null, null, null, null, '2019-03-10 21:37:17', '2019-03-10 21:37:17', '0');
INSERT INTO `xyz_content` VALUES ('46', '27', '9', null, null, null, null, null, null, '2019-03-10 21:37:23', '2019-03-10 21:37:23', '0');
INSERT INTO `xyz_content` VALUES ('47', '28', '10', null, null, null, null, null, null, '2019-03-10 21:37:30', '2019-03-10 21:37:30', '0');
INSERT INTO `xyz_content` VALUES ('48', '28', '11', null, null, null, null, null, null, '2019-03-10 21:37:33', '2019-03-10 21:37:33', '0');
INSERT INTO `xyz_content` VALUES ('49', '29', '12', null, null, null, null, null, null, '2019-03-10 21:37:38', '2019-03-10 21:37:38', '0');
INSERT INTO `xyz_content` VALUES ('50', '29', '13', null, null, null, null, null, null, '2019-03-10 21:37:42', '2019-03-10 21:37:42', '0');

-- ----------------------------
-- Table structure for xyz_content_cat
-- ----------------------------
DROP TABLE IF EXISTS `xyz_content_cat`;
CREATE TABLE `xyz_content_cat` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键 类目ID',
  `parent_id` bigint(10) NOT NULL DEFAULT '0' COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) NOT NULL COMMENT '广告位的名称 比如首页打广告位轮播图',
  `state` int(4) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
  `sort_order` int(4) DEFAULT '0' COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
  `is_parent` int(4) DEFAULT '0' COMMENT '该类目是否为父类目，1为true，0为false',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`state`),
  KEY `sort_order` (`sort_order`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='内容分类 主页所显示内容的管理';

-- ----------------------------
-- Records of xyz_content_cat
-- ----------------------------
INSERT INTO `xyz_content_cat` VALUES ('1', '0', '二手市场', '1', '0', '1', '2018-10-19 20:49:24', '2018-10-19 20:49:24');
INSERT INTO `xyz_content_cat` VALUES ('2', '0', '供需平台', '1', '0', '1', '2018-10-19 20:49:59', '2018-10-19 20:49:59');
INSERT INTO `xyz_content_cat` VALUES ('3', '0', '表白墙', '1', '0', '0', '2018-10-19 20:50:14', '2018-10-19 20:50:14');
INSERT INTO `xyz_content_cat` VALUES ('4', '0', '校园留言板', '1', '0', '0', '2018-10-19 20:50:59', '2018-10-19 20:50:59');
INSERT INTO `xyz_content_cat` VALUES ('5', '0', '健身馆', '1', '0', '0', '2018-10-19 20:53:07', '2018-10-19 20:53:07');
INSERT INTO `xyz_content_cat` VALUES ('6', '0', '失物招领', '1', '0', '0', '2018-10-19 20:53:23', '2018-10-19 20:53:23');
INSERT INTO `xyz_content_cat` VALUES ('7', '0', '登录注册', '1', '0', '0', '2018-10-19 20:53:55', '2018-10-19 20:53:55');
INSERT INTO `xyz_content_cat` VALUES ('8', '0', '情侣空间', '1', '0', '0', '2018-10-19 20:54:02', '2018-10-19 20:54:02');
INSERT INTO `xyz_content_cat` VALUES ('9', '0', '大学回忆录', '1', '0', '0', '2018-10-19 20:54:09', '2018-10-19 20:54:09');
INSERT INTO `xyz_content_cat` VALUES ('10', '1', '大广告位', '1', '0', '1', '2018-10-19 20:59:40', '2018-10-19 20:59:40');
INSERT INTO `xyz_content_cat` VALUES ('11', '1', '中广告位', '2', '0', '0', '2018-10-19 20:59:50', '2018-10-19 20:59:50');
INSERT INTO `xyz_content_cat` VALUES ('12', '1', '小广告位', '2', '0', '0', '2018-10-19 21:04:21', '2018-10-19 21:04:21');
INSERT INTO `xyz_content_cat` VALUES ('13', '2', '大广告位', '1', '0', '1', '2018-10-19 21:04:40', '2018-10-19 21:04:40');
INSERT INTO `xyz_content_cat` VALUES ('14', '2', '中广告位', '1', '0', '1', '2018-10-19 21:04:46', '2018-10-19 21:04:46');
INSERT INTO `xyz_content_cat` VALUES ('15', '2', '小广告位', '2', '0', '0', '2018-10-19 21:04:52', '2018-10-19 21:04:52');
INSERT INTO `xyz_content_cat` VALUES ('16', '10', '轮播图', '1', '0', '0', '2018-10-20 13:38:36', '2018-10-20 13:39:01');
INSERT INTO `xyz_content_cat` VALUES ('18', '11', '中间商品推荐', '2', '0', '0', '2018-10-24 15:37:00', '2018-10-24 15:37:00');
INSERT INTO `xyz_content_cat` VALUES ('19', '10', '最新发布', '1', '0', '0', '2019-03-08 15:15:17', '2019-03-08 15:15:17');
INSERT INTO `xyz_content_cat` VALUES ('20', '1', '商品推广', '1', '0', '1', '2019-03-08 15:16:05', '2019-03-08 15:16:05');
INSERT INTO `xyz_content_cat` VALUES ('21', '20', '编辑精选', '1', '0', '0', '2019-03-08 15:16:22', '2019-03-08 15:16:22');
INSERT INTO `xyz_content_cat` VALUES ('22', '20', '平台低价', '1', '0', '0', '2019-03-08 15:16:32', '2019-03-08 15:16:32');
INSERT INTO `xyz_content_cat` VALUES ('23', '20', '优质成色', '1', '0', '0', '2019-03-08 15:16:47', '2019-03-08 15:16:47');
INSERT INTO `xyz_content_cat` VALUES ('24', '1', '校园猪推荐', '1', '0', '1', '2019-03-08 15:17:16', '2019-03-08 15:17:16');
INSERT INTO `xyz_content_cat` VALUES ('25', '24', 'SchoolBoard', '1', '0', '0', '2019-03-08 15:17:42', '2019-03-08 15:17:42');
INSERT INTO `xyz_content_cat` VALUES ('26', '13', '轮播图', '1', '0', '0', '2019-03-10 18:01:48', '2019-03-10 18:01:48');
INSERT INTO `xyz_content_cat` VALUES ('27', '14', '单人需求', '1', '0', '0', '2019-03-10 18:01:59', '2019-03-10 18:02:41');
INSERT INTO `xyz_content_cat` VALUES ('28', '14', '学生兼职', '1', '0', '0', '2019-03-10 18:02:19', '2019-03-10 18:02:19');
INSERT INTO `xyz_content_cat` VALUES ('29', '14', '众包', '1', '0', '0', '2019-03-10 18:02:27', '2019-03-10 18:02:27');

-- ----------------------------
-- Table structure for xyz_exchange
-- ----------------------------
DROP TABLE IF EXISTS `xyz_exchange`;
CREATE TABLE `xyz_exchange` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `item_Id` bigint(20) NOT NULL,
  `user_Id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact_way` int(11) NOT NULL COMMENT '1手机 2QQ 3微信',
  `contact_info` varchar(255) NOT NULL,
  `create` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_exchange
-- ----------------------------
INSERT INTO `xyz_exchange` VALUES ('14', '154478247835677', '13', '55555', '1', '11531', '2019-03-10 19:24:41');
INSERT INTO `xyz_exchange` VALUES ('15', '154478247835675', '13', '张荣祯', '1', '1234515', '2019-03-22 10:14:35');
INSERT INTO `xyz_exchange` VALUES ('16', '154478247835675', '18', '红旗渠', '1', '11111111', '2019-03-23 09:36:45');
INSERT INTO `xyz_exchange` VALUES ('17', '154478247835680', '19', '12', '1', '1111111111', '2019-04-19 14:14:16');
INSERT INTO `xyz_exchange` VALUES ('18', '154478247835675', '21', 'fdgfdg', '1', 'dfgfd', '2019-06-13 02:40:35');

-- ----------------------------
-- Table structure for xyz_favorite
-- ----------------------------
DROP TABLE IF EXISTS `xyz_favorite`;
CREATE TABLE `xyz_favorite` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `item_id` bigint(20) NOT NULL,
  `favorite` bigint(20) NOT NULL DEFAULT '0' COMMENT '0喜欢 1不喜欢',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_favorite
-- ----------------------------
INSERT INTO `xyz_favorite` VALUES ('13', '13', '154478247835691', '0', '2019-03-22 05:30:25');
INSERT INTO `xyz_favorite` VALUES ('14', '13', '154478247835678', '0', '2019-03-22 09:16:17');
INSERT INTO `xyz_favorite` VALUES ('16', '13', '154478247835676', '0', '2019-03-23 02:00:34');
INSERT INTO `xyz_favorite` VALUES ('19', '13', '154478247835675', '0', '2019-03-23 06:37:49');
INSERT INTO `xyz_favorite` VALUES ('20', '13', '154478247835690', '0', '2019-03-23 07:42:42');
INSERT INTO `xyz_favorite` VALUES ('21', '18', '154478247835675', '0', '2019-03-23 09:36:37');
INSERT INTO `xyz_favorite` VALUES ('22', '19', '154478247835680', '0', '2019-04-19 14:18:59');
INSERT INTO `xyz_favorite` VALUES ('23', '1', '154478247835675', '0', '2019-06-06 02:24:37');

-- ----------------------------
-- Table structure for xyz_item
-- ----------------------------
DROP TABLE IF EXISTS `xyz_item`;
CREATE TABLE `xyz_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键 不自增 设置',
  `title` varchar(200) NOT NULL COMMENT '标题，题目',
  `oldprice` bigint(20) DEFAULT NULL COMMENT '原价',
  `price` bigint(20) NOT NULL COMMENT '商品价格，单位为：分',
  `sell_point` varchar(500) DEFAULT NULL COMMENT '商品买点',
  `photo` varchar(250) DEFAULT NULL COMMENT '封面',
  `num` int(10) NOT NULL DEFAULT '1' COMMENT '商品数量，默认为1',
  `image` varchar(500) DEFAULT NULL COMMENT '图片地址用，分割',
  `cid` bigint(10) NOT NULL DEFAULT '1' COMMENT '所属类目，叶子类目',
  `state` int(4) NOT NULL DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_bargain` int(4) DEFAULT '0' COMMENT '是否可以讲价 0不可以  1可以',
  `assay` int(4) DEFAULT '0' COMMENT '商品成色，物品成色分为1~10个等级代表二手物品的新旧程度。其中1~3代表商品已经无法正常使用，4~6代表商品部分功能无法使用，7~9代表商品功能正常，10代表该商品为全新',
  `location` varchar(100) DEFAULT NULL COMMENT '所在地信息 安阳工学院十里铺公寓',
  `contact_way` int(11) DEFAULT NULL COMMENT '联系方式 1 手机 2QQ 3 微信',
  `contact_info` varchar(200) NOT NULL COMMENT '联系方式 默认为改用户的联系方式',
  `dealway` int(4) DEFAULT '0' COMMENT '交易方式 0私自联系交易',
  `uid` bigint(20) DEFAULT '1' COMMENT '发布用户的id 1默认位官方用户',
  `nick` varchar(255) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`) USING BTREE,
  KEY `status` (`state`) USING BTREE,
  KEY `updated` (`updated`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=154478247835698 DEFAULT CHARSET=utf8 COMMENT='暂定二手市场的商品表';

-- ----------------------------
-- Records of xyz_item
-- ----------------------------
INSERT INTO `xyz_item` VALUES ('999', '张荣祯', null, '99999999999', '聪明爱学习', null, '1', null, '1', '3', '2019-03-15 15:47:54', '2019-03-15 15:47:54', '0', '0', '十里铺', null, '110', '0', '1', null);
INSERT INTO `xyz_item` VALUES ('154478247835675', 'funko pop漫威复仇者联盟3无限战争周边10寸灭霸手办收藏公仔摆件', '418', '376', '品牌名称：FUNKO\r\n产品参数：\r\n\r\n品牌: FUNKO型号: 2889311材质: 搪胶颜色分类: 10寸灭霸#28893出售状态: 现货作品来源: 影视作品地区: 美国大小: 正版现货ACG作品名: 复仇者联盟3无限战争', '/1552032224756O1CN01aGUtPb2M2i42EhSum_!!2842109770.jpg_q30.jpg', '1', '/1552032224771O1CN01aGUtPb2M2i42EhSum_!!2842109770.jpg_q30.jpg,/1552032224787O1CN01Dev3CV2M2i3xhQtTs_!!2842109770.jpg,/1552032224801O1CN012M2i1oWysrrJWyc_!!2842109770.jpg_430x430q90.jpg', '1', '1', '2019-03-08 16:03:45', '2019-03-08 16:03:45', '0', '10', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835676', '2019春装新款韩版V领学院风慵懒风针织开衫女宽松短款毛衣外套潮', '189', '69', '适用年龄: 18-24周岁尺码: S M面料: 锦纶图案: 纯色风格: 通勤通勤: 韩版领子: V领衣门襟: 单排扣颜色分类: 灰色 灰色现货 灰色（预定5个工作日）袖型: 插肩袖组合形式: 单件货号: HXPXXZZKS成分含量: 30%及以下上市年份/季节: 2019年春季袖长: 长袖款式: 开衫厚薄: 常规衣长: 中长款服装版型: 宽松流行元素/工艺: 绣花', '/1552036068267O1CN01FH23uv29Yghhr1y3H_!!654838080.jpg', '1', '/1552036020841O1CN01mCktlQ29YghmVfkGr_!!654838080.jpg,/1552036020855O1CN01QuVOrm29YghpIABP7_!!654838080.jpg,/1552036020867TB2nuYvjRHH8KJjy0FbXXcqlpXa_!!654838080.jpg,/1552036068280O1CN01mCktlQ29YghmVfkGr_!!654838080.jpg,/1552036068292O1CN01QuVOrm29YghpIABP7_!!654838080.jpg,/1552036068303TB2nuYvjRHH8KJjy0FbXXcqlpXa_!!654838080.jpg', '1', '1', '2019-03-08 17:07:48', '2019-03-08 17:07:48', '0', '9', null, '1', '1231531', '0', '15', 'base');
INSERT INTO `xyz_item` VALUES ('154478247835677', 'POPMART泡泡玛特 Molly十二生肖盲盒公仔二次元手办摆件', '59', '29', '品牌名称：POP MART/泡泡玛特\r\n产品参数：\r\n\r\n品牌: POP MART/泡泡玛特型号: 生肖颜色分类: Molly生肖【整套不重复请拍12个】出售状态: 预售大小: 单个盲盒【随机发不指定 拆盒不退不', '/1552036286267TB2hU1Vg0cnBKNjSZR0XXcFqFXa_!!2885348004.jpg_430x430q90.jpg', '1', '/1552036286293O1CN01RetfD228zsbgKtfGS_!!2885348004.jpg,/1552036286306O1CN019LxfeW28zsbfhKxq9_!!2885348004.jpg,/1552036286318TB2iM9pgZUrBKNjSZPxXXX00pXa_!!2885348004.jpg_430x430q90.jpg', '1', '1', '2019-03-08 17:11:26', '2019-03-08 17:11:26', '0', '6', null, '1', '11531', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835678', '漫能官方正版魔道祖师周边遮阳晴雨伞魏无羡蓝忘机动漫周边二次元', '94', '89', '品牌名称：漫能\r\n产品参数：\r\n\r\n品牌: 漫能型号: 6931948700803适用年龄: 8周岁以上颜色分类: （预售3月19日发货）伞+毛毡伞套+精美礼盒包装 （预售3月19日发货）伞+毛毡伞套周边产品: 雨伞/阳伞出售状态: 预售动漫地区: 中国大陆大小: 魔道祖师彩图款ACG作品名: 魔道祖师', '/1552036473148O1CN01lHBzmh2I5gALM9yDz_!!1050919235.jpg', '1', '/1552036473164O1CN01HCSq9j2I5gAGgWzGI_!!1050919235.jpg,/1552036473175O1CN01Sefgg62I5gANVYN7S_!!1050919235.jpg_430x430q90.jpg', '1', '1', '2019-03-08 17:14:33', '2019-03-08 17:14:33', '0', '8', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835679', 'Microsoft/微软 Surface Laptop 2 i5 8GB 256GB 13.5英寸触控屏笔记本电脑学生轻薄便携windows系统PC灰粉金', '9989', '8988', '产品参数：\r\n\r\n证书编号：2017010902964554证书状态：有效申请人名称：微软公司制造商名称：微软公司产品名称：笔记本电脑3C产品型号：1769：12-15Vdc, 1.6-2.58A（电源适配器：1625、1736、1800）3C规格型号：1769，1782：12-15Vdc, 1.6-2.58A（电源适配器：1625、1736、1800...产品名称：Microsoft/微软 Surface ...品牌: Microsoft/微软型号: I5 8G内存容量: 8GB机械硬盘容量: 0CPU: 第 8 代英特尔酷睿 i5 处理器屏幕尺寸: 13.5英寸显存容量: 共享内存容量显卡类型: 智能英特尔UHD 显卡 620操作系统: windows 10 家庭版', '/1552036480685O1CN01bwg5rk1I5DaElWsrW_!!0-item_pic.jpg_430x430q90.jpg', '1', '/1552036480798O1CN01bwg5rk1I5DaElWsrW_!!0-item_pic.jpg_430x430q90.jpg,/1552036481094O1CN01HL3ejl1I5DaElR6wD_!!1621790841.jpg_430x430q90.jpg,/1552036481330O1CN01jWHEQz1I5DaqAAqTM_!!0-item_pic.jpg_430x430q90.jpg,/1552036481501O1CN01Que60r1I5Davfv8OI_!!1621790841.jpg_430x430q90.jpg', '1', '1', '2019-03-08 17:14:41', '2019-03-08 17:14:41', '0', '10', null, '1', '15798753689', '0', '16', 'MR.张');
INSERT INTO `xyz_item` VALUES ('154478247835680', '馒头社二次元动漫福袋抱枕蕾姆刀剑神域五等分的花嫁中野三玖周边', '298', '58', '品牌名称：馒头社\r\n产品参数：\r\n\r\n品牌: 馒头社型号: mtsfd适用年龄: 8周岁以上颜色分类: 【从零开始】 【废狗】 【五等分の花嫁】 史莱姆 罪恶王冠 刀男系列 刀剑神域 东方系列 路人女主的养成方法 lovelive 夏目友人帐 舰娘 约会大作战 科学电磁炮 游戏の人生 小土里 魔卡の樱 埃罗芒阿老师 腐（全是美男） 宅（全是妹子） 小英雄 小林家的龙女仆 工作细胞 没有找到本命？联系客服试试周边产品: 其他大小: 59元荣耀福袋（必中小抱枕含枕芯） 99元至尊幅袋（可许愿T恤ro围巾，如备注尺码会中T恤） 199元神豪福袋（必中一米六等身抱枕，可许愿等身枕芯） 299元 逆天锦鲤（总价值888+，如备注尺码会中卫衣）ACG作品名: 动漫主题福袋', '/1552036724946O1CN014YiNRX1qrUGqk0iQr_!!3547265549.jpg_430x430q90.jpg', '1', '/1552036473164O1CN01HCSq9j2I5gAGgWzGI_!!1050919235.jpg,/1552036473175O1CN01Sefgg62I5gANVYN7S_!!1050919235.jpg_430x430q90.jpg,/1552036724960O1CN01bnKtLa1qrUGag7TfC_!!3547265549.jpg,/1552036724973O1CN01GDNRgC1qrUGc3SchU_!!3547265549.jpg,/1552036724985O1CN01xCW75V1qrUGVbHPlT_!!3547265549.jpg', '1', '1', '2019-03-08 17:18:45', '2019-03-08 17:18:45', '0', '9', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835681', '花花公子卫衣男潮流春季长袖潮牌T恤男士打底衫个性破洞学生衣服', '139', '99', '品牌名称：PLAYBOY/花花公子\r\n更多参数产品参数：\r\n\r\n品牌: PLAYBOY/花花公子面料分类: 棉毛布货号: LHJ523358686基础风格: 青春流行上市年份季节: 2019年春季厚薄: 常规销售渠道类型: 纯电商(只在线上销售)材质成分: 棉73% 聚酯纤维22% 聚氨酯弹', '/1552036870960O1CN01XP3zsk2IDvI0OHf1j_!!0-item_pic.jpg_430x430q90.jpg', '1', '/1552036473164O1CN01HCSq9j2I5gAGgWzGI_!!1050919235.jpg,/1552036473175O1CN01Sefgg62I5gANVYN7S_!!1050919235.jpg_430x430q90.jpg,/1552036724960O1CN01bnKtLa1qrUGag7TfC_!!3547265549.jpg,/1552036724973O1CN01GDNRgC1qrUGc3SchU_!!3547265549.jpg,/1552036724985O1CN01xCW75V1qrUGVbHPlT_!!3547265549.jpg,/1552036870974O1CN01EN8sfJ2IDvHxuKOKj_!!1823789253.jpg,/1552036870988O1CN01etLGS12IDvHyBe8tO_!!1823789253.jpg,/1552036871001O1CN012HKImD2IDvHyvtzqT_!!1823789253.jpg', '1', '1', '2019-03-08 17:21:11', '2019-03-08 17:21:11', '0', '10', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835682', 'Dell/戴尔 G7 G5 i7独显7588高配电竞游匣8代六核i7标压GTX1060 6G独显学生吃鸡G3笔记本电脑15.6英寸游戏本', '6599', '6599', '品牌名称：Dell/戴尔\r\n更多参数产品参数：\r\n\r\n证书编号：2017010902982510证书状态：有效产品名称：便携式计算机3C规格型号：P71F, P72F, P71F..., P72F...,Inspiron 15-7577, Vos...产品名称：Dell/戴尔 G7 7588品牌: Dell/戴尔型号: 7588内存容量: 4G/8G/16G机械硬盘容量: 1tCPU: 英特尔 酷睿 i5-8300H/i7-8750H屏幕尺寸: 15.6英寸显存容量: 4G/6G显卡类型: GTX 1050Ti /1060 独显操作系统: windows 10', '/1552036904276O1CN01ji2AW91va9LyhP9q1_!!0-item_pic.jpg_60x60q90.jpg', '1', '/1552036904294O1CN01JWjly11va9LmQbCbn_!!2913716188.jpg_60x60q90.jpg,/1552036904315O1CN01SaGmMh1va9LlemsW3_!!2913716188.jpg_60x60q90.jpg,/1552036904331O1CN01Vnspk21va9Lnvk7u6_!!2913716188.jpg_60x60q90.jpg,/1552036904353O1CN01XpGLcV1va9Lng93MI_!!2913716188.jpg_60x60q90.jpg', '1', '1', '2019-03-08 17:21:44', '2019-03-08 17:21:44', '0', '10', null, '1', '15795464552', '0', '16', 'Mr.王');
INSERT INTO `xyz_item` VALUES ('154478247835683', '名侦探柯南手表幸运石动漫周边基德新一灰原哀安室透二次元石英表', '350', '128', '品牌名称：Xingyunshi\r\n产品参数：\r\n\r\n品牌: Xingyunshi型号: 柯南石英手表适用年龄: 14周岁以上材质: 金属适用性别: 通用颜色分类: 幕后侦探轻薄石英表银色 银色 双面侦探轻薄石英表 铭刻之誓情侣轻薄石英手表 新一款 华丽怪盗轻薄石英表银色 天才少女银色轻薄石英表 幕后侦探轻薄石英表玫瑰金色 黑色 安室透轻薄石英表 黑色 赤井秀一轻薄石英表 银色 表演时刻轻薄石英表 银色 推理时间轻薄石英表 铭刻之誓情侣轻薄石英手表 兰款 黑色 名侦探轻薄石英表周边产品: 手表出售状态: 现货动漫地区: 日本大小: 大号 小号ACG作品名: 名侦探柯南ACG角色名: 江户川柯南', '/1552037066937O1CN01yLwUwi1SZa0SlVeN1_!!0-item_pic.jpg_430x430q90.jpg', '1', '/1552037066949O1CN01c12F5J1SZa0TGMBIK_!!644852261.jpg,/1552037066963O1CN012KTg331SZa0WedGFl_!!644852261 (1).jpg,/1552037066977O1CN012KTg331SZa0WedGFl_!!644852261.jpg', '1', '1', '2019-03-08 17:24:27', '2019-03-08 17:24:27', '0', '10', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835684', 'Acer/宏碁 暗影骑士3代 AN515-52枪神版i5-8代1060 6G独显吃鸡专用游戏本设计笔记本电脑15.6英寸工作用高配', '6299', '5799', '证书编号：2017010902969653证书状态：有效产品名称：便携式计算机3C规格型号：见附件产品名称：Acer/宏碁 暗影骑士3代 A...品牌: Acer/宏碁型号: AN515内存容量: 8g机械硬盘容量: 0CPU: i5-8300H屏幕尺寸: 15.6英寸显存容量: 6G显卡类型: GTX1060操作系统: windows 10', '/1552037101134O1CN011OSuLS27dbjn9do6l_!!0-item_pic.jpg_60x60q90.jpg', '1', '/1552037101161O1CN01SaGmMh1va9LlemsW3_!!2913716188.jpg_60x60q90.jpg,/1552037101184O1CN01Vnspk21va9Lnvk7u6_!!2913716188.jpg_60x60q90.jpg,/1552037101213O1CN014XqmzB27dbiLFrt5R_!!4289117820.jpg_60x60q90.jpg,/1552037101260O1CN0194iB3a27dbiK8rY04_!!4289117820.png_60x60q90.jpg', '1', '1', '2019-03-08 17:25:01', '2019-03-08 17:25:01', '0', '10', null, '1', '18525647489', '0', '16', 'Mr.王');
INSERT INTO `xyz_item` VALUES ('154478247835685', '漫趣动漫周边五等分的花嫁中野三玖同款无线蓝牙耳机二次元头戴式', '240', '89', '品牌名称：漫趣\r\n产品参数：\r\n\r\n品牌: 漫趣型号: 01617适用年龄: 6周岁以上颜色分类: 三玖同款设计耳机周边产品: 耳机/耳麦出售状态: 预售动漫地区: 日本大小: 【赠三玖婚纱特典徽章】ACG作品名: 五等分花嫁', '/1552037249074O1CN01ubFm651ssynJvuqzQ_!!1739345823.jpg_430x430q90.jpg', '1', '/1552037249089O1CN01TiP2171ssyn37jyfl_!!1739345823.jpg,/1552037249100O1CN01XWB6xN1ssyms1BZ6u_!!1739345823.jpg', '1', '1', '2019-03-08 17:27:29', '2019-03-08 17:27:29', '0', '8', null, '2', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835686', 'Dell/戴尔 G7 i7独显7588高配电竞游匣8代六核i7标压GTX1060 6G独显G5学生吃鸡游戏笔记本电脑15.6英寸游戏本', '8599', '7599', '品牌名称：Dell/戴尔\r\n更多参数产品参数：\r\n\r\n证书编号：2017010902982510证书状态：有效产品名称：便携式计算机3C规格型号：P71F, P72F, P71F..., P72F...,Inspiron 15-7577, Vos...产品名称：Dell/戴尔 灵越游匣 spee...品牌: Dell/戴尔型号: speed5577内存容量: 8g机械硬盘容量: 1T+128G SSDCPU: 英特尔 酷睿 i5-8300H屏幕尺寸: 15.6英寸显存容量: 4G显卡类型: NVIDIA GeForce GTX1050 (Deskto', '/1552037352516O1CN01ZwsRs61CPTPsIdH6z_!!0-item_pic.jpg_60x60q90.jpg', '1', '/1552037352534O1CN011CPTNa11oHYfW6V_!!3023650073.jpg_60x60q90 - 副本.jpg,/1552037352548O1CN011CPTNa11oHYfW6V_!!3023650073.jpg_60x60q90.jpg,/1552037352586O1CN011CPTNd9GlA6FUfp_!!3023650073.jpg_60x60q90.jpg', '1', '1', '2019-03-08 17:29:12', '2019-03-08 17:29:12', '0', '10', null, '1', '15795464552', '0', '16', 'Mr.王');
INSERT INTO `xyz_item` VALUES ('154478247835687', '数字油画diy风景手绘填色油彩画卧室手工画卡通动漫装饰画减压画', '96', '28', '品牌名称：TIMAX\r\n产品参数：\r\n\r\n品牌: TIMAX材质: 棉布图案: 风景风格: 简约现代尺寸: 40*50绷好内框 50*65绷好内框 60*75绷好内框 40*50送黑色成品外框 40*50送原木色成品外框 50*65送黑色成品外框 50*65送原木色成品外框颜色分类: A244 213 A633 A717 烟火季节 111气球 A311 A650 A715 下拉选图备注 A647 A644 B133你的名字 A457 A345 A118 A595 275 A060 A288 爱在巴黎 A382 A558组合形式: 双套颜料+双份画笔+升级淡彩画板颜料类型: 丙烯装裱方式: 无框', '/1552037363153TB2Z_JWH49YBuNjy0FfXXXIsVXa_!!2073971693.jpg_430x430q90.jpg', '1', '/1552037363165O1CN01I5mODN1ONR2IpiBVV_!!2073971693.jpg,/1552037363178O1CN01SNNc5M1ONR2C4qQx6_!!2073971693.jpg,/1552037363190O1CN019lYsKB1ONR2KsGg9D_!!2073971693.jpg', '1', '1', '2019-03-08 17:29:23', '2019-03-08 17:29:23', '0', '8', null, '1', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835688', 'bilibili哔哩哔哩 B站周边 福袋 粉丝抱枕礼包卡通 动漫二次元', '233', '232', 'bilibili哔哩哔哩 B站周边 福袋 粉丝抱枕礼包卡通 动漫二次元', '/1552037547160O1CN01d2zN7H1QY5U51BsMS_!!0-item_pic.jpg_430x430q90.jpg', '1', '/1552037547176O1CN01ZpKDwn1QY5U3LvhV3_!!2138521987.jpg,/undefined', '1', '1', '2019-03-08 17:32:29', '2019-03-08 17:32:29', '0', '10', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835689', 'Xiaomi/小米 小米电视4A 65英寸4k超清智能网络平板电视机60 55', '5899', '4499', '证书编号：2018010808052556证书状态：有效产品名称：小米电视3C规格型号：L65M5-AD：220V~ 50/60Hz 180W产品名称：Xiaomi/小米 小米电视4A ...品牌: Xiaomi/小米型号: 小米电视4A 65英寸分辨率: 4K电视3D类型: 无能效等级: 三级网络连接方式: 全部支持操作系统: MIUI', '/1552037636783O1CN01A6bQfV29zFgblDkoC_!!1714128138.jpg_430x430q90.jpg', '1', '/1552037636853O1CN012VtiUl29zFgb3Kn19_!!2-item_pic.png_430x430q90.jpg,/1552037636883TB2yBh5srZnBKNjSZFKXXcGOVXa_!!1714128138.jpg_430x430q90.jpg', '1', '1', '2019-03-08 17:33:56', '2019-03-08 17:33:56', '0', '10', null, '1', '15987459869', '0', '16', 'Mr.李');
INSERT INTO `xyz_item` VALUES ('154478247835690', '从零开始的异世界雷姆等身抱枕 艾米莉亚蕾姆拉姆动漫全身靠枕套', '555', '262', '品牌名称：巨飞\r\n产品参数：\r\n\r\n品牌: 巨飞型号: 从零开始的异世界生活适用年龄: 3周岁以上材质: 毛绒适用性别: 通用颜色分类: A组-含枕芯 B组-含枕芯 C组-含枕芯 D组-含枕芯 E组-含枕芯 F组-含枕芯 G组-含枕芯 H组-含枕芯 I组-含枕芯 J组-含枕芯 K组-含枕芯 L组-含枕芯 N组-含枕芯 M组-含枕芯 O组-含枕芯 P组-含枕芯 Q组-含枕芯 R组-含枕芯 S组-含枕芯 T组-含枕芯 图库选图 留言编号周边产品: 等身抱枕出售状态: 预售动漫地区: 日本大小: 35x100cm【桃皮绒】 35x100cm【自然毛绒】 50x160cm【桃皮绒】【送靠枕】 50x160cm【自然毛绒】【送靠枕】 50x160cm【2way新】【送靠枕】 60x180cm【桃皮绒】【送靠枕】 60x180cm【自然毛绒】【送靠枕】 60x180cm【2way新】【送靠枕】ACG作品名: 雷姆', '/1552037677320O1CN01TlbzpY1HXmfPDNVlF_!!0-item_pic.jpg_430x430q90.jpg', '1', '/undefined,/undefined,/1552037679203TB28JSNXL5TBuNjSspcXXbnGFXa_!!3065320768.jpg', '1', '1', '2019-03-08 17:34:39', '2019-03-08 17:34:39', '0', '10', null, '3', 'xiaowangzi', '0', '15', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835691', '韩国原装进口二手钢琴好路歌所罗门成人家用儿童初学者立式钢琴', '5699', '5399', '品牌: other/其他型号: 好路歌价格区间: 3001-10000元是否有导购视频: 有背板材质: 实木音板适用场景: 专业 准专业 练习钢琴类别: 中古钢琴款式: 立式键数: 88键材质: 云杉木高度: 131cm适用对象: 初学者 家庭教学 专业院校套餐类型: 官方标配适用年龄: 不限颜色: 黑色颜色分类: 黑色好路歌 白色好路歌 黑色', '/1552040622345TB2rB36FeOSBuNjy0FdXXbDnVXa_!!201711819.jpg', '1', '/1552040622507TB2au0hhDdYBeNkSmLyXXXfnVXa_!!201711819.jpg,/1552040622534TB2rB36FeOSBuNjy0FdXXbDnVXa_!!201711819.jpg,/1552040622548TB20Mcuw8mWBuNkSndVXXcsApXa_!!201711819.jpg', '1', '1', '2019-03-08 18:23:42', '2019-03-08 18:23:42', '0', '10', null, '3', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835692', '原装进口二手钢琴韩国英昌U3出口FU55成人家用初学者考级立式钢琴', '6880', '6080', '品牌: YOUNG CHANG/英昌型号: U3/ FU.55价格区间: 3001-10000元是否有导购视频: 有背板材质: 实木音板适用场景: 专业 准专业 演奏 练习钢琴类别: 中古钢琴款式: 立式键数: 88键材质: 鱼鳞松高度: 131cm适用对象: 初学者 家庭教学 专业院校 专业演奏 高端定位套餐类型: 套餐一适用年龄: 不限颜色: 黑色 白色颜色分类: 白色出口英昌 黑色出口英昌', '/1552040703951TB2S23InpXXXXXVXpXXXXXXXXXX_!!1800054943.jpg', '1', '/1552040703965TB2ILxDi88lpuFjSspaXXXJKpXa_!!1800054943.jpg,/1552040703989TB2KYH.o4XkpuFjy0FiXXbUfFXa_!!1800054943.jpg', '1', '1', '2019-03-08 18:25:04', '2019-03-08 18:25:04', '0', '9', null, '1', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835693', '日本原装进口YAMAHA雅马哈二手钢琴U1H U2H U3H初学者家用卡9成新', '38599', '12799', '产品名称: 雅马哈U1钢琴品牌: Yamaha/雅马哈型号: U1价格区间: 10000-15000是否有导购视频: 有背板材质: 实木音板适用场景: 专业 准专业 演奏 练习钢琴类别: 中古钢琴颜色: 黑适用年龄: 5岁以上套餐类型: 日本原装雅马哈颜色分类: U3H 72-80年生产 U1D 61-65年生产 U1G 70-72年生产 YU10 99-05年生产 U100 93-97年生产 U1A 82-87年生产 U10A 89-93年生产 YU1 97-99年生产 U1M 80-82年生产 U10BL 87-89年生产 U1F 68-70年生产 U1H 72-80年生产 U1E 65-68年生产键数: 88键款式: 立式材质: 其他适用对象: 专业演奏高度: 121cm', '/1552040794239O1CN01bOoECS1fpEXQyiHzx_!!1884484055.jpg', '1', '/1552040794253O1CN01JrNXGS1fpEXQoJOu7_!!1884484055.jpg,/1552040794266O1CN01x01laT1fpEXQoJKiy_!!1884484055.jpg', '1', '1', '2019-03-08 18:26:34', '2019-03-08 18:26:34', '0', '8', null, '3', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835694', '原装进口二手钢琴韩国英昌U3出口FU55成人家用初学者考级立式钢琴', '6600', '6000', '套餐类型: 套餐一品牌: YOUNG CHANG/英昌背板材质: 实木音板适用场景: 专业 准专业 演奏 练习钢琴类别: 中古钢琴款式: 立式键数: 88键材质: 云杉木高度: 131cm适用对象: 初学者 家庭教学 专业院校 专业演奏 高端定位颜色分类: 永昌U-3 黑色（不含运费） 英昌', '/1552040875575TB2.OHOdlDH8KJjSspnXXbNAVXa_!!286479524.jpg', '1', '/1552040875588TB2fultaVYM8KJjSZFuXXcf7FXa_!!286479524.jpg,/1552040875606TB2Nwdeajgy_uJjSZJnXXbuOXXa_!!286479524.jpg', '1', '1', '2019-03-08 18:27:55', '2019-03-08 18:27:55', '0', '8', null, '3', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835695', '日本原装雅马哈二手钢琴家用成人U3H立式台式U1H U2A初学ux-1ux3', '43264', '6065', '品牌: Yamaha/雅马哈背板材质: 实木音板适用场景: 专业 准专业 演奏 练习款式: 立式键数: 88键材质: 核桃木高度: 121cm适用对象: 初学者 家庭教学 专业院校 专业演奏 高端定位套餐类型: 日本原装进口二手雅马哈颜色分类: 定金专拍 U1H双12 U3H推荐', '/1552040951655O1CN01wlt6uv1Nj8AuyMw0C_!!38721605.jpg', '1', '/1552040951682TB2kUwIlxlmpuFjSZPfXXc9iXXa_!!38721605.jpg,/1552040951694TB2USOUfthvOuFjSZFBXXcZgFXa_!!38721605.jpg', '1', '1', '2019-03-08 18:29:11', '2019-03-08 18:29:11', '0', '5', null, '3', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835696', '原装进口二手钢琴韩国英昌U3出口FU55初学家用成人考级实木钢琴', '6588', '6000', '品牌: YOUNG CHANG/英昌型号: U3价格区间: 3001-10000元是否有导购视频: 有背板材质: 实木音板适用场景: 专业 准专业 演奏 练习钢琴类别: 中古钢琴款式: 立式键数: 88键材质: 其他高度: 131cm适用对象: 初学者 家庭教学 专业院校 专业演奏 高端定位颜色: 黑套餐类型: 官方标配适用年龄: 0-99颜色分类: 英昌U3 永昌 白色英昌U3 黑色F', '/1552041034039O1CN01Iz7FST1Dy6xhf3cuh_!!798450284.jpg', '1', '/1552041034053O1CN01jrTYWB1Dy6xclFOFw_!!798450284.jpg', '1', '1', '2019-03-08 18:30:34', '2019-03-08 18:30:34', '0', '6', null, '3', 'xiaowangzi', '0', '13', '小王子');
INSERT INTO `xyz_item` VALUES ('154478247835697', '大衣', '4', '1', '很好', '', '1', '', '1', '1', '2019-05-31 12:31:34', '2019-05-31 12:31:34', '0', '5', null, '1', '', '0', '20', '');

-- ----------------------------
-- Table structure for xyz_item_cat
-- ----------------------------
DROP TABLE IF EXISTS `xyz_item_cat`;
CREATE TABLE `xyz_item_cat` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '主键，类目ID',
  `parent_id` bigint(10) NOT NULL DEFAULT '0' COMMENT '父类目ID=0时，代表的是一级的类目，默认0',
  `name` varchar(50) DEFAULT NULL COMMENT '类目名称',
  `state` int(4) DEFAULT '1' COMMENT '状态。可选值:1(正常),0(删除)',
  `sort_order` int(4) DEFAULT '0' COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数，默认为0',
  `is_parent` int(4) DEFAULT '0' COMMENT '该类目是否为父类目，1为true，0为false',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`state`) USING BTREE,
  KEY `sort_order` (`sort_order`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COMMENT='二手市场的商品分类表';

-- ----------------------------
-- Records of xyz_item_cat
-- ----------------------------
INSERT INTO `xyz_item_cat` VALUES ('1', '0', '校园猪商品分类', '1', '0', '1', '2018-10-12 19:42:22', '2018-10-12 19:42:17');
INSERT INTO `xyz_item_cat` VALUES ('2', '1', '书籍', '1', '0', '0', '2018-10-12 19:42:55', '2018-10-12 19:42:59');
INSERT INTO `xyz_item_cat` VALUES ('5', '0', '电器', '1', '0', '1', '2018-10-12 19:44:56', '2018-10-12 19:44:56');
INSERT INTO `xyz_item_cat` VALUES ('6', '5', '冰箱', '1', '0', '0', '2018-10-12 19:46:35', '2018-10-12 19:46:35');
INSERT INTO `xyz_item_cat` VALUES ('7', '5', '电视7', '1', '0', '1', '2018-10-12 19:46:57', '2018-10-12 19:46:57');
INSERT INTO `xyz_item_cat` VALUES ('8', '5', '空调', '1', '0', '1', '2018-10-12 19:47:11', '2018-10-12 19:47:11');
INSERT INTO `xyz_item_cat` VALUES ('9', '8', '格力空调', '1', '0', '0', '2018-10-12 19:47:33', '2018-10-17 15:11:30');
INSERT INTO `xyz_item_cat` VALUES ('10', '8', '新飞空调', '1', '0', '0', '2018-10-12 19:47:43', '2018-10-17 15:11:21');
INSERT INTO `xyz_item_cat` VALUES ('11', '0', '电子', '1', '0', '1', '2018-10-12 19:48:05', '2018-10-12 19:48:05');
INSERT INTO `xyz_item_cat` VALUES ('12', '11', '平板', '1', '0', '0', '2018-10-12 19:48:17', '2018-10-12 19:48:17');
INSERT INTO `xyz_item_cat` VALUES ('13', '11', '手机', '1', '0', '0', '2018-10-12 19:48:28', '2018-10-12 19:48:28');
INSERT INTO `xyz_item_cat` VALUES ('14', '11', '笔记本', '1', '0', '0', '2018-10-12 19:48:49', '2018-10-12 19:48:49');
INSERT INTO `xyz_item_cat` VALUES ('17', '7', '小米电视', '1', '0', '0', '2018-10-14 18:13:38', '2018-10-14 18:13:38');
INSERT INTO `xyz_item_cat` VALUES ('25', '24', '你的家', '1', '0', '0', '2018-10-15 13:13:14', '2018-10-15 13:13:14');
INSERT INTO `xyz_item_cat` VALUES ('27', '26', '那好吧', '1', '0', '0', '2018-10-15 13:14:30', '2018-10-15 13:14:30');
INSERT INTO `xyz_item_cat` VALUES ('28', '1', '家', '1', '0', '0', '2018-10-15 13:15:42', '2018-10-22 19:42:36');
INSERT INTO `xyz_item_cat` VALUES ('30', '28', '我的家', '0', '0', '0', '2018-10-15 21:54:25', '2018-10-15 21:54:25');
INSERT INTO `xyz_item_cat` VALUES ('34', '28', '你的家', '0', '0', '0', '2018-10-23 13:54:27', '2018-10-23 13:54:27');
INSERT INTO `xyz_item_cat` VALUES ('35', '8', '海尔空调', '1', '0', '0', '2018-12-25 09:01:58', '2018-12-25 09:01:58');

-- ----------------------------
-- Table structure for xyz_manager_content
-- ----------------------------
DROP TABLE IF EXISTS `xyz_manager_content`;
CREATE TABLE `xyz_manager_content` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL COMMENT '用户',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `content` text COMMENT '文章内容',
  `is_top` int(4) DEFAULT '0' COMMENT '默认0为不置顶 置顶的根据数值大小排序 同一数字的根据时间后的在上面',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='后台文章内容';

-- ----------------------------
-- Records of xyz_manager_content
-- ----------------------------
INSERT INTO `xyz_manager_content` VALUES ('1', '1', '111', '1111', '6', '2018-10-30 16:08:56', '2018-10-30 16:08:56');
INSERT INTO `xyz_manager_content` VALUES ('2', '2', '222', '222', '12', '2018-10-30 16:08:59', '2018-10-30 16:08:59');
INSERT INTO `xyz_manager_content` VALUES ('3', '3', '333', '333', '3', '2018-10-30 16:09:04', '2018-10-30 16:09:04');
INSERT INTO `xyz_manager_content` VALUES ('4', '4', '444', '<p>444</p>', '7', '2018-10-30 16:27:42', '2018-10-30 16:27:42');
INSERT INTO `xyz_manager_content` VALUES ('5', '5', '555', '555', '11', '2018-10-30 16:42:35', '2018-10-30 16:42:35');
INSERT INTO `xyz_manager_content` VALUES ('6', '6', '6666', '666', '10', '2018-10-30 16:42:42', '2018-10-30 16:42:42');
INSERT INTO `xyz_manager_content` VALUES ('7', '1', '我爱你', '<p>你知道不知道啊</p>', '0', '2018-10-30 17:18:44', '2018-10-30 17:18:44');
INSERT INTO `xyz_manager_content` VALUES ('8', '1', '777', '<p>77777</p>', '4', '2018-10-30 18:55:11', '2018-10-30 18:55:11');
INSERT INTO `xyz_manager_content` VALUES ('9', '1', '999', '<p>999</p>', '0', '2018-10-30 19:48:44', '2018-10-30 19:48:44');
INSERT INTO `xyz_manager_content` VALUES ('10', '1', '请你闭嘴 张权', '<p>你根本就不爱我</p><p>呵男人</p><p>呵男人&nbsp;</p><p>呵男人呵男人</p><p>呵男人</p><p>呵男人呵男人</p><p>v呵男人</p><p>v呵男人呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人</p><p>呵男人&nbsp;</p>', '12', '2018-10-30 21:25:24', '2018-10-30 21:25:24');
INSERT INTO `xyz_manager_content` VALUES ('11', '1', '我爱你张凯', '<p><img src=\"http://101.132.124.2/group1/M00/00/01/rBPcG1vYW-GAcHfzAADh_R4qAtE048.jpg\" style=\"max-width:100%;\"><br></p>', '13', '2018-10-30 21:25:59', '2018-10-30 21:25:59');
INSERT INTO `xyz_manager_content` VALUES ('12', '1', '张容祯  你个混蛋', '<p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p><p style=\"text-align: center;\"><span style=\"font-size: xx-large; text-decoration-line: underline; font-style: italic; background-color: rgb(249, 150, 59);\">张容祯  你个混蛋</span></p>', '12', '2018-10-30 21:27:05', '2018-10-30 21:27:05');
INSERT INTO `xyz_manager_content` VALUES ('13', '2', '测试内容', '<p>测试内容</p>', '13', '2019-03-16 10:26:06', '2019-03-16 10:26:06');

-- ----------------------------
-- Table structure for xyz_manager_message
-- ----------------------------
DROP TABLE IF EXISTS `xyz_manager_message`;
CREATE TABLE `xyz_manager_message` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` int(10) NOT NULL COMMENT '用户id',
  `nick` varchar(50) NOT NULL DEFAULT '一位神秘人' COMMENT '昵称',
  `message` varchar(200) NOT NULL DEFAULT '空' COMMENT '留言内容 200以内  应该更少才对',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='后台管理的留言板';

-- ----------------------------
-- Records of xyz_manager_message
-- ----------------------------
INSERT INTO `xyz_manager_message` VALUES ('1', '1', '一位神秘人', '大爱武警', '2018-12-11 10:12:41');
INSERT INTO `xyz_manager_message` VALUES ('2', '2', '一位神秘人', '你是不是我最爱的人', '2018-12-11 10:16:29');
INSERT INTO `xyz_manager_message` VALUES ('3', '4', '一位神秘人', '你不是我最爱的人', '2018-12-11 11:07:10');
INSERT INTO `xyz_manager_message` VALUES ('4', '2', '一位神秘人', '嘿嘿嘿', '2018-12-14 10:10:48');
INSERT INTO `xyz_manager_message` VALUES ('5', '2', '一位神秘人', '哈哈哈', '2018-12-14 10:10:53');
INSERT INTO `xyz_manager_message` VALUES ('6', '2', '一位神秘人', '今天我来答辩', '2018-12-26 06:38:52');
INSERT INTO `xyz_manager_message` VALUES ('7', '6', '一位神秘人', '没问题', '2018-12-26 06:52:29');
INSERT INTO `xyz_manager_message` VALUES ('8', '5', '一位神秘人', '我恨你', '2019-01-02 04:42:57');
INSERT INTO `xyz_manager_message` VALUES ('9', '2', '一位神秘人', '测试是否成功', '2019-03-16 09:17:46');
INSERT INTO `xyz_manager_message` VALUES ('10', '2', '一位神秘人', '123123123123', '2019-03-23 02:04:31');

-- ----------------------------
-- Table structure for xyz_manager_tag
-- ----------------------------
DROP TABLE IF EXISTS `xyz_manager_tag`;
CREATE TABLE `xyz_manager_tag` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `content` varchar(50) NOT NULL DEFAULT '空' COMMENT '标签内容',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_manager_tag
-- ----------------------------
INSERT INTO `xyz_manager_tag` VALUES ('1', '张权', '2018-12-11 10:27:47');
INSERT INTO `xyz_manager_tag` VALUES ('2', '张凯', '2018-12-11 10:27:57');
INSERT INTO `xyz_manager_tag` VALUES ('3', '司幸堯', '2018-12-11 10:28:02');
INSERT INTO `xyz_manager_tag` VALUES ('4', '小鸡鸡', '2018-12-11 10:28:07');
INSERT INTO `xyz_manager_tag` VALUES ('5', '张容祯', '2018-12-11 10:28:12');
INSERT INTO `xyz_manager_tag` VALUES ('6', '大帅逼', '2018-12-11 10:28:16');
INSERT INTO `xyz_manager_tag` VALUES ('7', '哈哈哈', '2018-12-26 06:39:07');
INSERT INTO `xyz_manager_tag` VALUES ('8', '今天Android答辩', '2019-01-02 04:44:02');
INSERT INTO `xyz_manager_tag` VALUES ('9', '马上结项', '2019-03-04 07:07:41');
INSERT INTO `xyz_manager_tag` VALUES ('10', '准备展示', '2019-03-16 10:27:33');

-- ----------------------------
-- Table structure for xyz_manager_total
-- ----------------------------
DROP TABLE IF EXISTS `xyz_manager_total`;
CREATE TABLE `xyz_manager_total` (
  `recordDateId` varchar(20) NOT NULL COMMENT '用 xxxx-xx-xx 日期作为主键 来统计访客等各种信息',
  `user_login` int(10) DEFAULT '0' COMMENT '会员登录的次数 当日统计',
  `user_register` int(10) DEFAULT '0' COMMENT '用户注册数量 当日统计',
  `user_visit` int(10) DEFAULT '0' COMMENT '用户浏览统计',
  `manager_push_content` int(5) DEFAULT '0' COMMENT '后台发帖统计',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`recordDateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用于统计站内信息';

-- ----------------------------
-- Records of xyz_manager_total
-- ----------------------------

-- ----------------------------
-- Table structure for xyz_manager_user
-- ----------------------------
DROP TABLE IF EXISTS `xyz_manager_user`;
CREATE TABLE `xyz_manager_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户的真是名称',
  `nick` varchar(50) NOT NULL DEFAULT '一位小可爱' COMMENT '昵称',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='后台管理的用户';

-- ----------------------------
-- Records of xyz_manager_user
-- ----------------------------
INSERT INTO `xyz_manager_user` VALUES ('1', '张权', '小权权', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:40:34', '2018-10-27 10:40:34', 'f379eaf3c831b04de153469d1bec345e');
INSERT INTO `xyz_manager_user` VALUES ('2', '张凯', '小凯凯', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:40:51', '2018-12-11 18:31:56', 'f379eaf3c831b04de153469d1bec345e');
INSERT INTO `xyz_manager_user` VALUES ('3', '姬广锐', '小鸡鸡', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:41:03', '2018-10-27 10:41:03', 'f379eaf3c831b04de153469d1bec345e');
INSERT INTO `xyz_manager_user` VALUES ('4', '司幸堯', '司丽丽', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:42:10', '2018-10-27 10:42:10', 'f379eaf3c831b04de153469d1bec345e');
INSERT INTO `xyz_manager_user` VALUES ('5', '张容祯', '小针针', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:42:34', '2018-10-27 10:42:34', 'f379eaf3c831b04de153469d1bec345e');
INSERT INTO `xyz_manager_user` VALUES ('6', '李延富', '大帅逼', '137****4321', 'zhangkai@qq.com', '2018-10-27 10:43:02', '2018-12-13 17:42:50', 'c4b2a7845e7e36cabd945f3c67696d35');

-- ----------------------------
-- Table structure for xyz_message
-- ----------------------------
DROP TABLE IF EXISTS `xyz_message`;
CREATE TABLE `xyz_message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `item_id` bigint(20) NOT NULL,
  `msg` varchar(500) NOT NULL,
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_message
-- ----------------------------
INSERT INTO `xyz_message` VALUES ('1', '13', '154478247835677', '我爱你', '2019-03-22 03:21:33', '姬广锐');
INSERT INTO `xyz_message` VALUES ('2', '13', '154478247835676', '这女的卖么？', '2019-03-23 02:01:01', '姬广锐');
INSERT INTO `xyz_message` VALUES ('3', '13', '154478247835676', '', '2019-03-23 02:03:20', '姬广锐');
INSERT INTO `xyz_message` VALUES ('4', '13', '154478247835675', '哇 我好像要啊', '2019-03-23 06:38:47', '姬广锐');
INSERT INTO `xyz_message` VALUES ('5', '19', '154478247835680', '121212', '2019-04-19 14:18:51', '1');
INSERT INTO `xyz_message` VALUES ('6', '1', '154478247835675', '', '2019-06-06 02:24:32', '校园猪');
INSERT INTO `xyz_message` VALUES ('7', '21', '154478247835675', 'dfgdfg', '2019-06-13 02:40:17', 'admin');

-- ----------------------------
-- Table structure for xyz_need
-- ----------------------------
DROP TABLE IF EXISTS `xyz_need`;
CREATE TABLE `xyz_need` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `xyz_desc` varchar(1000) DEFAULT NULL COMMENT '需求介绍 描述',
  `phone` varchar(20) NOT NULL,
  `nick` varchar(50) NOT NULL,
  `price` varchar(50) DEFAULT NULL,
  `xyz_type` int(10) NOT NULL COMMENT '1担任需求 2学生兼职  3众包需求',
  `jz_type` int(10) DEFAULT NULL COMMENT '1 临时工 2短期临时工作 3 寒假作业',
  `jz_num` int(10) DEFAULT NULL COMMENT '兼职人数',
  `jz_zhusu` int(10) DEFAULT '0' COMMENT '0 不提供  1提供餐饮 2提供住宿 3提供食宿',
  `jz_price_type` int(10) DEFAULT NULL COMMENT '0 按日结算 1周 2月 3工作时长 4工作完成后',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0 刚发布 未完成 1取消发布 2完成  ',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_need
-- ----------------------------
INSERT INTO `xyz_need` VALUES ('8', '需要租一台相机', '时间一天  什么牌子的都行', '199705194321', '不知所云', '99', '1', null, null, '0', null, '0', '13');
INSERT INTO `xyz_need` VALUES ('9', '请教高数问题（急急急急急急）', '擅长高数的来！！！！\r\n重金！！！！', '12345678910', '我恨高数', '88', '1', null, null, '0', null, '0', '13');
INSERT INTO `xyz_need` VALUES ('10', '餐厅钟点工', '主要工作是叫号，打菜和辅助厨师工作', '9521346814', '分享餐厅老板娘', '150', '2', '1', '5', '1', '0', '0', '13');
INSERT INTO `xyz_need` VALUES ('11', '高薪聘请保安10名（重金！！！！）', '维持会场纪律，服从指挥即可', '13782569376', '天河雇佣', '120', '2', '2', '10', '1', '0', '0', '13');
INSERT INTO `xyz_need` VALUES ('12', '设计系徽', '主要就是符合咱们计算机系的气势', '13782569333', '刘主任', null, '3', null, null, '0', null, '0', '13');
INSERT INTO `xyz_need` VALUES ('13', '告白计划', '重金求子。。。哦不，，为了我的终身幸福，求求求各位大佬们帮我像一个浪漫又不失典雅，典雅又不失庄重，庄重又。。。哎呀就是能让我成功就好了！！！！', '997513145', '爱过别走', null, '3', null, null, '0', null, '0', '13');
INSERT INTO `xyz_need` VALUES ('14', '李哥玩劫', '莫得啦', '152960', '苏某', '1', '1', null, null, '0', null, '0', '20');

-- ----------------------------
-- Table structure for xyz_need_fav
-- ----------------------------
DROP TABLE IF EXISTS `xyz_need_fav`;
CREATE TABLE `xyz_need_fav` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `need_id` bigint(20) NOT NULL,
  `need_type` int(10) NOT NULL DEFAULT '0' COMMENT '0 收藏 1 接受需求',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of xyz_need_fav
-- ----------------------------
INSERT INTO `xyz_need_fav` VALUES ('3', '13', '8', '1');
INSERT INTO `xyz_need_fav` VALUES ('4', '13', '8', '0');
INSERT INTO `xyz_need_fav` VALUES ('5', '13', '10', '1');
INSERT INTO `xyz_need_fav` VALUES ('7', '18', '8', '1');
INSERT INTO `xyz_need_fav` VALUES ('8', '1', '8', '0');
INSERT INTO `xyz_need_fav` VALUES ('9', '21', '8', '1');

-- ----------------------------
-- Table structure for xyz_user
-- ----------------------------
DROP TABLE IF EXISTS `xyz_user`;
CREATE TABLE `xyz_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱地址',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `nickname` varchar(100) DEFAULT NULL COMMENT '姓名，昵称（例如QQ名称）',
  `icon` varchar(200) DEFAULT NULL COMMENT '头像图片地址',
  `sex` int(4) DEFAULT '3' COMMENT '性别, 1:男，2:女，3：保密',
  `re_name` varchar(50) DEFAULT NULL COMMENT '真实名称',
  `re_school` varchar(100) DEFAULT NULL COMMENT '所属校园',
  `re_idcard` varchar(50) DEFAULT NULL COMMENT '身份证',
  `state` int(4) DEFAULT '0' COMMENT '用户状态，0:正常，1:冻结',
  `last_login_date` datetime DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` datetime DEFAULT NULL COMMENT '最后登录ip',
  `is_del` int(4) DEFAULT '0' COMMENT '是否删除0正常1删除',
  `is_email_confirmed` int(4) DEFAULT '0' COMMENT '是否绑定邮箱1绑定0未绑定',
  `is_phone_confirmed` int(4) DEFAULT '0' COMMENT '是否绑定手机1绑定0未绑定',
  `mac` char(64) DEFAULT NULL COMMENT 'mac地址',
  `source` int(4) DEFAULT '0' COMMENT '1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `phone` (`phone`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of xyz_user
-- ----------------------------
INSERT INTO `xyz_user` VALUES ('1', 'xyz', '202cb962ac59075b964b07152d234b70', '456', '123', '2018-10-26 14:02:09', '2018-10-26 14:02:09', null, null, '/favicon.ico', null, '校园猪', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `xyz_user` VALUES ('13', '111', 'f53799283cca52914c013e78babb75ac', '12345678910', '12345678910@163.com', '2019-03-06 13:49:22', '2019-03-06 13:49:22', null, '爱你么么哒', '/1552616236154head.jpg', '3', '姬广锐', '安阳工学院', null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('14', '222', '40e79c7ca72b0f3789e36d88af0d62ec', '19970431852', '841535153@qq.com', '2019-03-08 15:10:34', '2019-03-08 15:10:34', null, '你是真的皮', '/155202910547111.jpg', '3', '张凯', '安阳工学院', null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('15', '333', '972bf7c894648801a543823c206145c2', '91531531535', '4465415315@qq.com', '2019-03-08 15:21:26', '2019-03-08 15:21:26', null, '英雄不问出处', '/155203235988515519618779732.jpg', '3', '张权', '安阳工学院', null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('16', 'EsunR', '98df4fd437981434cfe5c23b9918c9c6', '18337256240', null, '2019-03-08 17:06:25', '2019-03-08 17:06:25', null, null, null, '3', '小姬姬', null, null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('17', '张容祯', '98df4fd437981434cfe5c23b9918c9c6', '13782569377', null, '2019-03-14 18:35:46', '2019-03-14 18:35:46', null, null, null, '3', '张容祯', null, null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('18', 'zsj', '98df4fd437981434cfe5c23b9918c9c6', '111', null, '2019-03-23 09:35:40', '2019-03-23 09:35:40', null, null, null, '3', '张思静', null, null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('19', '1', 'f112fb1a3e0660e6866998840c8b9a2e', '12121212121', null, '2019-04-19 14:10:14', '2019-04-19 14:10:14', null, null, null, '3', '1', null, null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('20', '逆风笑', '11a81d7bfeb37b5482f74ff02d70e065', '44', null, '2019-05-31 12:30:11', '2019-05-31 12:30:11', null, null, null, '3', '11', null, null, '0', null, null, '0', '0', '0', null, '0');
INSERT INTO `xyz_user` VALUES ('21', 'adminya', '796ee1bd5cc0445ee39fc3dee2ac992c', '18556810300', null, '2019-06-13 02:38:06', '2019-06-13 02:38:06', null, null, null, '3', 'admin', null, null, '0', null, null, '0', '0', '0', null, '0');
