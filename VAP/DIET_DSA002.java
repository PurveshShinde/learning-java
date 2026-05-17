package com.example.com;
//time complexity n log n
public class DIET_DSA002 {
	public static void main(String args[]) {
		int n = 40;
		boolean[] prime = new boolean[n + 1];

		sieve(n, prime);
	}

	static void sieve(int number, boolean[] prime) {

		// Step 1: Assume all numbers are prime
		for (int i = 2; i <= number; i++) {
			prime[i] = true;
		}

		// Step 2: Sieve logic
		for (int i = 2; i * i <= number; i++) {
			if (prime[i]) {
				for (int j = i * 2; j <= number; j = j + i) {
					prime[j] = false;
				}
			}
		}

		// Step 3: Print primes
		for (int i = 2; i <= number; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
}