package com.repose.innerclasses;

/**
 * @author 11629
 */
interface Selector {
    /**
     * 检查序列是否到了末尾
     *
     * @return 检查结果
     */
    boolean end();

    /**
     * 访问当前对象
     *
     * @return 当前对象
     */
    Object current();

    /**
     * 移动游标到序列中的下一个对象
     */
    void next();
}

/**
 * @author 11629
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        //队列增加元素
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        //选择器
        Selector selector = sequence.selector();
        // 迭代器
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}