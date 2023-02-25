package day1;
//Write a Java Program to print Perfect Numbers between 1 to 1000.
public class Q26 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++)
		{
			int result=0;
			 for(int j=1;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 result=result+j;
				 }
			 }
			 if(result==i)
				 System.out.print(i+", ");
		}
	}
}
