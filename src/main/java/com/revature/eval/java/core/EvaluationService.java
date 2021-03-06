package com.revature.eval.java.core;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EvaluationService {
	//testing this a second time

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {		
		String reverseWord = "" ;
		for (int i=string.length()-1; i >= 0 ; i--) {
			reverseWord = reverseWord + string.charAt(i);			
		}
		return reverseWord;
	//	return null;
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		String acronym ="";
	
		for (String firstLetter: phrase.split("\\s|-")) {
			acronym = acronym + firstLetter.charAt(0); 			
		}
		String upperAcronym = acronym.toUpperCase();
		return upperAcronym;
	}


	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			double a = getSideOne();
			double b = getSideTwo();
			double c = getSideThree();
			
			if(a==b && b==c) {
				return true;
			}
			else
			// TODO Write an implementation for this method declaration
			
			
			return false;
		}

		public boolean isIsosceles() {
			
			double a = getSideOne();
			double b = getSideTwo();
			double c = getSideThree();

			if (a==b||b==c||a==c) {
				return true;
			}
			else
			return false;
		}
		

		public boolean isScalene() {
			double a = getSideOne();
			double b = getSideTwo();
			double c = getSideThree();

			if(a!=b && b!=c) {
				return true;
			}
			else
			// TODO Write an implementation for this method declaration
			return false;
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		
		int points = 0;
		String letter;
		String lowerLetter;
		for (int i=0 ; i<=string.length()-1 ; i++) {
			letter = "";
			letter = letter + string.charAt(i);
			lowerLetter = letter.toLowerCase();
					
			
			//A, E, I, O, U, L, N, R, S, T 1 point
			switch(lowerLetter) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "l":
			case "n":
			case "r":
			case "s":
			case "t":
				points = points + 1;
				break;
			//D and G 2 point
			case "d":
			case "g":
				points = points + 2;
				break;
			// B, C, M, P = 3
			case "b":
			case "c":
			case "m":
			case "p":
				points = points + 3;
				break;
			//F, H, V, W, Y = 4
			case "f":
			case "h":
			case "v":
			case "w":
			case "y":
				points = points + 4;
				break;
			case "k":
				points = points + 5;
				break;
			case "j":
			case "x":
				points = points + 8;
				break;
			case "q":
			case "z":
				points = points + 10;
				break;
				
			default:
					System.out.println("Invalid Input");
			}
		}
		// TODO Write an implementation for this method declaration
		return points;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) throws IllegalArgumentException {
		
		string = string.replaceAll("[^0-9]","");
		if (string.length() ==11 && string.charAt(0) == '1') {
				String shortnumber;
				shortnumber = string.substring(1);
				return shortnumber;
			}
		else if (string.length() == 10) {
			return string;
		}
		else
			throw new IllegalArgumentException();
			

		// TODO Write an implementation for this method declaration
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		
		Map<String, Integer> table = new HashMap<>();
		String copy = string;
		int number =0;
		for (String word: string.split("\\s+|,|\n")) {
			if (word.isEmpty()) {
				//catches consecutive split characters
			}
			else {
			table.put(word, 0);
			}
			// Initialize the has table
		//	acronym = acronym + word.charAt(0); 			
		}
		for (String word: copy.split("\\s|,|\n")) {
			
			if (word.isEmpty()) {
			}
			else {
			number = table.get(word);
			number++;
			table.put(word, number);
			}
		}
	//	return table;
		
		return table;		

		
		// TODO Write an implementation for this method declaration
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			
			getSortedList();
			setSortedList(sortedList);
			return sortedList.indexOf(t);
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		
		String convertedWord = "";				// placeholder string that is used to hold what will be added to the finalWord string, continually reset
		String lowercase;						// used to hold string that is a lowercase version of the original
		String finalWord = "";					// the final word(final string) that will be returned
		String nonVowelStart = "";				// Consonant string that will later be put at the end of a word

		for (String firstLetter: string.split("\\W+")) {
			int i =0;
			int number=0;
			convertedWord = "";
			lowercase = firstLetter.toLowerCase(); //converts the string to lowercase to keep things consistent
			/*
			 * This section of code translates words that specifically starts with "qu"
			 */
			if (lowercase.charAt(i)=='q'&& lowercase.charAt(i+1)=='u') {
				for (int i2 = 2; i2 < (lowercase.length()); i2++){
					convertedWord = convertedWord + lowercase.charAt(i2);
				}
				convertedWord = convertedWord + lowercase.charAt(0);		// prep "q" to be added to end
				convertedWord = convertedWord + lowercase.charAt(1);		// prep "u" to be added to end now "qu"
				convertedWord = convertedWord + "ay";						// prep "ay" to be added to end now "quay"
				finalWord = finalWord + convertedWord + " ";				// add to finalword that will be returned
				convertedWord = "";
			}
			
			/*
			 * This section of code will translate words that start with a vowel
			 */
			else if (lowercase.charAt(0)=='a' || lowercase.charAt(0)=='e'|| lowercase.charAt(0)=='i'|| lowercase.charAt(0)=='o'|| lowercase.charAt(0)=='u') {
				convertedWord = convertedWord + lowercase + "ay";			// prep and add "ay" to word
				finalWord = finalWord + convertedWord + " ";
				convertedWord = "";
			}
			else {
				while (lowercase.charAt(i)!='a' && lowercase.charAt(i)!='e'&& lowercase.charAt(i)!='i'&& lowercase.charAt(i)!='o'&& lowercase.charAt(i)!='u') {
					nonVowelStart = nonVowelStart + lowercase.charAt(i);
					i++;
					number++; 
				}
				
				for (int i3 = number; i3 < (lowercase.length()); i3++) {
					convertedWord = convertedWord + lowercase.charAt(i3);
				}
				
				finalWord = finalWord + convertedWord ;		
				convertedWord = "";
				
				for (int i2 = 0; i2 < number; i2++){
					convertedWord = convertedWord + lowercase.charAt(i2);
				}
				convertedWord = convertedWord + "ay";
				finalWord = finalWord + convertedWord + " ";
				convertedWord = "";
			}
		}
		finalWord = finalWord.substring(0, finalWord.length()-1);
		return finalWord;
}

		
		// TODO Write an implementation for this method declaration
