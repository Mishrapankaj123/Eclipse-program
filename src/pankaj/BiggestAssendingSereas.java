package pankaj;

public class BiggestAssendingSereas {

	public static void main(String[] args) {
		
		String s = "12345682461357346771";
		int len = s.length();
		int [] arr = new int[len];
		
		for(int i=0; i<len;i++)
		{
			char si = s.charAt(i);
			arr[i]= Integer.parseInt(String.valueOf(si));
		}
		int cmax = arr[0];
		int gmax = arr[0];
		
		for(int i =0; i<arr.length-1; i++)
		{
			if(arr[i]<arr[i+1])
			{
				cmax = cmax*10+arr[i+1];
			}
			else
			{
				cmax = arr[i+1];
			}
			if(cmax>gmax)
			{
				gmax=cmax;
			}
			
		}
		System.out.println(gmax);
	}

}
