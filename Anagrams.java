package week2.day2;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String Text1 = "stops";
		String Text2 = "stops";
		
		
			char ch1[] = Text1.toCharArray();
			char ch2[] = Text2.toCharArray();
			
			Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    
		    if(Arrays.equals(ch1, ch2)) 
		      {
		    	System.out.println("Anagrams");
		      }
		    else
		      {
		    	System.out.println("Not a Anagrams");
		      }
			
		
		    

	}

}
