package com.repose.java.lang;

import org.junit.Test;

/**
 * @author 刘山禾 2018年09月28日 新建
 * @since JDK1.7
 */
public class IntegerTest {

    @Test
    public void compare() {
        int compare = Integer.compare(10, 20);
        System.out.println(compare);
    }
}
