package com.main.java.interfaceImple;

import com.main.java.entity.Apple;
import com.main.java.interfacetest.AppleFormatter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by gaojinsuo on 2016/11/24.
 */
@Service("appleFancyFormatter")
public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String heavelight = apple.getSize() >150?"heave":"light";
        return heavelight;
    }
}
