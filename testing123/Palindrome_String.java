package testing123;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("1a2"));

	}
	public static int isPalindrome(String a) {
		
		 StringBuffer cleanedString = new StringBuffer();
		for(int i =0;i<a.length();i++ ){
			char tempChar= a.charAt(i);
			int tempInt= (int)tempChar;
			if(((int)tempChar>=65  && (int)tempChar <=90)||((int)tempChar>=97) && (int)tempChar<=122|| tempInt>=48 && tempInt<=57){
				cleanedString.append(Character.toLowerCase(tempChar));
				
			}
			
			
		}
	
		String str = cleanedString.toString();
		 int n = str.length();
		    
		    for (int i = 0; i < n / 2; i++) {
		        if (str.charAt(i) != str.charAt(n - i - 1))
		            return 0;
		    }
		
		
		return 1;
	}
}
