package day1;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) 
	{
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
		
		int lcm=(n*n1)/gcd;
		
		System.out.println("LCM is : "+lcm);

	}

}
