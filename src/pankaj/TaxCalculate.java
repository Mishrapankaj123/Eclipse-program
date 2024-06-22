package pankaj;

import java.util.HashMap;
import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		  double it;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter income ");
		    it=sc.nextDouble();
		    HashMap<String, Double> testData = new HashMap<>();
		        testData.put("Up to Rs. 2,50,000 ",0.0);
		        it=it-250000;
		        testData.put("Rs.2,50,000 to Rs.5,00,000",0.05*it);
		        it=it-250000;
		        testData.put("Rs.5,00,000 to Rs.10,00,000",0.2*it);
		        it=it-500000;
		        testData.put("Above Rs.10,00,000",0.3*it);
		        System.out.println(testData);

	}

}
