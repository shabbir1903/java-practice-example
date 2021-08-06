package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingExample {

	public static void main(String[] args) {

		Integer array[] = { 21, 30, 15, 10, 50, 40, 25, 5 };
		System.out.println(" = Before Sorting array = ");
		for (int element : array) {
			System.out.println(element);
		}
		
		System.out.println(" ========After Sorting========= ");
		Arrays.sort(array,Collections.reverseOrder());// Dual-Pivot Quick sort algorithm - O(n log(n))
		for (int i=0; i< array.length-1; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("- Using Insertion Sort Technique - ");
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j > array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[i] = temp;
					array[j] = array[i];

				}

			}
			System.out.println(array[i]);
		}

	}
}
