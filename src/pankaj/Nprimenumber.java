package pankaj;

import java.util.Scanner;

public class Nprimenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
          
         for(int i=1;i<=n;i++) {
        	  boolean flag=true;
        	  for(int j=2;j<=i/2;j++) {
        		  if(i%j==0) {
        			  flag=false;
        		      break;
        		  } 
        	  } 
        	  if(flag==true) 
        		
        		  System.out.println("is prime"+i);
         }

        	  
        	      
          
          
	}
}
