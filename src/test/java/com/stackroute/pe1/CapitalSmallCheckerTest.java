package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CapitalSmallCheckerTest {

    Capitalsmallchecker capitalSmallChecker;

    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        Capitalsmallchecker capitalTest = new Capitalsmallchecker();

        this.capitalSmallChecker = new Capitalsmallchecker();
    }
    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.capitalSmallChecker = new Capitalsmallchecker();
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
    public void givenChacterInputShouldReturnCapitalLetter() {

        //act
        String actualvalue = capitalSmallChecker.CharacterCheck('A');
        //
        assertEquals("Capital Letter",actualvalue);
         actualvalue = capitalSmallChecker.CharacterCheck('Z');
        //
        assertEquals("Capital Letter",actualvalue);
    }

    @Test
    public void givenChacterInputShouldReturnSmallLetter() {

        String actualvalue = capitalSmallChecker.CharacterCheck('a');
        //
        assertEquals("Small Letter",actualvalue);
        actualvalue = capitalSmallChecker.CharacterCheck('z');
        //
        assertEquals("Small Letter",actualvalue);
    }




}