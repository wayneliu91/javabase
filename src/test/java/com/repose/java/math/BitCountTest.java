package com.repose.java.math;

import org.junit.Test;

/**
 * 二进制计算
 *
 * @author 常清 2019年02月20日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class BitCountTest {


    @Test
    public void leftMov() {
        System.out.println(movLeft(3));
    }


    private boolean isUsable(int i, int channel) {
        return (channel & movLeft(i)) > 0;
    }

    private int movLeft(int i) {
        return 1 << (i - 1);
    }
}
