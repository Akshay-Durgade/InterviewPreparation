package day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q18
{
	public static List<Integer> getPrimeFactors(int num)
	{
	    List<Integer> factors = new ArrayList<>();
	    int i = 2;
	    while (num > 1) {
	        if (num % i == 0) {
	            factors.add(i);
	            num /= i;
	        } else {
	            i++;
	        }
	    }
	    
	    return factors;
	}
	
	public static int findLCM(int num1, int num2) {
        List<Integer> factors1 = getPrimeFactors(num1);
        List<Integer> factors2 = getPrimeFactors(num2);

        // Merge the two lists of prime factors
        List<Integer> allFactors = new ArrayList<>(factors1);
        allFactors.addAll(factors2);

        // Remove duplicates from the merged list
        Set<Integer> set = new HashSet<>(allFactors);
        allFactors.clear();
        allFactors.addAll(set);

        // Calculate the product of all the factors
        int product = 1;
        for (int factor : allFactors) {
            product *= factor;
        }

        return product;
    }


	public static void main(String[] args)
	{
		int num1=60;
		int num2=40;
		int lcm=findLCM(num1,num2);
		System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm);



	}

}
