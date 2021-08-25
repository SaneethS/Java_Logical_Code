package com.logicalcode;

import java.util.Scanner;

public class StopWatch {
	public static long start,stop;
	
	public static void stopWatch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to start");
		int n=sc.nextInt();
		if(n==1) {
			start = System.currentTimeMillis();
			System.out.println("Stop watch start");
		}
		System.out.println("Press 2 to stop");
		n=sc.nextInt();
		if(n==2)
		{
			stop = System.currentTimeMillis();
			System.out.println("Stop watch stop");
			System.out.println("The elapsed time between start and end is "+getElapsedTime()+"ms");
		}
		sc.close();
	}
	
	public static long getElapsedTime()
	{
		return stop-start;
	}
}
