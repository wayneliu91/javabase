package com.repose;

import com.alibaba.fastjson.JSON;
import com.repose.entity.Order;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

/**
 * @author 刘山禾 2018年08月03日 新建
 * @since JDK1.7
 */
public class TestNumeric {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(1, MathContext.DECIMAL32);
        System.out.println(bigDecimal.stripTrailingZeros().toPlainString());
        int i = bigDecimal.intValue();
        System.out.println(i);
    }

    private static void testDecimal() {
        Order order = new Order();
        order.setOrderId("uWVJEm");
        order.setValue(new BigDecimal("23.00"));
        System.out.println(JSON.toJSON(order));
    }

    private static void testDouble() {
        Double d = 1.23;
        System.out.println(d.intValue());
    }

    private static void testNumeric() {
        String s = "1.1111E+13";
        Double d = Double.valueOf(s);
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        String format = decimalFormat.format(d);
        System.out.println(format);
    }
}
