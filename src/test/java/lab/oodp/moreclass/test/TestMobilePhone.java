package lab.oodp.moreclass.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.moreclass.mobilephone.DisplayMobilePrices;

import static org.junit.Assert.assertEquals;


public class TestMobilePhone {
	 private DisplayMobilePrices cr;

	    @Before
	    public void setup() {
	        cr = new DisplayMobilePrices();
	    }

	    private ByteArrayOutputStream outContent;

	    @Before
	    public void setUpStreams() {
	        outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	    }

	    @After
	    public void cleanUpStreams() {
	        System.setOut(null);
	    }

	    @Test
	    public void testStart() {
	        cr.start();
	        assertEquals("Jonathan has an Apple iPhone 4 which cost $899.95\n"
	        		+ "Ann has an LG Optimus-P970 which cost $699.95\n"
	        		+ "Adriana has a Nokia N97 which cost $599.55\n"
	        		+ "Alastair has a Sumsung Galaxy which cost $599.95\n"
	        		+ "Alastair has now purchased a new Apple iPhone 4 for $899.95\n"
	        		+ "Alastair has the same type as Jonathan\n"
	        		+ "Adriana wants a new phone", outContent.toString().trim());
	    }
 
}
