package com.example.com;

public class arr_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 4, 8, 2, 9 };

		int count = 1;
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				count++;
				max = arr[i];
			}
		} 

		System.out.println(count);
	}

}
