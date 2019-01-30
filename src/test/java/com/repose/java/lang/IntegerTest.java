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

    @Test
    public void parseInt() {
        int i = Integer.parseInt("512");
        System.out.println(i);
    }

    @Test
    public void TestToString() {
        String s = Integer.toString(512);
        System.out.println(s);
    }

    @Test
    public void decode() {
        Integer decode = Integer.decode("0x10");
        System.out.println(decode);
    }

    @Test
    public void valueOf() {
        Integer integer = Integer.valueOf(123);
        System.out.println(integer);
    }
}
