package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
        PalindromeChecker palindromeChecker;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        this.palindromeChecker = new PalindromeChecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.palindromeChecker = new PalindromeChecker();
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
    public void givenAnIntegerShouldReturnPalindrome(){


        String actualvalue = palindromeChecker.palindromeChecker(121);

        assertEquals("Palindrome Number",actualvalue);

    }
    @Test
    public void givenAnIntegerShouldReturnNotPalindrome(){
        String actualvalue = palindromeChecker.palindromeChecker(1234);

        assertEquals("Not Palindrome",actualvalue);

    }





}