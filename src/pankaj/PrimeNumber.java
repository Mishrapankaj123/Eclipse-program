package pankaj;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int no = sc.nextInt();
		
		for(int i =1; i<=no; i++)
		{
			int count =0;
			for(int j =1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				if(count>2)
				{
					break;
				}
				
				
			}
			if(count==2)
			{
				System.out.println("prime number is = " +i);
			}
		}
		
	
	}

}
