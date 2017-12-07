package com.repose.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author 11629
 */
public class TestArrayList {

    public static void main(String[] args) {
        testArrayList();
        testLists();
    }

    private static void testLists() {
        List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");
        List<Type> exactly100 = Lists.newArrayListWithCapacity(100);
        List<Type> approx100 = Lists.newArrayListWithExpectedSize(100);
        Set<Type> approx100Set = Sets.newHashSetWithExpectedSize(100);
        Multiset<String> multiset = HashMultiset.create();

        List countUp = Ints.asList(1, 2, 3, 4, 5);
        // {5, 4, 3, 2, 1}
        List countDown = Lists.reverse(countUp);
        //{{1,2}, {3,4}, {5}}
        List partition = Lists.partition(countUp, 2);
        for (int i = 0; i < 3; i++) {
            Object o = partition.get(i);
        }
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
