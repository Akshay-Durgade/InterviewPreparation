package day1;

import java.util.Scanner;

//10. Write a Java Program to print the digits of a Given Number.
public class Q10 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for year");
		int n=sc.nextInt();
		String str=String.valueOf(n);
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
