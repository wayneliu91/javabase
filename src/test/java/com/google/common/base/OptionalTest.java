package com.google.common.base;

import org.junit.Test;

/**
 * Optional测试类
 * <p>Guava用Optional<T>表示可能为null的T类型引用。
 * <p>一个Optional实例可能包含非null的引用（我们称之为引用存在），也可能什么也不包括（称之为引用缺失）。
 * <p>它从不说包含的是null值，而是用存在或缺失来表示。但Optional从不会包含null值引用。
 */
public class OptionalTest {


    /**
     * 创建引用缺失的Optional实例
     */
    @Test
    public void absent() {
        Optional<Integer> absentOpt = Optional.absent();
        System.out.println("absent方法测试：" + absentOpt.isPresent());
    }

    /**
     * 创建指定引用的Optional实例，若引用为null则快速失败
     */
    @Test
    public void of() {
        Optional<Integer> possible = Optional.of(10);
        System.out.println("of方法测试：值:" + possible.get());
    }

    @Test
    public void fromNullable() {
        Optional<String> name = Optional.fromNullable(null);
        System.out.println(name.or("Jim"));
    }
}