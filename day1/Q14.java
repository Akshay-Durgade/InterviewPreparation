package day1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number 1");
		 int n=sc.nextInt();
		 System.out.println("Enter the number 2");
		 int n1=sc.nextInt();
		 System.out.println("Sum of "+n+" and "+n1+" is : "+Math.addExact(n, n1));
	}

}
