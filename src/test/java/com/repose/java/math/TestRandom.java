package com.repose.java.math;

import org.junit.Test;

import java.util.Random;

/**
 * @author 刘山禾 2018年10月20日 新建
 * @since JDK1.7
 */
public class TestRandom {

    @Test
    public void test0() {
        for (int i = 0; i < 100; i++) {
            int m = new Random().nextInt(3);
            System.out.println(m);
        }
    }
}
