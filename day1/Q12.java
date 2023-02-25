package day1;
//12. Write a Java Program to find sum of the digits of a given number.
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factor");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(num>0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println("The sum is : "+sum);
	}

}
