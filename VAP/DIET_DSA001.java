package com.example.com;

public class DIET_DSA001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;

		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + isPrime(i));

		}

	}

	static boolean isPrime(int number) {
		int c = 2;
		while (c * c <= number)    // c < number (time complexity n2)
			                       // c *c <= number (time complexity n root n)
			                       //
		{
			if (number % c == 0) { 
				return false;
			}
			c++;
		}
		return true;
	}
}
