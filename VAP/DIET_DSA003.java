package com.example.com;
import java.util.*;

public class DIET_DSA003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int [] A = new int[n];
		
		System.out.println("Enter the elements of the array ");
		for(int i = 0; i < n ; i++) 
		{
			System.out.print("Enter " + (i+1)+ " Element : ");
			A[i] = sc.nextInt();
			
			
		}
		System.out.print("\nEnter the total Queries : ");
		int query = sc.nextInt();
		
		int totalSum=0;
		
		for (int q =1; q<=query; q++)
		{
			System.out.print("\nEnter the type of " +q+" Query : ");
			int type=sc.nextInt();
			
			System.out.print("Enter the starting index of "+q+" Query : ");
			int L =sc.nextInt();
			
			System.out.print("Enter the ending index of "+q+" Query : ");
			int r =sc.nextInt();
			
			if (type == 1 )  // replace the array from l to r
			{
				for (int i =L; i <=r; i++)
				{
					A[i]= (i-L+1)*A[L];
				}
			}
			else if (type ==2)   //find out the sum of the array from l to r 
			{
				int sum = 0;
				for(int i = L; i<=r; i++)
				{
					sum = sum+A[i];
				}
				
				totalSum=totalSum+sum;
			}
		}
		System.out.println("\nTotal sum of all type 2 query : "+totalSum);
		sc.close();
	}

}
