package com.main.java.test;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by gaojinsuo on 2017/2/15.
 */
public class ThreadPoolTest {
    public static final ExecutorService service = Executors.newFixedThreadPool(3);

    @Test
    public void test(){

        Runnable task = () -> {
            int loop = 0;
            while (loop < 5) {
                try {
                    if (loop > 0){
                        TimeUnit.SECONDS.sleep(1<<loop);
                    }
                    try {
                        notifyMerchant();
                    }catch (NullPointerException e) {
                        System.out.println(11111);
                    }
                    break;
                }catch (Exception e){
                    System.out.println(2222);
                }
                loop++;
            }

        };
        service.submit(task);
        //service.submit(task);
       // service.submit(task);
    }

    private void notifyMerchant() {
        throw new RuntimeException();
        //System.out.println(Thread.currentThread().getName() + "执行中。。。");
    }
}
