package com.repose.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 刘山禾 2018年11月04日 新建
 * @since JDK1.7
 */
public class CouponController {

    public static void main(String[] args) {
        CouponService couponService = new CouponServiceImpl();
        InvocationHandler serviceInvocationHandler = new ServiceInvocationHandlerImpl(couponService);

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        CouponService instance = (CouponService) Proxy.newProxyInstance(
                couponService.getClass().getClassLoader(), couponService.getClass().getInterfaces(),
                serviceInvocationHandler);
        instance.add();
        instance.update();
    }

}
