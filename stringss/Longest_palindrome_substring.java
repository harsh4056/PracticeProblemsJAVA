package stringss;

public class Longest_palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abcde"));
	}

	
	public static String longestPalindrome(String a) {
		
		int maxLength = 1;  // The result (length of LPS)
		 
	    int start = 0;
	    int len = a.length();
	 
	    int low, high;
	 
	    // One by one consider every character as center point of 
	    // even and length palindromes
	    for (int i = 1; i < len; ++i)
	    {
	        // Find the longest even length palindrome with center points
	        // as i-1 and i.  
	        low = i - 1;
	        high = i;
	        while (low >= 0 && high < len && a.charAt(low) == a.charAt(high))
	        {
	            if (high - low + 1 > maxLength)
	            {
	                start = low;
	                maxLength = high - low + 1;
	            }
	            --low;
	            ++high;
	        }
	 
	        // Find the longest odd length palindrome with center 
	        // point as i
	        low = i - 1;
	        high = i + 1;
	        while (low >= 0 && high < len && a.charAt(low) == a.charAt(high))
	        {
	            if (high - low + 1 > maxLength)
	            {
	                start = low;
	                maxLength = high - low + 1;
	            }
	            --low;
	            ++high;
	        }
	    }
	 
	    String s="";
	    s=a.substring(start, start + maxLength );
	   return s;
	 
	 
	
		

	}
}
