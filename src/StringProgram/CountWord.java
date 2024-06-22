package StringProgram;

public class CountWord {

	public static void main(String[] args) {
       String s="life is beatifull";
       int word=0;
       char[]ch=s.toCharArray();{
    	   for(int i=0;i<=ch.length-1;i++) {
    		   if(ch[i]!=1)
    			   word++;
    	   }
       }
       System.out.println(word);
	}

}
