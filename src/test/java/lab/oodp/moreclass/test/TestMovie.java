package lab.oodp.moreclass.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.moreclass.mobilephone.DisplayMobilePrices;
import lab.oodp.moreclass.movies.MovieProgram;

import static org.junit.Assert.assertEquals;


public class TestMovie {
	 private MovieProgram cr;

	    @Before
	    public void setup() {
	        cr = new MovieProgram();
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
	        assertEquals("Movie Collection\n"
	        		+ "================\n"
	        		+ "Meet the Parents (2000), 107 minutes, Director: Jay Roach\n"
	        		+ "The Parent Trap (1961), 129 minutes, Director: David Swift\n"
	        		+ "Alice In Wonderland (2009), 109 minutes, Director: Tim Burton\n"
	        		+ "Dark Shadows (2012), 113 minutes, Director: Tim Burton\n"
	        		+ "The Iron Lady (2011), 105 minutes, Director: Phylliday Lloyd\n"
	        		+ "The Help (2011), 137 minutes, Director: Tate Taylor\n"
	        		+ "From Russia With Love (1963), 110 minutes, Director: Terence Young\n"
	        		+ "The King's Speech (2011), 118 minutes, Director: Tom Hooper\n"
	        		+ "Charlie and the Chocolate Factory (2005), 115 minutes, Director: Tim Burton\n"
	        		+ "Easy Rider (1969), 94 minutes, Director: Dennis Hopper\n"
	        		+ "Walk the Line (2005), 136 minutes, Director: James Mangold\n"
	        		+ "Kaikohe Demolition (2004), 52 minutes, Director: Florian Habicht\n"
	        		+ "Brokeback Mountain (2005), 134 minutes, Director: Ang Lee\n"
	        		+ "Gladiator (2000), 154 minutes, Director: Ridley Scott\n"
	        		+ "The Long Voyage Home (1940), 105 minutes, Director: John Ford\n"
	        		+ "Happy-Go-Lucky (2008), 118 minutes, Director: Mike Leigh\n"
	        		+ "The Big Wedding (2013), 89 minutes, Director: Justin Zackham\n"
	        		+ "The Intouchables (2011), 112 minutes, Director: Olivier Nakache and Eric Toledano\n"
	        		+ "Searching for Sugar Man (2012), 86 minutes, Director: Malik Bendjelloul\n"
	        		+ "\n"
	        		+ "The most recent movie is: The Big Wedding (2013), 89 minutes, Director: Justin Zackham\n"
	        		+ "The longest movie is: Gladiator (2000), 154 minutes, Director: Ridley Scott\n"
	        		+ "\n"
	        		+ "Searching for Sugar Man was directed by Malik Bendjelloul\n"
	        		+ "Liberal Arts is not in the collection.\n"
	        		+ "The Intouchables was directed by Olivier Nakache and Eric Toledano", outContent.toString().trim());
	    }
 
}
