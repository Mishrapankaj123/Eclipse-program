package pankaj;

public class BigestnumArray {

	public static void main(String[] args) {
          int [] arr= {1,4,6,4,10,6,9,1,12,4};
         
            
          for(int i=0; i<=arr.length-1; i++)
          {   
              int temp=0;

        	  for (int j=i+1; j<=arr.length-1; j++) 
        	  {	  
        	  if(arr[i]==arr[j])
        	  { 
        		temp++; 
             
        	  }
        	  }
          
          if(temp>0) 
        	  
          
          System .out.println(arr[i]);
        	  
          
        	
             		
          }   
	
	}

}
