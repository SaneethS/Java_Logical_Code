package com.logicalcode;

import java.util.*;

public class Coupon {
	public static int n;
	public static ArrayList<Integer> arrayList=new ArrayList<>(); 
	public static Random random = new Random();
	
	public static void coupon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
        System.out.println("Enter the "+n+" distinct coupon numbers");
        
        for(int i=0;i<n;i++)
    	   arrayList.add(sc.nextInt());
        
        int count=0,rand_number=0;
        while(count<n)
        {
    	   while(true)
    	   {
    		   int x=randomNum();
    		   rand_number++;
    		   boolean ps=process(x);
    		   if(ps)
    			   break;
    	   }
    	   count++; 
        }
       System.out.println("Number of random numbers needed to process distinct coupon number is "+rand_number);
       sc.close();
	}
	
	public static int  randomNum()
    {
    	return random.nextInt(10);
    }
	
	public static boolean process(int x)
    {
    	int index = arrayList.indexOf(x);
    	if(index != -1)
    	{
    		arrayList.remove(index);
    		return true;
    	}
    	else return false;
    }

}

	

