package com.repose.java.util;

import com.google.common.collect.Lists;
import com.repose.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 刘山禾 2018年11月10日 新建
 * @since JDK1.7
 */
public class ListTest {

    @Test
    public void testToString() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "张三"));
        users.add(new User(2, "李四"));

        System.out.println(users.toString());
    }

    @Test
    public void forceTransform() {
        List<String> params = Lists.newArrayList("a", "b");
        List<String> transform = transform(Collections.emptyList());
        System.out.println(transform);
    }

    private static List<String> transform(List params) {
        return (List<String>) params;
    }
}
