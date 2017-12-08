package com.repose.collection;

import com.google.common.base.Joiner;

/**
 * @author 11629
 */
public class TestString {
    public static void main(String[] args) {
        String testJoiner = testJoiner();
        System.out.println(testJoiner);
    }

    private static String testJoiner() {
        Joiner joiner = Joiner.on("; ").skipNulls();

        Joiner joiner1 = Joiner.on(";");
        StringBuilder ab = new StringBuilder("start: ");
        StringBuilder stringBuilder = joiner1.appendTo(ab, new String[]{"a", "b", "c"});
        System.out.println(stringBuilder.toString());

        String join = Joiner.on(' ').useForNull("None").join(1, null, 3);
        System.out.println(join);

        return joiner.join("Harry", null, "Ron", "Hermione");
    }


}
