package com.main.java.entity;

import com.main.java.interfacetest.AbstractBuilderTest;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by gaojinsuo on 2017/1/12.
 */
public class XmlBuilder extends AbstractBuilderTest {
    private String xml;
    @Override
    protected OutputBuilder creatBuilder() {
        return new XmlBuilder();
    }
    @Test
    public void teat(){
        outputBuilder= test();
    }
}
