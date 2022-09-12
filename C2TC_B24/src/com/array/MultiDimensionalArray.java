package com.array;

class MultiDimensionalArray
{
public static void main(String args[])
{
// declaring and initializing 2D array
int arr[][] = { {2,7},{3,6},{7,4} };
// printing 2D array
System.out.println(arr.length);
for (int i=0; i< arr.length ; i++)
{
for (int j=0; j < arr[i].length ; j++)
System.out.print(arr[i][j] + " ");
System.out.println();
}
}
}
