package com.logicalcode;

import java.util.Scanner;

public class PrimeNumber {
	public static void primeNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = sc.nextInt();
		boolean flag = false;
		
		if(n < 2) {
			System.out.println("Add number greater than or equal to 2");
			System.exit(0);
		}
		
		if(n>=2) {
			
			for(int i=2;i<n;i++) {
				if(n%i == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false)
				System.out.println(n+" is a Prime Number");
			else
				System.out.println(n+" is not a Prime Number");
		}
		sc.close();
	}
}
