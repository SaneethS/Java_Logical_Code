package com.junitcode;

public class DayOfWeek {

	public static void dayOfWeek(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		int d0 = Util.dayOfWeek(d, m, y);
		
		System.out.println("The day of week = "+d0);
	}
}
