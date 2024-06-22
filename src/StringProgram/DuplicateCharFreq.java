package StringProgram;

public class DuplicateCharFreq {

	public static void main(String[] args) {
		   String s="Sathyatechaaab";
		   char[]ch=s.toCharArray();
		   for(int i=0;i<=ch.length-1;i++) {
			   int count=1;
			   for(int j=i+1;j<=ch.length-1;j++) {
				   if(ch[i]==ch[j]&&ch[j]!=1) {
					   count++;
					   ch[j]=1;
				   }
			   }
			   if(count>=2) {
				   System.out.println(ch[i]+"--->"+count);
			   }
		   }
	}

	}
