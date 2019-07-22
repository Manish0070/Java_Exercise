package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessNumber;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        GuessNumber guessNumber = new GuessNumber();

        this.guessNumber = new GuessNumber();
    }
    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.guessNumber = new GuessNumber();
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
    public void givenIntegersShouldReturnNumberGuessedCorrectly() {
        String actualresult = guessNumber.numberGuessedCorrectly(34,34);

        assertEquals("Number Guessed correctly",actualresult);

    }
    @Test
    public void guessedIntegerIsLowerThanInputInteger() {
        String actualresult = guessNumber.guessedIntegerSmaller(34,22);

        assertEquals("Guessed Input Is Smaller",actualresult);

    }
    @Test
    public void guessedIntegerIsGreaterThanInputInteger() {
        String actualresult = guessNumber.guessedIntegerGreater(22,34);

        assertEquals("Guessed Input Is Greater",actualresult);

    }
}