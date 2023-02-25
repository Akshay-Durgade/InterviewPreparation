package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//7. Write a Java Program to find the Union of Two Arrays (UnSorted Array).
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int SIZE=sc.nextInt();
		Integer arr[]=new Integer[SIZE];
		
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of array 2");
		int SIZE1=sc.nextInt();
		Integer arr1[]=new Integer[SIZE1];
		
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		HashSet<Integer> list=new HashSet<Integer>();
		
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.addAll(arrList);
		list.addAll(Arrays.asList(arr1));
		
		  Integer[] union = {};
	      union = list.toArray(union);
	      
	      //print the result
	      System.out.println("Union of two arrays is: " + Arrays.toString(union));
		
	}

}
