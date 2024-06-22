package pankaj;

public class PerefactNumber {

	public static void main(String[] args) {
		int[] arr = {6,3,9,1,3,8,4,5};
		
		for(int i = 0;i<arr.length; i++)
		{
			int n = arr[i];
			int  sum = 0;
			for(int j=1;j<n;j++)
			{
				if(n%j==0)
				{
					sum=sum+j;
				}
				
			}
			if(n==sum)
			{
				System.out.println(sum+" is sum" );
			System.out.println(n+" is perfact :");
				
				
			}
		}
 
	}

}
