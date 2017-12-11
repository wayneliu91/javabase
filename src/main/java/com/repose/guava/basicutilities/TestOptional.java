package com.repose.guava.basicutilities;


import com.google.common.base.Optional;

import java.util.Set;

public class TestOptional {

    public static void main(String[] args) throws Exception {
        test();
    }

    private static void test() {
        Integer value1 = null;
        Integer value2 = new Integer(10);
        //Optional.fromNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.fromNullable(value1);
        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println(sum(a, b));
    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.or - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.or(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        return value1 + value2;
    }


    public static void testMethodReturn() {
        Optional<Long> value = method();
        if (value.isPresent() == true) {
            System.out.println("获得返回值: " + value.get());
        } else {
            System.out.println("获得返回值: " + value.or(-12L));
        }
        System.out.println("获得返回值 orNull: " + value.orNull());


        Optional<Long> valueNoNull = methodNoNull();
        if (valueNoNull.isPresent() == true) {
            Set<Long> set = valueNoNull.asSet();
            System.out.println("获得返回值 set 的 size : " + set.size());
            System.out.println("获得返回值: " + valueNoNull.get());
        } else {
            System.out.println("获得返回值: " + valueNoNull.or(-12L));
        }
        System.out.println("获得返回值 orNull: " + valueNoNull.orNull());
    }

    private static Optional<Long> method() {
        return Optional.fromNullable(null);
    }

    private static Optional<Long> methodNoNull() {
        return Optional.fromNullable(15L);
    }

    private static void testOptional1() throws Exception {
        Optional<Integer> possible = Optional.of(6);
        Optional<Integer> absentOpt = Optional.absent();
        Optional<Integer> NullableOpt = Optional.fromNullable(null);
        Optional<Integer> NoNullableOpt = Optional.fromNullable(10);
        if (possible.isPresent()) {
            System.out.println("possible isPresent:" + possible.isPresent());
            System.out.println("possible value:" + possible.get());
        }
        if (absentOpt.isPresent()) {
            System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
            ;
        }
        if (NullableOpt.isPresent()) {
            System.out.println("fromNullableOpt isPresent:" + NullableOpt.isPresent());
            ;
        }
        if (NoNullableOpt.isPresent()) {
            System.out.println("NoNullableOpt isPresent:" + NoNullableOpt.isPresent());
            ;
        }
    }

    private static void testOptional() throws Exception {
        Optional<Integer> possible = Optional.of(6);
        if (possible.isPresent()) {
            System.out.println("possible isPresent:" + possible.isPresent());
            System.out.println("possible value:" + possible.get());
        }
    }
}
