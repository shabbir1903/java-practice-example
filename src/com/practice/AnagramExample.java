package com.practice;

import java.util.Arrays;

public class AnagramExample {

	//O(n)
	public static void checkAnagramOfString(String f, String s) {
		char firstStr[] = f.toCharArray();
		char secondStr[] = s.toCharArray();
		if (firstStr.length != secondStr.length) {
			System.out.println("The String is not Anagram");
		}
		Arrays.sort(firstStr);
		Arrays.sort(secondStr);
		for (int i = 0; i < firstStr.length - 1; i++)
			if (firstStr[i] != secondStr[i]) {
				System.out.println("The two String is not Anagram");
			} else {
				System.out.println("Provided String is Anagram");
			}
	}
	/*
	 * 
	 * 
	 * calculating the sum of all characters. This approach also uses the ASCII table. 
	 * It will convert each character to its equivalent decimal ASCII number and then sum up all numbers for each sentence. 
	 * If the sum is the same, it means the two sentences contain the same characters. Therefore anagrams.
	 */
	public static boolean checkAnagramOfStringAnotherWay(String f, String s) {
		String cleanText1=f.replaceAll(" ", "");
		String cleanText2=s.replaceAll(" ", "");
		
		if(cleanText1.length()!=cleanText2.length()) {
			return false;
		}
		// Sum up the value of all characters
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<cleanText1.length();i++){
            sum1=sum1+(int)cleanText1.charAt(i);
            sum2=sum2+(int)cleanText2.charAt(i);
        }
        System.out.println("Sum1  "+sum1);
        System.out.println("Sum2  "+sum2);
        
        return sum1==sum2;
		
	}

	public static void main(String[] args) {
		checkAnagramOfString("listen", "silent");
		//Second way without using data structure - the best choice since it uses less memory with same (n)
		boolean value=checkAnagramOfStringAnotherWay("listen", "silent");
		System.out.println("Anagram is ::"+value);
	}
}
