package testing123;



public class Reverse_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("    the fdgf     sky    fdg   is       blue   "));
	}
	public static String reverseWords(String a) {
		String reverse="";
		int spaceCount=0;
		String temp="";
	for(int i =0;i<a.length();i++ ){
			char tokemon= a.charAt(i);
			if(Character.isWhitespace(tokemon))
				spaceCount++;
			
			if(Character.isLetter(tokemon)){
				temp=temp+tokemon;
				spaceCount=0;
			}
			if( spaceCount==1)
			{	
				reverse =" "+temp+reverse;
				temp="";
				
				
			}
			if(i+1==a.length())
				reverse =temp+reverse;
	
		
		
	}
		reverse= reverse.trim();
		return reverse;
	
		
		
		
	}
}
