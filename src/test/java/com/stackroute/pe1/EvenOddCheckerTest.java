package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddCheckerTest {
    EvenOddChecker evenOddChecker = new EvenOddChecker();

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        EvenOddChecker evenOddChecker = new EvenOddChecker();

        this.evenOddChecker = new EvenOddChecker();
    }
    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.evenOddChecker = new EvenOddChecker();
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
    public void givenAnIntegerShouldReturnString() {
        //act
        int actualResult=evenOddChecker.compareeven(26);
        //assert
        assertEquals(26,actualResult);
    }

}