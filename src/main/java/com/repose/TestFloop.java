package com.repose;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author 常清 2019年01月19日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class TestFloop {

    public static void main(String[] args) {
        List<Integer> la = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> lb = Lists.newArrayList(3, 4, 5, 6, 7, 8);

        List<Integer> equal = Lists.newArrayList();
        for (Integer a : la) {
            for (Integer b : lb) {
                if (a.equals(b)) {
                    equal.add(a);
                    break;
                }
            }
        }
        System.out.println(equal.toString());
    }

}
