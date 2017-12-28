package com.google.common.base;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PreconditionsTest {


    @Test
    public void Preconditions() {
        getPersonByPrecondition(8, "peida");

        try {
            getPersonByPrecondition(-9, "peida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8, "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            getPersonByPrecondition(8, null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Integer> intList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            try {
                checkState(intList, 9);
                intList.add(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            checkPositionIndex(intList, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPositionIndex(intList, 13);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPositionIndexes(intList, 3, 7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPositionIndexes(intList, 3, 17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPositionIndexes(intList, 13, 17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkElementIndex(intList, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            checkElementIndex(intList, 16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void getPersonByPrecondition(int age, String name) {
        Preconditions.checkNotNull(name, "name为null");
        Preconditions.checkArgument(name.length() > 0, "name为\'\'");
        Preconditions.checkArgument(age > 0, "age 必须大于0");
        System.out.println("a person age:" + age + ",name:" + name);
    }

    private static void checkState(List<Integer> intList, int index) {
        //表达式为true不抛异常
        Preconditions.checkState(intList.size() < index, " intList size 不能大于" + index);
    }

    private static void checkPositionIndex(List<Integer> intList, int index) {
        Preconditions.checkPositionIndex(index, intList.size(), "index " + index + " 不在 list中， List size为：" + intList.size());
    }

    private static void checkPositionIndexes(List<Integer> intList, int start, int end) {
        Preconditions.checkPositionIndexes(start, end, intList.size());
    }

    private static void checkElementIndex(List<Integer> intList, int index) {
        Preconditions.checkElementIndex(index, intList.size(), "index 为 " + index + " 不在 list中， List size为： " + intList.size());
    }
}
