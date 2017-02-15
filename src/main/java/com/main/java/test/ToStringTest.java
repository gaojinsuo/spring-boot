package com.main.java.test;

import org.junit.Test;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojinsuo on 2017/2/3.
 */
public class ToStringTest {
    @Test
    public void test(){
        List<ToStringTest> list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            list.add(new ToStringTest());
        }
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "ToStringTest is add"+super.toString()+"\n";
    }
}
