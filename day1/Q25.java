package day1;

import java.util.Scanner;

//25. Write a Java Program to check whether the given number is Perfect Numberor NOT. 
public class Q25 {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		 int result=0;
		 for(int i=1;i<n;i++)
		 {
			 if(n%i==0)
			 {
				 result=result+i;
			 }
		 }
		 if(result==n)
			 System.out.println("Perfect Number");
		 else
			 System.out.println("Not a perfect number");

	}

}
