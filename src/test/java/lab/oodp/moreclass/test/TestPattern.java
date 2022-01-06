package lab.oodp.moreclass.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.moreclass.pattern.PrintPatternProgram;

import static org.junit.Assert.assertEquals;


public class TestPattern {
	 private PrintPatternProgram cr;

	    @Before
	    public void setup() {
	        cr = new PrintPatternProgram();
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
	    public void testPatternOne() {
	        cr.printPatternOne();
	        assertEquals("First Pattern\n"
	        		+ "***************\n"
	        		+ "#######.#######\n"
	        		+ "~~~~~~~..~~~~~~~\n"
	        		+ "~~~~~~~...~~~~~~~\n"
	        		+ "~~~~~~~....~~~~~~~\n"
	        		+ "~~~~~~~.....~~~~~~~\n"
	        		+ "~~~~~~~......~~~~~~~\n"
	        		+ "~~~~~~~.......~~~~~~~", outContent.toString().trim());
	    }

	    @Test
	    public void testPatternTwo() {
	        cr.printPatternTwo();
	        assertEquals("Second Pattern\n"
	        		+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
	        		+ "============............============\n"
	        		+ "&&&&&&&&&&&&&..........&&&&&&&&&&&&&\n"
	        		+ "&&&&&&&&&&&&&&........&&&&&&&&&&&&&&\n"
	        		+ "&&&&&&&&&&&&&&&......&&&&&&&&&&&&&&&\n"
	        		+ "&&&&&&&&&&&&&&&&....&&&&&&&&&&&&&&&&\n"
	        		+ "&&&&&&&&&&&&&&&&&..&&&&&&&&&&&&&&&&&\n"
	        		+ "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&", outContent.toString().trim());
	    }

	    
	    
}
