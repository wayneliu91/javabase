package com.java.util.concurrent;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    @Test
    public void use() {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new Task());
        pool.shutdown();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
