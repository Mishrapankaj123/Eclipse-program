package pankaj;

import java.util.Scanner;

public class TaxCalculateTask {

	public static void main(String[] args) {
	
		TaxCalculateTask.calculateTax();
	}
	
	public static void calculateTax()
	{
		double taxAmt;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the rate :");
		
		double rate = sc.nextDouble();
		
		System.out.println(" Enter the tax :");
		
		double tax = sc.nextDouble();
		
		System.out.println("Tax type is :");
		
		String type= sc.next();
		 
		  if(type.equals("E"))
				 {
	            taxAmt = rate * (tax/100); 
				 }
		   
		   else 
		      {
		    taxAmt = rate * (tax/(100+tax));
		       }
		   
		 System.out.println( "Total Tax Amount is = "+taxAmt);
		
	}
	

}
