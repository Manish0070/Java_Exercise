package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantCheckerTest {
    VowelConsonantChecker vowelConsonantChecker;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        VowelConsonantChecker vowelConsonantChecker = new VowelConsonantChecker();

        this.vowelConsonantChecker = new VowelConsonantChecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.vowelConsonantChecker = new VowelConsonantChecker();
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
    public void givenWordShouldReturnVowelsAndConsonants() {


        String actualvalue = vowelConsonantChecker.vowelConsonantChecker("manish");

        assertEquals("manish",actualvalue);

    }

    @Test
    public void givenCharacterShouldReturnVowel() {

        String actualvalue = vowelConsonantChecker.vowelConsonantChecker("a");

        assertEquals("a",actualvalue);

    }
    @Test
    public void givenCharacterShouldReturnConsonant() {


        String actualvalue = vowelConsonantChecker.vowelConsonantChecker("s");

        assertEquals("s",actualvalue);

    }
}