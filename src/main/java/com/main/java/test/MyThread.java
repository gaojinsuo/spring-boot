package com.main.java.test;

/**
 * Created by gaojinsuo on 2017/2/15.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行中。。。");
    }
}