//		return null;
	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		
		int length = String.valueOf(input).length();
		int[] numArray = new int[10];
		int i = 0;
		int added = 0;
		int copy = input;
		
		while (input > 0) {
			numArray[i] = (input % 10);
			input = input / 10;
			i++;
		}
			
			for (int a=0; a<length; a++) {
				int hold = (int)Math.pow(numArray[a],length);
				added = added + hold;
			}
		
		if (added == copy) {
			return true;
		}
		else 
			return false;
		// TODO Write an implementation for this method declaration
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		
		List<Long> result = new ArrayList<>();
		long k = l;
		/* 
		 * removes all division of 2, including powers of 2, results in odd number
		 */
		while (l%2==0) {
			result.add(2L);
			l = l/2;
		}
		/*
		 *  only need to divide by odd numbers, as dividing by even implys they are even
		 *  
		 */
		for (long i=3; i <=l; i=i+2){
			while(l%i==0) {
				result.add(i);
				l=l/i;
			}
		}
		return result;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			int s = 13;
			String shiftedString = "";
		    
			for (String firstLetter: string.split("\\s")) {
			{
		        	for (int i=0; i<firstLetter.length(); i++)
		        	{
		            	if (Character.isUpperCase(firstLetter.charAt(i)))
		            	{
		                	char ch = (char)(((int)firstLetter.charAt(i) + key - 65) % 26 + 65);
		                	shiftedString = shiftedString + ch;
		            	}
		            	if (Character.isLowerCase(firstLetter.charAt(i)))
		            		if (Character.isLowerCase(firstLetter.charAt(i)))
		            	{
		            		char ch = (char)(((int)firstLetter.charAt(i) + key - 97) % 26 + 97);
		                	shiftedString = shiftedString + ch;
		            	}
		            	
		            	if (firstLetter.charAt(i) == '.')
		            	{
		            		shiftedString = shiftedString + firstLetter.charAt(i);
		            		
		            	}
		            	if (firstLetter.charAt(i) == ',')
		            	{
		            		shiftedString = shiftedString + firstLetter.charAt(i);
		            		
		            	}
		            	if (firstLetter.charAt(i) == '!')
		            	{
		            		shiftedString = shiftedString + firstLetter.charAt(i);
		            		
		            	}
		            	if (firstLetter.charAt(i) == '\'')
		            	{
		            		shiftedString = shiftedString + firstLetter.charAt(i);
		            		
		            	}
		            	if (Character.isDigit(firstLetter.charAt(i))) {
		            		shiftedString = shiftedString + firstLetter.charAt(i);
		            	}
		        	}
		        	shiftedString = shiftedString + " "; 
				}
		    }
			shiftedString = shiftedString.substring(0,shiftedString.length()-1);
			return shiftedString;
		}
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
        int counter = 0;
        int primeNum = 0;
        int stop = i;
        if (i ==0) {
        	throw new IllegalArgumentException();
        }

        for (int num = 2; num < 200000; num++) {
            boolean isPrime = true;
            for (int factor = 2; factor < num; factor++) {

                if (num % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNum = num;
                counter++;
            }
            if (counter == stop) {
                break;
            }
        }
		return primeNum;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			String newWord = "";
			int spacecounter = 0;
			string = string.toLowerCase().replaceAll("[^a-z0-9]","");
			int position = 0;
			for (int i = 0; i < string.length(); i++) {

				switch(string.charAt(position)){
				
				case 'a':
					newWord = newWord + 'z';
					position++;
					break;
				case 'b':
					newWord = newWord + 'y';
					position++;
					break;
				case 'c':
					newWord = newWord + 'x';
					position++;
					break;
				case 'd':
					newWord = newWord + 'w';
					position++;
					break;
				case 'e':
					newWord = newWord + 'v';
					position++;
					break;
				case 'f':
					newWord = newWord + 'u';
					position++;
					break;
				case 'g':
					newWord = newWord + 't';
					position++;
					break;
				case 'h':
					newWord = newWord + 's';
					position++;
					break;
				case 'i':
					newWord = newWord + 'r';
					position++;
					break;
				case 'j':
					newWord = newWord + 'q';
					position++;
					break;
				case 'k':
					newWord = newWord + 'p';
					position++;
					break;
				case 'l':
					newWord = newWord + 'o';
					position++;
					break;
				case 'm':
					newWord = newWord + 'n';
					position++;
					break;
				case 'n':
					newWord = newWord + 'm';
					position++;
					break;
				case 'o':
					newWord = newWord + 'l';
					position++;
					break;
				case 'p':
					newWord = newWord + 'k';
					position++;
					break;
				case 'q':
					newWord = newWord + 'j';
					position++;
					break;
				case 'r':
					newWord = newWord + 'i';
					position++;
					break;
				case 's':
					newWord = newWord + 'h';
					position++;
					break;
				case 't':
					newWord = newWord + 'g';
					position++;
					break;
				case 'u':
					newWord = newWord + 'f';
					position++;
					break;
				case 'v':
					newWord = newWord + 'e';
					position++;
					break;
				case 'w':
					newWord = newWord + 'd';
					position++;
					break;
				case 'x':
					newWord = newWord + 'c';
					position++;
					break;
				case 'y':
					newWord = newWord + 'b';
					position++;
					break;
				case 'z':
					newWord = newWord + 'a';
					position++;
					break;
				default:
					newWord = newWord + string.charAt(position);
					position++;
					break;
				}
				if(position%5==0) {
					newWord = newWord +" ";
					spacecounter++;
				}
			}
			if ((newWord.length()-spacecounter)%5 ==0) {
				
			newWord = newWord.substring(0, newWord.length()-1);
			}
			return newWord;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {

			String newWord = "";
			string = string.toLowerCase().replaceAll("[^a-z0-9]","");
			int position = 0;
			for (int i = 0; i < string.length(); i++) {

				switch(string.charAt(position)){
				
				case 'a':
					newWord = newWord + 'z';
					position++;
					break;
				case 'b':
					newWord = newWord + 'y';
					position++;
					break;
				case 'c':
					newWord = newWord + 'x';
					position++;
					break;
				case 'd':
					newWord = newWord + 'w';
					position++;
					break;
				case 'e':
					newWord = newWord + 'v';
					position++;
					break;
				case 'f':
					newWord = newWord + 'u';
					position++;
					break;
				case 'g':
					newWord = newWord + 't';
					position++;
					break;
				case 'h':
					newWord = newWord + 's';
					position++;
					break;
				case 'i':
					newWord = newWord + 'r';
					position++;
					break;
				case 'j':
					newWord = newWord + 'q';
					position++;
					break;
				case 'k':
					newWord = newWord + 'p';
					position++;
					break;
				case 'l':
					newWord = newWord + 'o';
					position++;
					break;
				case 'm':
					newWord = newWord + 'n';
					position++;
					break;
				case 'n':
					newWord = newWord + 'm';
					position++;
					break;
				case 'o':
					newWord = newWord + 'l';
					position++;
					break;
				case 'p':
					newWord = newWord + 'k';
					position++;
					break;
				case 'q':
					newWord = newWord + 'j';
					position++;
					break;
				case 'r':
					newWord = newWord + 'i';
					position++;
					break;
				case 's':
					newWord = newWord + 'h';
					position++;
					break;
				case 't':
					newWord = newWord + 'g';
					position++;
					break;
				case 'u':
					newWord = newWord + 'f';
					position++;
					break;
				case 'v':
					newWord = newWord + 'e';
					position++;
					break;
				case 'w':
					newWord = newWord + 'd';
					position++;
					break;
				case 'x':
					newWord = newWord + 'c';
					position++;
					break;
				case 'y':
					newWord = newWord + 'b';
					position++;
					break;
				case 'z':
					newWord = newWord + 'a';
					position++;
					break;
				default:
					newWord = newWord + string.charAt(position);
					position++;
					break;
				}
			}
			return newWord;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		
		string = string.replaceAll("[^0-9xX]", "");				//removes all characters from string that are not digits or X's
		int calculation = 0; 									//number to do calculations on
		
		
		/*
		 * Code performs calculations
		 */
		if (string.length() == 10) {							//checks if string is length of 10, if not return false
			calculation += ((string.charAt(0) - 48)*10);		
			calculation += ((string.charAt(1) - 48)*9);
			calculation += ((string.charAt(2) - 48)*8);
			calculation += ((string.charAt(3) - 48)*7);
			calculation += ((string.charAt(4) - 48)*6);
			calculation += ((string.charAt(5) - 48)*5);
			calculation += ((string.charAt(6) - 48)*4);
			calculation += ((string.charAt(7) - 48)*3);
			calculation += ((string.charAt(8) - 48)*2);
		/*
		 * Specifically checks final character if it is a digit of X/x and calculate accordingly 
		 */
			if (string.charAt(9)== 'X') {					
				calculation += (10*1);
			}
			else if (string.charAt(9)== 'x') {
				calculation += (10*1);
			}
			else {
				calculation += ((string.charAt(9) - 48)*1);
			}
			if (calculation%11==0) {						// calculation to check is valid number
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		
		string = string.replaceAll("[^a-zA-Z]","");
		
		Set<Character> returnValue = new HashSet<Character>();

		for (int i=0; i<string.length(); i++) {			//loop to check each letter
			if ((string.charAt(i)>=65 && string.charAt(i)<=90) || (string.charAt(i)>=97
					&& string.charAt(i)<=122)) {
				returnValue.add(string.charAt(i));
				}
			else {
			}
		}
		if (returnValue.size() == 26) {
			return true;
		}else
			return false;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		
		Temporal newtime;
		if(given.isSupported(ChronoUnit.SECONDS)) {
			newtime = LocalDateTime.of(given.get(ChronoField.YEAR), given.get(ChronoField.MONTH_OF_YEAR),
			given.get(ChronoField.DAY_OF_MONTH), given.get(ChronoField.HOUR_OF_DAY),
			given.get(ChronoField.MINUTE_OF_HOUR), given.get(ChronoField.SECOND_OF_MINUTE));
			}
			else {
			newtime = LocalDateTime.of(given.get(ChronoField.YEAR), given.get(ChronoField.MONTH_OF_YEAR), 
			given.get(ChronoField.DAY_OF_MONTH), 0 , 0, 0);
			}

			final long giga = 1000000000;
			newtime = ((LocalDateTime) newtime).plusSeconds(giga);

			return newtime;
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		
		int arrayindex = 0;
		int size = set.length;
		int value = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i1=0; i1<size; i1++) {
			for (int j=1; j<i;j++) {
				if (j%(set[arrayindex])==0) {
					if (numbers.contains(j)) {
						//do nothing
					}else {
						numbers.add(j);
					}
				}
			}
				arrayindex++;
		}
		
		for (int k=0; k<numbers.size(); k++) {
			value += numbers.get(k);
		}
		// TODO Write an implementation for this method declaration
		return value;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		
		boolean validation = string.matches("[0-9\\s]+");
		int value = 0;
		int adder = 0;
		
		if (string.length() >1) {
			// acceptable length
			System.out.println("Valid length");
			if (validation) {
				string = string.replaceAll("[^0-9]", "");	// deletes white space
			}
			else {
				System.out.println("Has invalid characters");
			}
			if (validation) {
				System.out.println("Valid input");
				
				
				for (int i=0; i<string.length(); i+=2) {
					adder = ((string.charAt(i)-48));
						value +=adder;
						adder = 0;
				}
				
				/*
				 * Implements the calculation of every second number
				 */
				for (int i=1; i<string.length(); i+=2) {
					if (((string.charAt(i)-48)*2) > 9) {
						adder = ((string.charAt(i)-48)*2);
						adder -=9;
						System.out.println("About to add: " + adder);
						value +=adder;
						adder = 0;
					} else {
					adder = ((string.charAt(i)-48)*2);
						System.out.println("About to add: " + adder);
						value +=adder;
						adder = 0;
					}
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
		if (value%10==0) {
			 return true;
		} else { 
			 return false;
		}
		// TODO Write an implementation for this method declaration
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		
		string = string.substring(8);
		int value = 0;
		int numHold = 0;
		int[] calculate = new int[2];
		int index =0;
		String operator = null;
		
		for (String word: string.split("\\s+|\\?")) {
			try {
				numHold = Integer.parseInt(word);
				calculate[index] = numHold;
				index++;
			}
			catch (Exception e){
			}
			switch(word) {
			case "plus":
				operator = "plus";
					break;
			case "minus":
				operator = "minus";
					break;
			case "multiplied":
				operator = "multiplied";
					break;
			case "divided":
				operator = "divided";
					break;
			}
		}
		switch (operator) {
			case "plus":
				value = calculate[0] + calculate [1];
				break;
			case "minus":
				value = calculate[0] - calculate [1];
				break;
			case "multiplied":
				value = calculate[0] * calculate [1];
				break;
			case "divided":
				value = calculate[0] / calculate [1];
				break;
		}
		return value;
	}

}
