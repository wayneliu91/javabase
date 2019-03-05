package com.repose;

import com.repose.enums.TestEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * @author 刘山禾 2018年06月19日 新建
 * @since JDK1.7
 */
public class Temp {
    private static final Logger LOGGER = LogManager.getLogger(Temp.class);

    public static void main(String[] args) {
        boolean inTestEnum = TestEnum.A1.isInTestEnum(1);
        if (inTestEnum) {
            LOGGER.info("===true===");
        }else {
            LOGGER.info("====false====");
        }
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

    /**
     * 指定渠道是否可用
     */
    public static boolean isUseable(int type) {
        return (7 & (1 << (type - 1))) > 0;
    }

}
