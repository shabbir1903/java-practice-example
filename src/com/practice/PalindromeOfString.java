package com.practice;

public class PalindromeOfString {

	public static void checkpalindromOfString(String s) {
		char c[] = s.toCharArray();
		String reverse = "";

		for (int i = c.length - 1; i >= 0; i--) {
			reverse = reverse + c[i];
		}
		if (reverse.equals(s)) {
			System.out.println("The given String is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkpalindromOfString("madam");
	}

}
