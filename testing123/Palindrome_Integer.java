package testing123;

import java.util.Collections;

public class Palindrome_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome(1111331111));
		
	}
	
	public static boolean isPalindrome(int a) {
		String s=""+a;
		
		
		String revs=	new StringBuilder(s).reverse().toString();
		
		
		
		return s.equals(revs);
	}

}
