package com.repose;

import org.apache.commons.lang3.time.FastDateFormat;

import java.sql.Date;

/**
 * 时间测试
 *
 * @author 刘山禾 2018年07月06日 新建
 * @since JDK1.7
 */
public class TestSqlDate {

    private static final FastDateFormat FAST_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd");

    public static void main(String[] args) {

        System.out.println(new Date(System.currentTimeMillis()));

        // 模拟客户端传来的日期
        Date date = new Date(System.currentTimeMillis());
        testDate(date);
    }

    private static void testDate(Date date) {
        long currentTimeMillis = System.currentTimeMillis();
        Date current = new Date(currentTimeMillis);
        if (date.after(current)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
