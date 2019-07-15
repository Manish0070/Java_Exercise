package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberRepeatTest {
    NumberRepeat numberRepeat;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        NumberRepeat numberRepeat = new NumberRepeat();

        this.numberRepeat = new NumberRepeat();
    }
    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.numberRepeat = new NumberRepeat();
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenIntegerShouldReturnRepeatNumbers(){
        //act
        int actuaresult = numberRepeat.numberrepeater(4);
        //assert
        assertEquals(10,actuaresult);

    }

}