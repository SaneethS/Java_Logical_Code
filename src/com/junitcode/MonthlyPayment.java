package com.junitcode;

public class MonthlyPayment {
	public static void monthlyPayment(String[] args) {
		double p = Double.parseDouble(args[0]);
		int y = Integer.parseInt(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double payment = Util.monthlyPayment(p, y, R);
		
		System.out.println("Monthly Payment = "+payment);
		
	}
}
