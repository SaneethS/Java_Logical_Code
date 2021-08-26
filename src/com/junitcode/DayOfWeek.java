package com.junitcode;

public final class DayOfWeek {

	public static void dayOfWeek(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		int y0=0, x=0, m0=0, d0=0;
		
		y0 = y - (14-m)/12;
		x = y0 + (y0/4) - (y0/100) + (y0/400);
		m0 = m + 12 * ((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;
		
		System.out.println("The day of week = "+d0);
	}
}
