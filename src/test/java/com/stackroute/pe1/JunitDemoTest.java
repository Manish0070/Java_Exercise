package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        JunitDemo junitDemo = new JunitDemo();

        this.junitDemo = new JunitDemo();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.junitDemo = new JunitDemo();
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }


    @Test
    public void giventwoStringsShouldReturnConcatedUpperString() {

        //act
        String actualresult = junitDemo.concatAndUpperCase("hi", "hello");
        //assert
        assertNotNull(actualresult);
        assertEquals("HIHELLO", actualresult);
    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage() {

        //act
        String actualresult = junitDemo.concatAndUpperCase("hi", null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Null Value Not Allowed", actualresult);

    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualresult = junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleH", actualresult);
    }

   /* @Test
    public void givenNullShouldThroughNullPointerException(){
        //act
        String actualresult=junitDemo.reverseString(null);
    }*/
}