
package pankaj;

public class Ascending {
	
	public static void main(String[] args) {
		
	 	String s = "82461357369";
	 	
	    System.out.println("output = " + longestAscending(s));
	    
  }
	
	 static String longestAscending(String s) {
	    int startOfLongest = 0;
	    
	    int endOfLongest = 0;
	    
	    for (int start = 0; start < s.length();) {
	        int end = start;
	        for (int prevChar = -1;
	             end < s.length() && s.charAt(end) > prevChar;
	             prevChar = s.charAt(end), end++)
	        { }
	        if (end - start > endOfLongest - startOfLongest) {
	            startOfLongest = start;
	            endOfLongest = end;
	        }
	        start = end;
	    }
	    return s.substring(startOfLongest, endOfLongest);
	}
	
	
}


