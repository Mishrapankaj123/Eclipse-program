package pankaj;

public class SumOfDigitsInAlfanumaricCharacter {

	public static void main(String[] args) {
		String s = "pankaj@1976";
		char [] ch = s.toCharArray();
		int sum = 0;
		for(int i=0; i<ch.length-1;i++)
		{
		
			int x=ch[i];
			
		if(x>=48 && x<=57)
			
		{
		sum=sum+x;
		}
		}
		System.out.println("sum "+sum);
	}

}
