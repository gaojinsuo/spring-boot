package com.main.java.controller;


import com.main.java.App;
import com.main.java.entity.Apple;
import com.main.java.interfaceImple.AppleFancyFormatter;
import com.main.java.interfacetest.AppleFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Created by gaojinsuo on 2016/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes =App.class)
public class AuthorTest {

    @Autowired
    @Qualifier("appleFancyFormatter")
    private AppleFormatter appleFormatter;
    @Test
    public void test() {
        Apple apple1 = new Apple();
        System.out.println(apple1);
//        apple1.setColor("red");
//        apple1.setSize(160);
        Apple apple2 = new Apple();
//        apple2.setColor("green");
//        apple2.setSize(180);
        Apple apple3 = new Apple();
//        apple3.setColor("green");
//        apple3.setSize(170);
        List<Apple> apples = new ArrayList<>();
        List<Apple> apples1 = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        for (Apple apple :apples){
            System.out.println(apple);
        }
//        //test1(apples,appleFormatter);
//        Map<String, List<Apple>> map1 = test2(apples);
//        Set<Map.Entry<String,List<Apple>>> b =map1.entrySet();
//        Set<String> a =map1.keySet();
//        for (String color : map1.keySet()) {
//            int sum = 0;
//            List<Apple> apples1 = map1.get(color);
//            for (Apple apple : apples1) {
//                sum += apple.getSize();
//            }
//        }
    }

    private Map<String, List<Apple>> test2(List<Apple> apples) {
        Map<String, List<Apple>> map = new HashMap<>();
        for (Apple apple : apples) {
            if (map.containsKey(apple.getColor())) {
                map.get(apple.getColor()).add(apple);
            } else {
                List<Apple> apples1 = new ArrayList<>();
                apples1.add(apple);
                map.put(apple.getColor(), apples1);
            }
        }
        return map;
    }


    private void test1(List<Apple> apples,AppleFormatter appleFormatter) {
        for(Apple apple : apples){
            System.out.println(appleFormatter.accept(apple));
        }
    }


}
