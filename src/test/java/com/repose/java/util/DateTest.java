package com.repose.java.util;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

/**
 * @author 刘山禾 2018年09月28日 新建
 * @since JDK1.7
 */
public class DateTest {

    private static final FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss");

    private static final long ONE_HOURS = 1000*60*60;

    @Test
    public void getTime() throws ParseException {
        long currentTimeMillis = System.currentTimeMillis();
        Date parse = FORMAT.parse("2018-10-01 23:59:59");
        long diff = parse.getTime() - currentTimeMillis;
        System.out.println(diff/ ONE_HOURS);
    }
}
