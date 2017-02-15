package com.main.java.entity;

import com.main.java.interfacetest.AbstractBuilderTest;

/**
 * Created by gaojinsuo on 2017/1/12.
 */
public class DomBuilder extends AbstractBuilderTest {
    private String dom;
    @Override
    protected OutputBuilder creatBuilder() {
        return new DomBuilder();
    }

}
