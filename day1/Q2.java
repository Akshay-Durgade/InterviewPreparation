package day1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++)
		{
			mul=mul*i;
		}
		System.out.println("Factorial of "+n+" is "+mul);
	}

}
