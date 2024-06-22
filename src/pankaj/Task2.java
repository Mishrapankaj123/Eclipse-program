package pankaj;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

double taxAmt ;
System.out.println("enter the taxable amount ");
Scanner sc = new Scanner (System.in);
taxAmt = sc.nextDouble();

HashMap<String, Double> map = new HashMap<>();

map.put("upto 2.5 lakh",taxAmt*0 ); 


map.put(" 2.5  to 5 lakh",(taxAmt-250000)*0.05);

map.put(" 5  to 10 lakh",(taxAmt-500000)*0.2);

map.put(" 10 lakh above ",(taxAmt-1000000)*0.3);

System.out.println(map);


	}

}
