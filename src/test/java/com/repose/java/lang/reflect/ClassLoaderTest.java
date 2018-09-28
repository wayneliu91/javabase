package com.repose.java.lang.reflect;

import org.junit.Test;

/**
 * @author 刘山禾 2018年08月26日 新建
 * @since JDK1.7
 */
public class ClassLoaderTest {

    @Test
    public void test() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:" + loader);
        System.out.println("parent loader:" + loader.getParent());
        System.out.println("grandparent loader:" + loader.getParent().getParent());
    }
}
