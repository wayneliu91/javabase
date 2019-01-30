package com.repose.proxy;

import java.lang.reflect.Proxy;

/**
 * @author 刘山禾 2018年11月19日 新建
 * @since JDK1.7
 */
public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(realObject
        ));
        consumer(proxy);
    }
}
