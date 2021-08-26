package com.junitcode;

public final class Util {

	private Util() {
		
	}
	
	public static int dayOfWeek(int d, int m, int y) {
		int y0=0, x=0, m0=0, d0=0;
		
		y0 = y - (14-m)/12;
		x = y0 + (y0/4) - (y0/100) + (y0/400);
		m0 = m + 12 * ((14-m)/12)-2;
		d0 = (d+x+(31*m0)/12)%7;
		
		return d0;
	}
	
	public static double monthlyPayment(double p, int y, double R) {
		
		
		double n = 12 * y;
		
		double r = R / (12 * 100);
		
		double payment = (p*r) / (1 - (Math.pow(1+r,-n)));
		
		return payment;
		
	}
	
	public static int toBinary(int n) {
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
	    
	    return binary[n];
	}
}
