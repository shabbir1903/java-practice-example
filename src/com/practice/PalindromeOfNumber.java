package com.practice;

public class PalindromeOfNumber {

	public static void checkPalindrome(int number) {
		int reverse = 0;
		int remainder;
        int num=number;
		while (number > 0) {
			remainder = number % 10;//1 2
			number = number / 10;//12
			reverse = reverse * 10 + remainder;//1
		}
		if (reverse == num) {
			System.out.println("The number is a palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		checkPalindrome(121);
	}

}
