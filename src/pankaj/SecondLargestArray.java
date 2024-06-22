package pankaj;

public class SecondLargestArray {

	public static void main(String[] args) {
	
		int[] a = {1,8,2,5,6,3,7};
		
		int tamp =0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					tamp = a[i];
					a[i] = a[j];
					a[j] = tamp;
				}
			}
			
		}
		System.out.println("Second largest number in given array is = " +a[1]);
	}

}
