package org.austinclojuremeetup.javamain;

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
	List list = new ArrayList();
	list.add("Hello");
	list.add("World");
        List result = App.transformObjectsWithAService(list);
        assertFalse(result.isEmpty() );
	assertEquals( 2, result.size());
    }
}
