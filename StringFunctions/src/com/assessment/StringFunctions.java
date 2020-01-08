/**This is a class that contains few String Util functions.
 * 
 */
package com.assessment;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Rekha Balakrishna from ubuntu
 *
 */
public class StringFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a String\n");
		String input = s.nextLine();
		s.close();
		findRepeatedCharacter(input);
		System.out.println(palindrome(input));

	}

	public static void findRepeatedCharacter(String input) {
		HashSet<Character> hs = new HashSet<Character>();
		HashSet<Character> hs1 = new HashSet<Character>();
		String lowerCaseStr = input.toLowerCase();

		for (int i=0;i<=lowerCaseStr.length()-1;i++){

			if(!hs.contains(lowerCaseStr.charAt(i))){
				hs.add(lowerCaseStr.charAt(i));
			}else{
				hs1.add(lowerCaseStr.charAt(i));
			}
		}
		System.out.println("The repeated characters are " + hs1.toString());
		hs = null;
		hs1 = null;
	}
	
	public static String palindrome(String input) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i));
		}
		String reverseString = sb.reverse().toString().toLowerCase();

		if (input.toLowerCase().equals(reverseString)) {
			return "Yes, the string " + input + " is a palindrome";
		}
		return "No, the string " + input + " is not a palindrome";
	}

}
