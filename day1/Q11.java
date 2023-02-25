package day1;
//11. Write a Java Program to print all the Factors of the Given number.
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factor");
		int n=sc.nextInt();
		System.out.print("Factors of "+n+" are : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+", ");
		}
	}

}
