package com.repose;

/**
 * @author 刘山禾 2018年08月08日 新建
 * @since JDK1.7
 */
public class TestShortUrl {
    public static void main(String[] args) {
        String key = "wiZgyx";
        int i = Math.abs(key.hashCode()) % 1024;
        System.out.println(i);
    }
}
