package StringProgram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 String s="Sathyatechaaab";
		   char[]ch=s.toCharArray();
		   for(int i=0;i<=ch.length-1;i++) {
			   for(int j=i+1;j<=ch.length-1;j++) {
				   if(ch[i]==ch[j]) {
					   ch[j]=1;
					   
				   }
			   }
			   if(ch[i]!=1) {
				   System.out.print(ch[i]);
			   }
			 
		   }
	}

}
