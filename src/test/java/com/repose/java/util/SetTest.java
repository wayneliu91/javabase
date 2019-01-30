package com.repose.java.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

/**
 * @author 常清 2018年12月24日 新建
 * @since 0.0.1-SNAPSHOT
 */
public class SetTest {

    @Test
    public void test() {
        Set<Integer> set = Sets.newHashSet(1000174, 1000537);
        System.out.println(JSON.toJSON(set));

        Set<Integer> integers = JSON.parseObject("[1000174,1000537]", new TypeReference<Set<Integer>>() {
        });
        System.out.println(integers);
    }
}
