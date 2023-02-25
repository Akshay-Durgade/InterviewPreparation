package day2;

import java.util.Scanner;

public class Q2 {

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
		int largest=0;
		int slargest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				slargest=largest;
				largest=arr[i];
			}
		}
		System.out.println(slargest);

	}

}
