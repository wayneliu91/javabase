package com.google.common.base;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class JoinerTest {

    @Test
    public void useForNull() {
        Joiner joiner = Joiner.on(',').useForNull("None");
        System.out.println(joiner.join(1, null, 3));
    }

    @Test
    public void skipNulls() {
        Joiner joiner = Joiner.on(',').skipNulls();
        System.out.println(joiner.join(new Integer[]{null, 2, null, 4}));
    }

    @Test
    public void appendTo() {
        StringBuilder ab = new StringBuilder("start: ");
        List list = Lists.newArrayList(1, 2, 3);
        StringBuilder joiner = Joiner.on(",").appendTo(ab, list);
        System.out.println(joiner.toString());
    }
}