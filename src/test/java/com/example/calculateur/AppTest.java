package com.example.calculateur;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        public void testApp()
        {
            Calc calc = new Calc();
            assertEquals(calc.somme("321", "425"), 746);
            assertTrue(calc.somme("abc", "cba") < 0);
            assertTrue(calc.somme("abc", "653") < 0);
            assertTrue(calc.somme("-145", "153") < 0);
        }
    }
}

