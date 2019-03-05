package com.repose.java.util;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 刘山禾 2018年09月28日 新建
 * @since JDK1.7
 */
public class DateTest {

    private static final FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    private static final long ONE_HOURS = 1000 * 60 * 60;

    @Test
    public void getTime() throws ParseException {
        long currentTimeMillis = System.currentTimeMillis();
        Date parse = FORMAT.parse("2018-10-01 23:59:59");
        long diff = parse.getTime() - currentTimeMillis;
        System.out.println(diff / ONE_HOURS);
    }

    @Test
    public void parse() throws ParseException {
        Date date = FORMAT.parse("2019-01-24 09:00:00");
        System.out.println(date);
    }

    @Test
    public void format() {
        Date date = new Date(1554526016000L);
        System.out.println(FORMAT.format(date));
    }

    @Test
    public void trucate() {
        Date date = new Date(1554526016000L);
        System.out.println(date.getTime());

        Date truncate = DateUtils.truncate(date, Calendar.SECOND);
        long time = truncate.getTime();
        System.out.println(time);

        Date date1 = new Date(time);
        System.out.println(date1.getTime());

        Date round = DateUtils.round(date, Calendar.SECOND);
        System.out.println(round.getTime());
    }

    @Test
    public void second() throws ParseException {
        Date parse = FORMAT.parse("2019-02-21 00:00:01");
        Date parse1 = FORMAT.parse("2019-02-21 12:00:00");
        long l = (parse1.getTime() - parse.getTime()) / (60L * 60 * 1000);
        System.out.println(l);
    }

    @Test
    public void diff() throws ParseException, NoSuchFieldException, IllegalAccessException {
        Date u1 = FORMAT.parse("2019-02-21 12:00:10");
        Date u2 = FORMAT.parse("2019-02-21 12:00:00");

        java.sql.Date s1 = new java.sql.Date(u1.getTime());
        java.sql.Date s2 = new java.sql.Date(u2.getTime());

        System.out.println(s1);
        System.out.println(s2);

        if (s2.before(s1)) {
            System.out.println("大于");
        }

        Field fastTime = s1.getClass().getSuperclass().getDeclaredField("fastTime");
        fastTime.setAccessible(true);
        System.out.println(fastTime.get(s1));
        System.out.println(s1.getTime());

        Field fastTime1 = s2.getClass().getSuperclass().getDeclaredField("fastTime");
        fastTime1.setAccessible(true);
        System.out.println(fastTime1.get(s2));
        System.out.println(s2.getTime());

        Date truncate = DateUtils.truncate(u1, Calendar.MINUTE);
        Date truncate1 = DateUtils.truncate(u2, Calendar.MINUTE);


        if (truncate.equals(truncate1)) {
            System.out.println("等于");
        }

        if (truncate1.before(truncate)) {
            System.out.println("2大于");
        }

    }
}
