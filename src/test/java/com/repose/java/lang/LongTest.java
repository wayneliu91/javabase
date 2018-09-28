package com.repose.java.lang;

import org.junit.Test;

/**
 * @author 刘山禾 2018年09月28日 新建
 * @since JDK1.7
 */
public class LongTest {

    @Test
    public void compare() {
        int compare = Long.compare(200L, 30L);
        System.out.println(compare);
    }
}
