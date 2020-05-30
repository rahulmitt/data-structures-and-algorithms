package com.rahulmitt.interviewpedia.ds.list.impl;

import com.rahulmitt.interviewpedia.ds.list.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

    private List list;

    @Before
    public void init() {
        this.list = new ArrayList(1, 2, 3, 4, 5);
    }

    @Test
    public void testDisplay() {
        list.display();
    }

    @Test
    public void testAdd() {
        list.add(6);
        list.display();
    }

    @Test
    public void testInsert() {
        try{
            list.insert(-1, 10);
            Assert.fail();
        }catch (IndexOutOfBoundsException e) {
        }

        try{
            list.insert(6, 10);
            Assert.fail();
        }catch (IndexOutOfBoundsException e) {
        }

        list.display();
        list.insert(0, 10);
        list.display();
        list.insert(5, 30);
        list.display();
        list.insert(4, 20);
        list.display();
    }
}
