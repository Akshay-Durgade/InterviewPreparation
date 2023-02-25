package day2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element no "+i);
			arr[i]=sc.nextInt();
		}
		int smallest=Integer.MAX_VALUE;
		int ssmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<ssmallest)
			{
				smallest=ssmallest;
				smallest=arr[i];
			}
		}
		System.out.println(ssmalle
	}

}
