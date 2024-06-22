package pankaj;

import java.util.Arrays;

public class ArrayEleRemove {
	public static void main(String[] args) {
	int[]arr= {3,2,1,8,3,2,1,3,3};
	    Arrays.sort(arr);
	for(int i=0; i<=arr.length-1;i++) {
		boolean flag=true;
	      for(int j=i+1;j<=arr.length-1;j++) {
	    	 if( arr[i]==arr[j]) {
	    		 flag=false;
	    		 break;
	    	   }
	    	 }
	        if(flag==true) {
	        	System.out.print(arr[i]);
	        
	        }
	
	 }
  }
}


