package day1;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			boolean flag=false;
			if(n%i==0)
			{
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

}
