package com.practice;

public class FibonacciSeriesExample {

	// Time Complexity:O(n)
	public static void generateFibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fibonacci Series:: " + a + "," + b + ",");
		while (n > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + ",");
			n--;
		}

	}

	public static void main(String[] args) {

		generateFibonacciSeries(5);

	}

}
