package com.repose.collection;

import com.google.common.base.Splitter;

/**
 * @author 11629
 */
public class TestSplitter {

    public static void main(String[] args) {
        Splitter.on(' ').split("1 2 3");

        Splitter.onPattern("\\s+").split("1 \t   2 3");
    }

}
