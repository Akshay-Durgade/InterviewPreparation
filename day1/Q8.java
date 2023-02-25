package day1;

import java.util.Scanner;

//8. Write a Java Program to find whether given number is Leap year or NOT? 
public class Q8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for year");
		int n=sc.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{

					System.out.println("Year is leap year");
				}
				else
				{
					System.out.println("Year is not leap year");
				}
			}
			else
			{
				System.out.println("Year is leap year");
			}
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	}

}
