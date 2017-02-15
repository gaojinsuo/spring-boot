package com.main.java.interfacetest;

import com.main.java.entity.OutputBuilder;

/**
 * Created by gaojinsuo on 2017/1/12.
 */
public abstract class AbstractBuilderTest extends OutputBuilder{
    protected OutputBuilder outputBuilder;
    protected abstract OutputBuilder creatBuilder();
    public OutputBuilder test(){
       return outputBuilder = creatBuilder();
    }
}
