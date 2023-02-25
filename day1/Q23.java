package day1;

import java.util.Scanner;

//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 
public class Q23 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.next();
		int len=str.length();
		int num=Integer.parseInt(str);
		int num1=num;
		int result=0;
		while(num>0)
		{
			result=result+(int)Math.pow(num%10, len);
			num=num/10;
		}
		if(result==num1)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		

	}

}
