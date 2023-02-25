package day1;

import java.util.Scanner;

//7. How to check the given number is Positive or Negative in Java?
public class Q7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Neither postive nor negative");
		}
	}

}
