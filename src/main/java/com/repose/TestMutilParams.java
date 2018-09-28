package com.repose;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 刘山禾 2018年08月20日 新建
 * @since JDK1.7
 */
public class TestMutilParams {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(String.valueOf(i));
        }

        String[] strings = new String[]{};
        mutilParams(set.toArray(strings));

    }


    private static void mutilParams(String...args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
