package day2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element no "+i);
			arr[i]=sc.nextInt();
			res=res+arr[i];
		}
		System.out.println("Average of elements of array is : "+res/SIZE);
	}

}
