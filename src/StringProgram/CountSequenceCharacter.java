package StringProgram;
public class CountSequenceCharacter {
	public static void main(String[] args) {
	   String s="SathyaTechnology";
	   char[] ch=s.toCharArray();
	   for(int i=0;i<=ch.length-1;i++) {
		   int count=1;
		   for(int j=i+1;j<=ch.length-1;j++) {
			   if(ch[i]==ch[j]) {
				   count++;
				   ch[j]=1;
			   }
		   }
		   if(ch[i]!=1) {
			   System.out.println(ch[i]+"-->"+count);
		   }
	   }
	}
}
