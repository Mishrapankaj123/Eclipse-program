package pankaj;

public class DuplicateArray {

	public static void main(String[] args) {
	
		int arr1[] = {2,5,2,3,4,3,6};
		int arr2[] = {3,7,2,8,4,3,6};
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
			System.out.println(" ");
		}
	}

}
