package com.junitcode;

import java.util.Scanner;

public class Binary {
	
	
	public static int swapNibbles(int x)
	{
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}
	
	public static void toBinary(int n){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(n > 0){    
	       binary[index++] = n%2;    
	       n = n/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println(); 
	}
	
	public static void binary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int x = sc.nextInt();
		System.out.println("Binary value of "+x);
		toBinary(x);
		int swappedValue = swapNibbles(x);
		System.out.println("After Swapping");
		toBinary(swappedValue);
	    System.out.print(swappedValue);
	}
}
