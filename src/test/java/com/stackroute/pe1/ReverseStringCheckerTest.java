package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringCheckerTest {
        ReverseStringChecker reverseStringChecker;


    @Before
    public void setUp() {
        //arrange
        System.out.println("Inside Before");//arrange
        ReverseStringChecker reverseStringChecker = new ReverseStringChecker();

        this.reverseStringChecker = new ReverseStringChecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.reverseStringChecker = new ReverseStringChecker();
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
    public void givenAStringShouldReturnReverseAsOutput() {

        //act
        String actualResult=reverseStringChecker.reverse("Manish");
        //assert
        assertEquals("hsinaM",actualResult);
    }
    @Test
    public void givenANullShouldReturnErrorMessage() {
        //act
        String actualresult=reverseStringChecker.reverse(null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Should Not Be Null", actualresult);

    }

}
