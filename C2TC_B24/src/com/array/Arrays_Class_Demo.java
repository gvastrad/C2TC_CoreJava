package com.array;

import java.util.Arrays;

public class Arrays_Class_Demo {
	
	static void sort(int[] s) {
	Arrays.sort(s);
	for(int i=0;i< s.length;i ++) 
		{
		System.out.print (s[i]+" ");
	System.out.println();
	}
	}
	public static void main(String[] arg )
	{
		int[] i1= {15,20,42,3,56,34};
		sort(i1);
	}
	}

