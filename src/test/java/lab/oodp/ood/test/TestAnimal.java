package lab.oodp.ood.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.ood.animals.AnimalProgram;

import static org.junit.Assert.assertEquals;


public class TestAnimal {
	 private AnimalProgram cr;

	    @Before
	    public void setup() {
	        cr = new AnimalProgram();
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
	    public void testOutput() {
	        cr.start();
	        String newline = System.getProperty("line.separator");
	        assertEquals("Tweety the bird says tweet tweet"+newline
	        		+ "Tweety the bird is a non-mammal"+newline
	        		+ "Did I forget to tell you that I have 2 legs?"+newline
	        		+ "--------------------------------------------------------------"+newline
	        		+ "Bruno the dog says woof woof"+newline
	        		+ "Bruno the dog is a mammal"+newline
	        		+ "Did I forget to tell you that I have 4 legs?"+newline
	        		+ "--------------------------------------------------------------"+newline
	        		+ "Mr. Ed the horse says neigh"+newline
	        		+ "Mr. Ed the horse is a mammal"+newline
	        		+ "Did I forget to tell you that I have 4 legs?"+newline
	        		+ "This is a famous name of my animal type: PharLap"+newline
	        		+ "--------------------------------------------------------------", outContent.toString().trim());
	    }

	   

	    
	    
}
