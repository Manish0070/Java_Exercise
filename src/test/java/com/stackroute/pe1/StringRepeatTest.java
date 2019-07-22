package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat =  new StringRepeat();

    @Before
    public void setUp() throws Exception {
        StringRepeat stringRepeat;
    }

    @After
    public void tearDown() throws Exception {
        stringRepeat = null;
    }
    @Test
    public void inputStringConcateItself() {
        assertEquals("Stackrouteouteouteouteoute", stringRepeat.concateString(4,"Stackroute"));
    }

    @Test
    public void inputStringConcateItselfAndReturn() {
        assertEquals("manishishishish", stringRepeat.concateString(3,"manish"));
    }

    @Test
    public void inputNullWillReturnError() {
        assertNull( stringRepeat.concateString(3,null));
    }

    @Test
    public void inputStringWillReturnNotEqual() {
        assertNotEquals("man", stringRepeat.concateString(3,"man"));
    }
}