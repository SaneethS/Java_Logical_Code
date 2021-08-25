package com.logicalcode;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int i=1, f1=0, f2=1, f3=0;
		
		while(i<=n) {
			System.out.print(f1+" ");
			
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			i++;
		}
		sc.close();
	}	
}
