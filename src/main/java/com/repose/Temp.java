package com.repose;

import java.util.Random;

/**
 * @author 刘山禾 2018年06月19日 新建
 * @since JDK1.7
 */
public class Temp {

    public static void main(String[] args) {
        String phone = "8618501234234";

        String hidenPhone = phone.replaceAll("(\\d{5})\\d{4}(\\d{4})", "$1****$2");

        System.out.println(hidenPhone);

    }

    private static void mutiThread() {
        new Thread(() -> System.out.println("1.aaaaa"), "a线程").start();

        new Thread(() -> System.out.println("2.bbbbb"), "b线程").start();

        new Thread(() -> System.out.println("3.ccccc"), "c线程").start();
    }

    private static void testInterval() {
        int x = 4;
        int y = 7;
        int randNum = new Random().nextInt(y - x + 1);
        if (randNum > 10) {
            throw new RuntimeException("区间范围超出福袋容量");
        }
        System.out.println(randNum + x);
    }

}
