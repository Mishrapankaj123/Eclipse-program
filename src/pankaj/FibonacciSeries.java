package pankaj;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f1=0,f2=1;
		int f3;
		System.out.println(f1+"");
		System.out.println(f2+"");
		for(int i=1;i<=12;i++) {
			
			f3=f1+f2;
			
		
		System.out.println(f3);
		
		f1=f2;
		f2=f3;
	}

}
}