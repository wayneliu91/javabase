package com.repose;

import java.util.Random;

/**
 * @author 刘山禾 2018年07月05日 新建
 * @since JDK1.7
 */
public class TestLuckyBag {

    public static void main(String[] args) {
        test1();
    }


    private static void test1() {
        //[0,10000)
        int a = 10000;
        //[10000,18000)
        int b = 8000;
        //[18000,20000)
        int c = 2000;
        //[20000,20100)
        int d = 100;

        int totalWeight = a + b + c + d;


        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int nextInt = random.nextInt(totalWeight);
            if (nextInt >= 0 && nextInt < 10000) {
                System.out.println("a");
            } else if (nextInt >= 10000 && nextInt < 18000) {
                System.out.println("b");
            } else if (nextInt >= 18000 && nextInt < 20000) {
                System.out.println("c");
            } else if (nextInt >= 20000 && nextInt < 20100) {
                System.out.println("d");
            }
        }
    }

}
