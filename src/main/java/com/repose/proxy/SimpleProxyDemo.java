package com.repose.proxy;

/**
 * @author 刘山禾 2018年11月19日 新建
 * @since JDK1.7
 */
public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }

}
