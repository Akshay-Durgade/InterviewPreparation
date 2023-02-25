package day2;

import java.util.Scanner;

//4. Find the missing Number in the given array of 1 to N.
public class Q4 {

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
		
		int num=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=num)
			{
				System.out.println((num+1)+" is missing");
				num++;
			}
			else
				num++;
		}

	}

}
