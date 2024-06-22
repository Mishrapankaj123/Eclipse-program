package pankaj;

public class StrongNumber {

	public static void main(String[] args) {
	
		int no=145;
		int r=0;
		int temp=no;
		int sum =0;
		while(no>0) {
			r=no%10;
			int fact=1;
			for(int j=1; j<=r;j++)
			{
			fact=fact*j;
			}
			no=no/10;
			sum=sum+fact;
			
		}
		
		if(temp==sum) {
		System.out.println("Strong no"); 

	}

}
}
