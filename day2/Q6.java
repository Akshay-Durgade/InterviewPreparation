package day2;

import java.util.Scanner;

//6. Write a Java Program to find the Intersection of Two Sortedarrays. 
public class Q6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of array 2");
		int SIZE1=sc.nextInt();
		int arr1[]=new int[SIZE1];
		
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int i=0,j=0;
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i]<arr1[j])
				i++;
			else if(arr[i]>arr1[j])
				j++;
			else
			{
				System.out.println(arr1[j++]+",");
				i++;
			}
		}

	}

}
