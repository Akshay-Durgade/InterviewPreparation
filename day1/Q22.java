package day1;

import java.util.Scanner;

//22. Write a Java Program to print Prime Numbers from 1 to N.
public class Q22 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
				flag=false;
				if(i%j==0)
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				System.out.print(i+", ");
			}

		}

	}

}
