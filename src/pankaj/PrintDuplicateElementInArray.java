package pankaj;

public class PrintDuplicateElementInArray {

	public static void main(String[] args) {
	
		int[] arr= {1,1,7,7,5,5,2,2};
	
		int temp =0;
		
		for(int i=0;i<arr.length;i++)
	      {
		for(int j=i+1; j<arr.length;j++)
		    {
			
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	     }
	  }
		
    for(int i=0;i<arr.length;i++)
       {
	for(int j=i+1; j<arr.length;j++)
	     {
		
		 if(arr[i]==arr[j])
		   {
			 
			 System.out.println(arr[i]);
		   }
        }
     }
  }

}
