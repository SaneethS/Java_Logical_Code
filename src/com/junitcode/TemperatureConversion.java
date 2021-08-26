package com.junitcode;

import java.util.Scanner;

public final class TemperatureConversion {
		
		public static double temp;
		public static double farTemp, celTemp;
		
		
		public static double celsiusToFarenheit() {
			return farTemp = (temp*(9/5))+32;
		}
		
		public static double farenheitToCelcius() {
			return celTemp = (temp - 32)*5/9;
		}
		
		public static void temperatureConversion() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Temperature = "); temp = sc.nextDouble();
			char choice;
			System.out.println("Is the temperature in celsius or farenheit(press C or F)");
			choice = sc.next().charAt(0);
			
			if(choice == 'C' || choice == 'c') {
				celsiusToFarenheit();
				System.out.println("Temp in Farenheit = "+farTemp );
				
			}else if(choice == 'F' || choice == 'f') {
				farenheitToCelcius();
				System.out.println("Temp in Celsius = "+celTemp );
			}else {
				System.out.println("Wrong Choice");
			}
			
			
		}
}
