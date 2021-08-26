package com.junitcode;
import java.util.*;

public class VendingMachine {
	public static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static int count = 0;
	
	public static void vendingMachine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Change in Rs to be returned by the vending machine");
		int change = sc.nextInt();
		returnChange(change);
		System.out.println(map);
		System.out.println(count);
		sc.close();
	}
	
	public static void returnChange(int change) {

		if(change == 0)
			return ;

		count++;
		if(change/1000 > 0){
			map.put(1000,change/1000);
			returnChange(change%1000);
			return;
		}
		if(change/500 > 0){
			map.put(500,change/500);
			returnChange(change%500);
			return;
		}
		if(change/100 > 0){
			map.put(100,change/100);
			returnChange(change%100);
			return;
		}
		if(change/50 > 0){
			map.put(50,change/50);
			returnChange(change%50);
			return;
		}
		if(change/10 > 0){
			map.put(10,change/10);
			returnChange(change%10);
			return;
		}
		if(change/5 > 0){
			map.put(5,change/5);
			returnChange(change%5);
			return;
		}
		if(change/2 > 0){
			map.put(2,change/2);
			returnChange(change%2);
			return;
		}
		if(change/1 > 0){
			map.put(1,change/1);
			returnChange(change%1);
			return;
		}
	}
}
