package com.repose;

/**
 * @author 刘山禾 2018年07月13日 新建
 * @since JDK1.7
 */
public class BatchSQL {

    public static void main(String[] args) {
        tableA();
    }


    private static void tableA() {
        int index = 1024;
        for (int i = 0; i < index; i++) {
            System.out.println("CREATE TABLE `t_fullcoupon_user_" + i + "_his` (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统自增Id',\n" +
                    "  `fullcoupon_user_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '使用业务id',\n" +
                    "  `consumer_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户id',\n" +
                    "  `status` tinyint(2) DEFAULT '0' COMMENT '使用状态：默认0未使用，1已使用，2已支付，3已过期，4已作废，5已转赠',\n" +
                    "  `fullcoupon_id` int(11) NOT NULL COMMENT '优惠卷id',\n" +
                    "  `value` int(11) NOT NULL COMMENT '面额',\n" +
                    "  `use_scope` tinyint(4) NOT NULL DEFAULT '0' COMMENT '使用范围，默认0全场通用(除跨境商品)',\n" +
                    "  `use_value` int(11) NOT NULL DEFAULT '0' COMMENT '订单满多少值可以使用',\n" +
                    "  `use_channel` tinyint(2) DEFAULT '7' COMMENT '使用渠道（以二进制位表示）：第一位代表云集微店，第二位代表云集VIP，第三位代表微信端H5 其中每一位：1-代表可使用0-代表不可使用',\n" +
                    "  `give_consumer_id` int(11) DEFAULT '0' COMMENT '转赠者用户id 当优惠券为他人转赠时有非0值',\n" +
                    "  `source_fullcoupon_user_id` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '转赠人转赠的优惠券业务id，当give_consumer_id非0时该字段有值',\n" +
                    "  `from_order_id` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '当优惠券为下单所返券时记录对应的订单id',\n" +
                    "  `start_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '有效期开始',\n" +
                    "  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '有效期结束',\n" +
                    "  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n" +
                    "  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',\n" +
                    "  `order_id` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '下单后使用的订单号Id',\n" +
                    "  `phone` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '买家手机号码',\n" +
                    "  `union_id` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '买家微信unionid',\n" +
                    "  `use_scope_value` text COLLATE utf8_unicode_ci,\n" +
                    "  `batch_no` varchar(64) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '批次号，值为原始用户优惠券业务ID',\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  KEY `index_fullcouponUserId_consumerId` (`fullcoupon_user_id`,`consumer_id`),\n" +
                    "  KEY `index_fullcoupon_id` (`fullcoupon_id`,`consumer_id`),\n" +
                    "  KEY `index_consumerId_status` (`consumer_id`,`status`),\n" +
                    "  KEY `index_consumer_status_time` (`consumer_id`,`status`,`create_time`),\n" +
                    "  KEY `idx_status_end_time` (`status`,`end_time`) USING BTREE,\n" +
                    "  KEY `idx_fullcoupon_user_id` (`fullcoupon_user_id`) USING BTREE\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户优惠券表';");
        }
    }
}
