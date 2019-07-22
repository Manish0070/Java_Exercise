package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingTest {
    Descending descending1 =  new Descending();

    @Before
    public void setUp() throws Exception {
        Descending descending1;


    }

    @After
    public void tearDown() throws Exception {
        descending1 = null;

    }

    @Test
    public void inputDataSortsInDescendingOrder() {

        int[] data = {4,2,1,3,5};
        assertEquals(6, descending1.descendingOrder(5,data));
    }

    @Test
    public void inputDataSortsInDescendingOrderAndSums() {

        int[] data = {4,2,1,3,5,4,2,7};
        assertEquals(12, descending1.descendingOrder(8,data));
    }

    @Test
    public void inputDataSortsInDescendingGivesZero() {


        assertEquals(0, descending1.descendingOrder(8,null));
    }

    @Test
    public void inputDataSortsInDescendingGivesNotNullOutput() {


        assertNotNull(descending1.descendingOrder(8,null));
    }

}