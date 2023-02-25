package day1;

import java.util.Scanner;

//16. Write a Java Program to find GCD of two given numbers.
public class Q16 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n=sc.nextInt();
		System.out.println("Enter the number 2");
		int n1=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=n && i<=n1;i++)
		{
			if(n%i==0 && n1%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD is "+gcd);
	}

}
