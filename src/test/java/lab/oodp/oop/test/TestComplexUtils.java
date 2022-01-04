package lab.oodp.oop.test;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.control.ComplexUtils;

import static org.junit.Assert.*;
public class TestComplexUtils {
	   private ComplexUtils cr;

	    @Before
	    public void setUp() {
	        cr = new ComplexUtils();
	    }

	    @Test
	    public void testAreSameNameSameName() {
	        assertEquals("Same name", cr.areSameName("John", "John"));
	        assertEquals("Same name", cr.areSameName("Vithya", "Vithya"));
	        assertEquals("Same name", cr.areSameName("Jack", "Jack"));
	    }

	    @Test
	    public void testAreSameNameNoMatch() {
	        assertEquals("No match", cr.areSameName("Stephen", "Joseph"));
	        assertEquals("No match", cr.areSameName("Henry", "Thomas"));
	        assertEquals("No match", cr.areSameName("David", "Ernie"));
	    }

	    @Test
	    public void testAreSameNameSameFirstLetter() {
	        assertEquals("Same first letter", cr.areSameName("Ann", "Anna"));
	        assertEquals("Same first letter", cr.areSameName("Betty", "Barbara"));
	        assertEquals("Same first letter", cr.areSameName("Owen", "Olive"));
	    }

	    @Test
	    public void testIsLeapYearTrue() {
	        assertTrue(cr.isALeapYear(2000));
	        assertTrue(cr.isALeapYear(2012));
	        assertTrue(cr.isALeapYear(1996));
	    }

	    @Test
	    public void testIsLeapYearFalse() {
	        assertFalse(cr.isALeapYear(1900));
	        assertFalse(cr.isALeapYear(1800));
	        assertFalse(cr.isALeapYear(1601));
	    }

	
	    @Test
	    public void testReverseString() {
	        assertEquals("cba", cr.reverseString("abc"));
	        assertEquals("!dlroW olleH", cr.reverseString("Hello World!"));
	        assertEquals("16320101", cr.reverseString("10102361"));
	        assertEquals("z", cr.reverseString("z"));
	    }

	 


	    @Test
	    public void testIsPrimeTrue() {
	        assertTrue(cr.isPrime(2));
	        assertTrue(cr.isPrime(3));
	        assertTrue(cr.isPrime(499));
	        assertTrue(cr.isPrime(2749));
	    }

	    @Test
	    public void testIsPrimeFalse() {
	        assertFalse(cr.isPrime(10));
	        assertFalse(cr.isPrime(1));
	        assertFalse(cr.isPrime(3170));
	    }

	    @Test
	    public void testIsStringPalindromeTrue() {
	        assertTrue(cr.isStringPalindrome("kayak"));
	        assertTrue(cr.isStringPalindrome("101"));
	        assertTrue(cr.isStringPalindrome("i did, did i"));
	    }

	    @Test
	    public void testIsStringPalindromeFalse() {
	        assertFalse(cr.isStringPalindrome("hello world"));
	        assertFalse(cr.isStringPalindrome("java is fun"));
	        assertFalse(cr.isStringPalindrome("if this is true i'll eat my hat"));
	    }

	    @Test
	    public void testPrintPrimeNumbers() {
	        assertEquals("2 3 5 7 11 13 17 19", cr.printPrimeNumbers(20));
	        assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101", cr.printPrimeNumbers(101));
	        assertEquals("2 3 5 7", cr.printPrimeNumbers(8));
	    }

	    @Test
	    public void testPrintPrimeNumbersNoPrimeNumbersFound() {
	        assertEquals("No prime number found", cr.printPrimeNumbers(1));
	        assertEquals("No prime number found", cr.printPrimeNumbers(0));
	        assertEquals("No prime number found", cr.printPrimeNumbers(-1));
	    }
}
