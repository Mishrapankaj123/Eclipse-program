package pankaj;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculate {

	public static void main(String[] args) {
		
		System.out.println("Enter the date of birth in YYYY-MM-DD farmat :");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
      LocalDate dob = LocalDate.parse(input);

       System.out.println( "Tatal age s = "+calculateAge(dob));
	}
	
	public static int calculateAge(LocalDate dob)
	{
		LocalDate curDate = LocalDate.now();
		
		if(dob!=null && curDate!=null)
		{
			return Period.between(dob, curDate).getYears();
		}
		else
		{
			return 0;
		}
	}

}
