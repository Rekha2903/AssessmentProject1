package com.assessment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringFunctionsTest {
	
		String input;


		@Before
		public void setUp() throws Exception {
			input = "Radar";

		}

		@Test
		public void testFindRepeatedCharacter() {
			
			String repeatedCharacters = "[a, r]";
			assertEquals(repeatedCharacters,StringFunctions.findRepeatedCharacter(input));
			repeatedCharacters = null;

		}

		@Test
		public void testPalindrome() {
		 
			assertEquals("Yes, the string "+input+" is a palindrome", StringFunctions.palindrome(input));

		}

	}


