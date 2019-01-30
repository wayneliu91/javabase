package com.repose.java.util;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 刘山禾 2018年11月06日 新建
 * @since JDK1.7
 */
public class DateUtilTest {

    private static final FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss");

    @Test
    public void name() {
        Date date = DateUtils.addMinutes(new Date(), 20);
        System.out.println(FORMAT.format(date));
        Date expTime = getExpTime(date);
        System.out.println(FORMAT.format(expTime));
    }


    private static Date getExpTime(Date now) {
        Date truncate = DateUtils.truncate(now, Calendar.HOUR_OF_DAY);
        Date date = DateUtils.addMinutes(truncate, 20);

        if (now.before(date)) {
            return DateUtils.addHours(date, -1);
        } else {
            return date;
        }
    }


    @Test
    public void overlap() throws ParseException {
        boolean b = checkTimeOverlap(FORMAT.parse("2018-12-05 00:00:00"), FORMAT.parse("2018-12-05 23:59:59"), FORMAT.parse("2018-12-06 00:00:00"), FORMAT.parse("2018-12-06 23:59:59"));
        System.out.println(b);
    }

    private static boolean checkTimeOverlap(Date leftStartDate, Date leftEndDate, Date rightStartDate,
                                            Date rightEndDate) {
        return rightStartDate.getTime() <= leftEndDate.getTime()
                && rightEndDate.getTime() >= leftStartDate.getTime();
    }
}
