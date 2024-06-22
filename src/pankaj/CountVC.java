package pankaj;

public class CountVC {

	public static void main(String[] args) {
		
		String s = "Information";
		String s1 = s.toUpperCase();
		
		int vc =0;
		
		int cc = 0;
		
		char[] ch = s1.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='A' || ch[i]=='I' || ch[i]=='O' || ch[i]=='E' || ch[i]=='U' )
			{
				vc++;
			}
			
			else
			{
				cc++;
			}
		}
		System.out.println("Total Vowels  in given string is = " +vc);
		
		System.out.println("Total Consonants in given string is = " +cc);

	}

}
