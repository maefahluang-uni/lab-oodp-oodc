package lab.oodp.control;

public class ComplexUtils {
	/**
	 * Q1. Compare two names and if they are the same return "Same name", otherwise
	 * if they start with exactly the same letter return "Same first letter",
	 * otherwise return "No match".
	 *
	 * @param firstName
	 * @param secondName
	 *
	 * @return one of three Strings: "Same name", "Same first letter", "No match"
	 */
	public String areSameName(String firstName, String secondName) {
		String message = "";

		if (firstName.equals(secondName)) {
			message = "Same name";
		}

		else if (firstName.charAt(0) == secondName.charAt(0)) {

			message = "Same first letter";
		}

		else {
			message = "No match";
		}

		return message;
	}

	/** areSameName(String, String) => String **/

	/**
	 * Q2. Determine if the given year is a leap year.
	 *
	 * @param year
	 *
	 * @return true if the given year is a leap year, false otherwise
	 */
	public boolean isALeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
			leapYear = true;
		}

		return leapYear;
	}


	/**
	 * Q3. Return the given string in reverse order.
	 *
	 * @param str
	 *
	 * @return the String with characters in reverse order
	 */
	public String reverseString(String str) {
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}

		return reverseStr;
	}

	/** reverseString(String) => void **/



	/**
	 * Q4. Determine if the given number is a prime number.
	 *
	 * @param num
	 *
	 * @return true is the given number is a prime, false otherwise
	 */
	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Q5. Determine if the given string is a palindrome (case folded).
	 *
	 * @param str
	 *
	 * @return true if string is palindrome, false otherwise
	 */
	public boolean isStringPalindrome(String str) {
		String nospace = str.replaceAll(" ", "");
		return nospace.equals(reverseString(nospace));
	}

	/** isStringPalindrome(String) => boolean **/

	/**
	 * Q10. Generate a space separated list of all the prime numbers from 2 to the
	 * highest prime less than or equal to the given integer.
	 *
	 * @param num
	 *
	 * @return the primes as a space separated list
	 */
	public String printPrimeNumbers(int num) {
		String primesStr = "";

		for (int i = 2; i <= num; i++) {

			if (isPrime(i)) {
				primesStr += i + " ";
			}

		}

		if (primesStr.equals("")) {

			primesStr = "No prime number found";

		}

		else {

			primesStr = primesStr.substring(0, primesStr.length() - 1);

		}

		return primesStr;
	}
}
