package StringProgram;

public class ReverseEveryWord {

	public static void main(String[] args) {
         String s="life is beatifull";
         String[] spl=s.split(" ");
         String rev="";
         for(int i=spl.length-1;i>=0;i--) {
        	 String temp=spl[i];
        	for(int j=temp.length()-1;j>=0;j--) {
        		rev=rev+temp.charAt(j);
        	}
        	   rev=rev+" ";
         }
          System.out.print(rev);
	}

}
