package day1;

public class Q24 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			String str=String.valueOf(i);
			int power=str.length();
			int num=Integer.parseInt(str);
			int result=0;
			if(num<10)
			{
				result=(int)Math.pow(num, power);
			}
			else
			{
				while(num>0)
				{
						result=result+(int)Math.pow(num%10, power);
						num=num/10;
				}
			}
			if(result==i)
			{
				System.out.println(i+", ");
			}
		}

	}

}
