package com.junitcode;

import java.util.Scanner;

public class Sqrt {
	
	public static void sqareRoot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the non negative number");
		int c = sc.nextInt();
		double result = Util.sqrt(c);
		System.out.println("Square root of "+c+" is : "+result);
		
	}
	
}
