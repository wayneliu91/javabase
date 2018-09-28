package com.repose.java.math;

import java.math.BigDecimal;
import java.math.MathContext;

import com.alibaba.fastjson.JSON;
import com.repose.entity.Order;

/**
 * @author 刘山禾 2018年09月06日 新建
 * @since JDK1.7
 */
public class TestDecimal {

    public static void main(String[] args) {
        testSerializable();
    }

    private static void testSerializable() {
        Order order = new Order();
        order.setOrderId("yj123456");
        order.setValue(new BigDecimal(64.993, MathContext.DECIMAL32));
        String s = JSON.toJSONString(order);
        System.out.println(s);
        Order order1 = JSON.parseObject(s, Order.class);
        System.out.println(order1.getValue().stripTrailingZeros().toPlainString());
    }

    private static void testCompare() {
        BigDecimal b1 = new BigDecimal(10.5, MathContext.DECIMAL32);
        BigDecimal b2 = new BigDecimal(10.04, MathContext.DECIMAL32);
        BigDecimal subtract = b1.subtract(b2);
        int compare = b2.compareTo(b2);
        if (compare > 0) {
            System.out.println("b1>b2");
        }
        System.out.println(subtract.stripTrailingZeros().toPlainString());
    }
}
