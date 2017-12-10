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
        testSkipNulls();
    }

    private static String testAppendTo() throws IOException {
        Joiner joiner = Joiner.on(";");
//        StringBuilder ab = new StringBuilder("start: ");
        StringBuffer ab = new StringBuffer("start: ");
        List list = Lists.newArrayList(1, 2, 3);
        StringBuffer appendTo = joiner.appendTo(ab, list);
        String toString = appendTo.toString();
        return toString;
    }

    private static String testSkipNulls() {
        Joiner joiner = Joiner.on(' ');
        Joiner joiner1 = joiner.skipNulls();
        String join = joiner1.join(new Integer[]{null, 2, null, 4});
        return join;
    }

    private static String testUseForNull() {
        Joiner joiner = Joiner.on(' ');
        Joiner joiner1 = joiner.useForNull("None");
        String join1 = joiner1.join(1, null, 3);
        String toString = join1.toString();
        System.out.println(toString);
        return join1;
    }


}
