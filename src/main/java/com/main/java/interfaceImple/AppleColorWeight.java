package com.main.java.interfaceImple;

import com.main.java.entity.Apple;
import com.main.java.interfacetest.AppleFormatter;


/**
 * Created by gaojinsuo on 2016/11/24.
 */
public class AppleColorWeight implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return apple.getColor();
    }
}
