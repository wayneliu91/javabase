package com.repose;

/**
 * @author 刘山禾 2018年07月13日 新建
 * @since JDK1.7
 */
public class BatchSQL {

    public static void main(String[] args) {
        data();
    }

    private static void data() {
        int idx = 10000;
        for (int i = 0; i < idx; i++) {
            System.out.println(
                    "INSERT INTO `t_gain_detail_a_5` (lucky_bag_id,recipient_id,publisher_id,result,total_value,best,grab_time,status) VALUES(1100000005,0,435883,'{\\\"coupon\\\":\\\"0\\\"}',0,0,'2018-07-15 18:39:22',1);");
        }
    }

    private static void tableA() {
        int index = 1000;
        for (int i = 0; i < index; i++) {
            System.out.println("CREATE TABLE `t_gain_detail_a_" + i + "` (\n"
                    + "  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',\n"
                    + "  `lucky_bag_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '福袋ID',\n"
                    + "  `recipient_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '领取人ID',\n"
                    + "  `publisher_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '发袋人ID',\n"
                    + "  `result` varchar(500) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取结果（Json格式）',\n"
                    + "  `total_value` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '总金额',\n"
                    + "  `best` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否手气最佳位，默认0-是，1-不是',\n"
                    + "  `grab_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '领取时间',\n"
                    + "  `status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '状态，默认1-未领取，2-已领取',\n"
                    + "  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n"
                    + "  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',\n"
                    + "  PRIMARY KEY (`id`),\n"
                    + "  KEY `udx_lucky_bag_id_recipient_id` (`lucky_bag_id`,`recipient_id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='领取记录A表（以福袋ID分表）';");
        }
    }

    private static void tableB() {
        int index = 1000;
        for (int i = 0; i < index; i++) {
            System.out.println("CREATE TABLE `t_gain_detail_b_" + i + "` (\n"
                    + "  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',\n"
                    + "  `lucky_bag_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '福袋ID',\n"
                    + "  `recipient_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '领取人ID',\n"
                    + "  `publisher_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '发袋人ID',\n"
                    + "  `result` varchar(500) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取结果（Json格式）',\n"
                    + "  `total_value` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '总金额',\n"
                    + "  `best` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否手气最佳位，默认0-是，1-不是',\n"
                    + "  `grab_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '领取时间',\n"
                    + "  `status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '状态，默认1-未领取，2-已领取',\n"
                    + "  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n"
                    + "  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',\n"
                    + "  PRIMARY KEY (`id`),\n"
                    + "  KEY `udx_lucky_bag_id_recipient_id` (`lucky_bag_id`,`recipient_id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='领取记录A表（以福袋ID分表）';");
        }
    }

    private static void luckyBag() {
        int size = 1000;
        for (int i = 0; i < size; i++) {
            System.out.println("CREATE TABLE `t_lucky_bag_" + i + "` (\n"
                    + "  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',\n"
                    + "  `lucky_bag_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '福袋ID',\n"
                    + "  `publisher_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '发福袋人ID',\n"
                    + "  `shop_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '发放人所属店铺ID',\n"
                    + "  `order_id` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '订单ID',\n"
                    + "  `capacity` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '袋中容量',\n"
                    + "  `stock` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '袋中剩余库存',\n"
                    + "  `best_position` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '手气最佳位置',\n"
                    + "  `bag_type` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '福袋类型，1-优惠券',\n"
                    + "  `status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '状态，默认1-领取中，2-已领完，3-已失效',\n"
                    + "  `view_time` tinyint(1) unsigned NOT NULL DEFAULT '24' COMMENT '订单详情页发袋按钮展示时间',\n"
                    + "  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间（即领取时间）',\n"
                    + "  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',\n"
                    + "  PRIMARY KEY (`id`),\n" + "  UNIQUE KEY `udx_lucky_bag_id` (`lucky_bag_id`),\n"
                    + "  UNIQUE KEY `udx_order_id` (`order_id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='福袋';");
        }
    }

    private static void luckyBagConfig() {
        System.out.println("DROP TABLE IF EXISTS `t_lucky_bag_config`;\n"
                + "CREATE TABLE `t_lucky_bag_config` (\n"
                + "  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',\n"
                + "  `function_switch` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '功能开关，默认1-开，2-关',\n"
                + "  `content_type` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '福袋支持的币种，二进制转的数字',\n"
                + "  `coupon_info` varchar(3000) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '配的券ID,List<CouponInfoDTO>',\n"
                + "  `capacity` tinyint(1) unsigned NOT NULL DEFAULT '10' COMMENT '单个福袋里，可供领取的用户数量',\n"
                + "  `best_interval` varchar(50) COLLATE utf8_bin DEFAULT '' COMMENT '手气最佳位置范围',\n"
                + "  `bag_limit` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '单个福袋里，每个用户可领优惠券或云币张数',\n"
                + "  `day_limit` tinyint(1) unsigned NOT NULL DEFAULT '5' COMMENT '单个用户单日最多可领取的次数',\n"
                + "  `publish_mode` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '福袋发放模式，默认1-下单指定商品，2-全量商品',\n"
                + "  `appoint_item` varchar(5000) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '发放限制为指定商品时，商品配置（ID，图片，文案）list<ItemInfoDTO>',\n"
                + "  `view_time` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '付款时间起X=+24小时内，该订单详情页内悬浮福袋标志',\n"
                + "  `icon` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '支付完成页icon',\n"
                + "  `text1` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '支付完成页文案1',\n"
                + "  `text2` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '支付完成页文案2',\n"
                + "  `text3` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '支付完成页分享按钮文案',\n"
                + "  `link_title` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '分享链接标题',\n"
                + "  `link_text` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '分享链接文案',\n"
                + "  `link_img` varchar(500) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '分享链接图片',\n"
                + "  `grab_pop_up_window_title` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取弹窗》标题',\n"
                + "  `grab_pop_ups_text` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取弹窗》文案',\n"
                + "  `wechat_head_url` varchar(300) COLLATE utf8_bin NOT NULL COMMENT '微信默认头像',\n"
                + "  `grab_in_text` varchar(1000) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取页》订单中商品文案，List<String>',\n"
                + "  `grab_not_in_text` varchar(1000) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取页》非订单中商品文案，List<String>',\n"
                + "  `jump_type` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '领取页》商品跳转类型，默认0-跳商详，1-专题',\n"
                + "  `biz_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '跳专题时需要填写专题ID',\n"
                + "  `grab_page_text` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '领取页》领取到文案',\n"
                + "  `ai_item_store_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '智能商品库ID',\n"
                + "  `activity_rules` varchar(5000) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '活动规则',\n"
                + "  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n"
                + "  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',\n"
                + "  `create_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '创建人ID',\n"
                + "  `modify_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '最后修改人ID',\n"
                + "  PRIMARY KEY (`id`)\n"
                + ") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='福袋配置';");
    }
}
