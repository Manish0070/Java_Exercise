package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class numberrepeatTest {

    @Test
    public void givenIntegerShouldReturnRepeatNumbers(){
        //arrange
        numberrepeat n = new numberrepeat();
        //act
        int actuaresult = n.numberrepeater(4);
        //assert
        assertEquals(10,actuaresult);

    }
}