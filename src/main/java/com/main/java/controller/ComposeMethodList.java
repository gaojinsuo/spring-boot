package com.main.java.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.validation.constraints.Size;

/**
 * Created by gaojinsuo on 2017/1/12.
 */
public class ComposeMethodList<E> {
    private int size;
    transient Object[] elements;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int CAPTITY_DEFAUT = 10;

    public ComposeMethodList() {
        elements = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    boolean readOnly = false;

    public void add(E element) {
        if (readOnly)
            return;
        if (isOverCapacity())
            grow();
        addElement(element);
    }

    private void addElement(E element) {
        elements[size++] = element;
    }

    private void grow() {
        Object[] newElements = new Object[elements.length + CAPTITY_DEFAUT];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    private boolean isOverCapacity() {
        return size + 1 > elements.length;
    }

    public int size() {
        return size;
    }

}
