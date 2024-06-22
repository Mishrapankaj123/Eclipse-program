package pankaj;

public class Task {
	
	double taxbleAmt = 1000000;
	
	double totalTax;
	double surCharge;
	double slab1;
	double slab2;
	double slab3;
	
	void getCalcetateTax()
	{
	
		 slab1 = 0;
		double netTaxbleAmt = 1000000-250000;
		slab2 = 250000*5/100;
		double netTaxbleAmt1 = netTaxbleAmt-250000;
		
		 slab3 = 500000*20/100;
		double netTaxbleAmt2 = netTaxbleAmt1-500000;
		
		
		
		System.out.println("upto 2.5 lakh 0% ="+slab1);
		System.out.println("2.5 to 5.0lakh 5%= "+slab2);
		System.out.println("5.0 to 10.0 lakh 20% ="+slab3);
		
		 totalTax=slab1+slab2+slab3;
		System.out.println("Total tax is = "+totalTax);
		
	
	}
	
	void getSurcharge()
	{
		if(totalTax>=5000000)
		{
			surCharge= totalTax*10/100;
		}
		else
		{
			surCharge=0;
		}
		System.out.println("Surcharge is = " +surCharge);
	}
	void getCalculateHE()
	{
		//double totalTax=slab1+slab2+slab3;
		double hECase = totalTax*4/100;
		System.out.println(" HE Case = " +hECase);
	}

	public static void main(String[] args) {
		Task t1 = new Task();
		t1.getCalcetateTax();
		t1.getCalculateHE();
		t1.getSurcharge();
		
		

	}

}
