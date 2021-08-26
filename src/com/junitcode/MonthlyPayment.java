package com.junitcode;

public class MonthlyPayment {
	public static void monthlyPayment(String[] args) {
		double p = Double.parseDouble(args[0]);
		int y = Integer.parseInt(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double n = 12 * y;
		
		double r = R / (12 * 100);
		
		double payment = (p*r) / (1 - (Math.pow(1+r,-n)));
		
		System.out.println("Monthly Payment = "+payment);
		
	}
}
