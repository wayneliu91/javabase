package com.repose.collection;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.List;

/**
 * @author 11629
 */
public class TestJoiner {
    public static void main(String[] args) {
        String s = testSkipNulls();
        System.out.println(s);
    }

    private static String testAppendTo() {
        StringBuilder ab = new StringBuilder("start: ");
        List list = Lists.newArrayList(1, 2, 3);
        StringBuilder joiner = Joiner.on(",").appendTo(ab, list);
        return joiner.toString();
    }


    private static String testSkipNulls() {
        Joiner joiner = Joiner.on(',').skipNulls();
        return joiner.join(new Integer[]{null, 2, null, 4});
    }

    private static String testUseForNull() {
        Joiner joiner = Joiner.on(',').useForNull("None");
        return joiner.join(1, null, 3);
    }


}
