package com.repose.java.util;

import org.junit.Test;

import java.util.Random;

/**
 * @author 刘山禾 2018年08月03日 新建
 * @since JDK1.7
 */
public class RandomTest {

    @Test
    public void test() {
        testRandom();
    }

    private static void testRandom() {
        int nextInt = new Random().nextInt(1);
        System.out.println(nextInt);
    }
}
