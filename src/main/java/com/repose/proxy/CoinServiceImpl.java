package com.repose.proxy;

/**
 * @author 刘山禾 2018年11月04日 新建
 * @since JDK1.7
 */
public class CoinServiceImpl implements CoinService {
    @Override
    public void add() {
        System.out.println("发放云币");
    }

    @Override
    public void update() {
        System.out.println("使用云币");
    }
}
