package com.logicalcode;

import java.util.Scanner;

public class ReverseNumber {
	public static void reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int rev = 0, rem = 0;
		
		while(n!=0) {
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		
		System.out.println("Reverse number is : "+rev);
		sc.close();
	}
}
