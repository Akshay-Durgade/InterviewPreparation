package day1;

import java.util.Scanner;

//15. Write a java program to Reverse a given number.
public class Q15 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n=sc.nextInt();
		int num=0;
		int m=1;
		while(n>0)
		{
			num=num*10+(n%10);
			n=n/10;
		}
		System.out.println(num);
	}

}
