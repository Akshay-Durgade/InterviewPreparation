package day1;

import java.util.Scanner;

//21. Write a Java Program to check whether the Given Number is Prime Number or NOT.
public class Q21 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			flag=false;
			if(n%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.print("Prime Number");
		}
		else
			System.out.println("Not a prime number");

	}

}
