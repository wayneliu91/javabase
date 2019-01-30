package com.repose.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 刘山禾 2018年11月04日 新建
 * @since JDK1.7
 */
public class ServiceInvocationHandlerImpl implements InvocationHandler {

    private Object service;

    public ServiceInvocationHandlerImpl(Object service) {
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object returnValue = method.invoke(service, args);
        System.out.println("调用后");
        return returnValue;
    }
}
