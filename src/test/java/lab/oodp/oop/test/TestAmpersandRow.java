package lab.oodp.oop.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.control.AmpersandRow;
import static org.junit.Assert.assertEquals;


public class TestAmpersandRow {
	 private AmpersandRow cr;

	    @Before
	    public void setup() {
	        cr = new AmpersandRow();
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
	    public void testPrintRowOfAmpersandsOneFor() {
	        cr.printRowOfAmpersandsWithFor(1);
	        assertEquals("&", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsFiveFor() {
	        cr.printRowOfAmpersandsWithFor(5);
	        assertEquals("&&&&&", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsTenFor() {
	        cr.printRowOfAmpersandsWithFor(10);
	        assertEquals("&&&&&&&&&&", outContent.toString().trim());
	    }
	    
	    @Test
	    public void testPrintRowOfAmpersandsOneWhile() {
	        cr.printRowOfAmpersandsWithWhile(1);
	        assertEquals("&", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsFiveWhile() {
	        cr.printRowOfAmpersandsWithWhile(5);
	        assertEquals("&&&&&", outContent.toString().trim());
	    }

	    @Test
	    public void testPrintRowOfAmpersandsTenWhile() {
	        cr.printRowOfAmpersandsWithWhile(10);
	        assertEquals("&&&&&&&&&&", outContent.toString().trim());
	    }
	    
	    
}
