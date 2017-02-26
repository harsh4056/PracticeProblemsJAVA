package testing123;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(lengthOfLastWord("     "));
	}
	public static int lengthOfLastWord(final String a) {
		int count=0;
		for(int i =0;i<a.length();i++ ){
			
			if(Character.isWhitespace((a.charAt(i)))){
				if(!(i+1==a.length())){
					if(!Character.isWhitespace((a.charAt(i+1))))
			count=0;}}
			else{
				count++;
			}
		
		
	}
		return count;

}
}