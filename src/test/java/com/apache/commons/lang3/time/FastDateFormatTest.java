package com.apache.commons.lang3.time;

import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;

import java.util.Date;

public class FastDateFormatTest {

    @Test
    public void getInstance() {
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        String format = fastDateFormat.format(new Date());
        System.out.println(format);
    }
}
