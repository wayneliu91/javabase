package com.repose.collection;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

/**
 * @author 11629
 */
public class TestCommonsDate {
    public static void main(String[] args) {
        testDate();
        testString();
    }

    private static void testString() {
        boolean empty = StringUtils.isEmpty(" ");
        System.out.println(empty);
    }

    private static void testDate() {
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        String format = fastDateFormat.format(new Date());
        System.out.println(format);

        String format1 = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(format1);
    }
}
