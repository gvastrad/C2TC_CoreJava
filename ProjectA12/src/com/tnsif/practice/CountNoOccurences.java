package com.tnsif.practice;

import java.util.Scanner;

public class CountNoOccurences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			}
				
		System.out.println("Enter the no of test cases");
        int tcases=sc.nextInt();
        for(int i=1;i<=tcases;i++)
        {
        	int count=0;
        	System.out.println("Enter the value");
        	int val=sc.nextInt();
        	for(int j=0;j<array.length;j++) {
        		if(val==array[j]) 
        			count++;	
        	}       
        	if(count==0) {
        		System.out.println("NOT PRESENT");	
        	}
        	else
        	{
        	System.out.println(count);
        	}
        	} 
	}
}
        
	


