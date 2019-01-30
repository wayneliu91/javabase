package com.repose.proxy;

/**
 * @author 刘山禾 2018年11月19日 新建
 * @since JDK1.7
 */
public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
