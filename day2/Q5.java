package day2;

import java.util.Scanner;

//5. Write a Java Program to find the Intersection of two arrays
public class Q5 {

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
		
		for(int i=0;i<arr.length && i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]+", ");
					break;
				}
			}
		}
		
	}

}
