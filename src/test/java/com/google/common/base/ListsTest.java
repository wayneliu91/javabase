package com.google.common.base;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.Serializable;
import java.util.List;

public class ListsTest {


    @Test
    public void diff() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6);
        List<Integer> list1 = Lists.newArrayList(4, 5, 6, 7, 8, 9);
        list.removeAll(list1);
        System.out.println(JSON.toJSON(list));
    }

    @Test
    public void cartesianProduct() {
        ImmutableList<String> of = ImmutableList.of("1", "2");
        ImmutableList<String> of1 = ImmutableList.of("A", "B", "C");
        ImmutableList<? extends ImmutableList<? extends Serializable>> of2 = ImmutableList.of(of, of1);

        List<List<String>> lists = Lists.cartesianProduct(of, of1);

        for (List<String> list : lists) {
            System.out.println(JSON.toJSON(list));
        }
    }

}
