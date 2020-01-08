/**
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
	}

	private static void findRepeatedCharacter(String input) {
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

}
