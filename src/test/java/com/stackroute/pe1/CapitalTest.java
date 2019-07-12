package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalTest {


    @Test
    public void givenChacterInputShouldReturnCapitalLetter() {
        Capital capitalTest = new Capital();
        //act
        String actualvalue = capitalTest.CharacterCheck('A');
        //
        assertEquals("Capital Letter",actualvalue);
         actualvalue = capitalTest.CharacterCheck('Z');
        //
        assertEquals("Capital Letter",actualvalue);
    }

    @Test
    public void givenChacterInutShouldReturnSmallLetter() {
        Capital capitalTest = new Capital();
        //act
        String actualvalue = capitalTest.CharacterCheck('a');
        //
        assertEquals("Small Letter",actualvalue);
        actualvalue = capitalTest.CharacterCheck('z');
        //
        assertEquals("Small Letter",actualvalue);
    }




}