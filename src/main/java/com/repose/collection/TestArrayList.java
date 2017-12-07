package com.repose.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 11629
 */
public class TestArrayList {

    public static void main(String[] args) {
        testArrayList();
    }

    private static void testArrayList() {
        List target = new ArrayList();
        target.add(1);
        target.add(2);
        target.add(3);
        target.add(4);
        target.add(5);

        List list = target.subList(4, 5);
        String string = list.toString();
        System.out.println(string);
    }
}
