package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	//O(n)
	public static void main(String[] args) {
		String [] str= {"java","javascript","node.js","java","javascript"};
		Set<String> set=new HashSet<String>();
		for(String name:str) {
			if(set.add(name)==false) {
				System.out.println("Duplicate elements in an Array:::"+name);
			}
			else {
				System.out.println("Array without Duplicate elements:::"+name);
			}
		}

	}

}
