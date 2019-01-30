package com.repose.proxy;

/**
 * @author 刘山禾 2018年11月04日 新建
 * @since JDK1.7
 */
public class CouponServiceImpl implements CouponService {

    @Override
    public void add() {
        System.out.println("创建优惠券");
    }


    @Override
    public void update() {
        System.out.println("修改优惠券");
    }

}
