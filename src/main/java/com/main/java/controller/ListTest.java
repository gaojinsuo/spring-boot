package com.main.java.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojinsuo on 2017/1/12.
 */
public class ListTest {
    private int i=1;
    @Test
    public void test(){
//        ComposeMethodList<Integer> ss = new ComposeMethodList<>();
//        ss.add(1);
//        ss.add(2);
//        ss.add(3);
//        ss.add(4);
//        ss.add(5);
//        ss.add(6);
//        ss.add(7);
//        ss.add(8);
//        ss.add(9);
//        ss.add(10);
//        System.out.println(ss.size());
        try {
            add();
        } catch (Throwable e){
            System.out.println(i);
            System.out.println(e);
        }

    }

    private void add() {
        i++;
        add();
    }
}
