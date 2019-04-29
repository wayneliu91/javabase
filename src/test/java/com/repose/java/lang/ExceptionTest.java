package com.repose.java.lang;

import org.junit.Test;

/**
 * @author 常清 2019年03月14日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class ExceptionTest {


    @Test
    public void TestTry() {
        try {
            if (1 > 0) {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("捕获了RuntimeException");
        }
    }
}
