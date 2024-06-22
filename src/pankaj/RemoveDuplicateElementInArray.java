package pankaj;

import java.lang.reflect.Array;

public class RemoveDuplicateElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4,2,2,3,5,1,1};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
				}
			}
			}
				for(int i=0;i<=arr.length-1;i++) {
					if(arr[i]!=-1) {
						System.out.println(arr[i]);
					}
					
				}
				
			}
		}

	


