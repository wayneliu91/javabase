package com.repose.commons.lang3.time;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 刘山禾 2018年07月31日 新建
 * @since JDK1.7
 */
public class DateUtilsTest {

    private static final FastDateFormat FAST_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    @Test
    public void test() {
        long now = System.currentTimeMillis();

    }

    @Test
    public void testTomorrow() {
        int effectDate = 1;
        int validityDate = 2;
        // 立即生效
        Date date = new Date();
        Date addDays = DateUtils.addDays(date, -32);
        Date truncate = DateUtils.truncate(addDays, Calendar.DAY_OF_MONTH);
        System.out.println(truncate.getTime());
        System.out.println(FAST_DATE_FORMAT.format(truncate));

        Date startTime = DateUtils.addDays(truncate, effectDate);

        Date addHours = DateUtils.addHours(startTime, 24 * validityDate);
        Date endTime = DateUtils.addSeconds(addHours, -1);
        System.out.println(FAST_DATE_FORMAT.format(startTime));
        System.out.println(FAST_DATE_FORMAT.format(endTime));
    }

    @Test
    public void format() {
        Date date = new Date();
        FastDateFormat dateInstance = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM);
        String format = dateInstance.format(date);
        System.out.println(format);
    }

    @Test
    public void testDateUtil() {
        Date current = new Date();
        Date round = DateUtils.truncate(current, Calendar.DAY_OF_MONTH);
        Date date = DateUtils.addSeconds(round, -1);
        System.out.println(FAST_DATE_FORMAT.format(date));

        Date tomorrow = DateUtils.addDays(current, 1);
        Date truncate = DateUtils.truncate(tomorrow, Calendar.DAY_OF_MONTH);
        System.out.println(FAST_DATE_FORMAT.format(truncate));
    }
}
