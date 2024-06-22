package StringProgram;

public class ReverseWord {

	public static void main(String[] args) {
       String s="life is beatifull";
       String rev="";
       for(int i=s.length()-1;i>=0;i--) {
    	 rev=rev+s.charAt(i);
       }
       rev=rev+" ";
       System.out.print(rev);
	}
}
