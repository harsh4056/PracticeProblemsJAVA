package testing123;

public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findDigitsInBinary(0));
	}
	
	public static String findDigitsInBinary(int a) {
		if(a==0)
			return "0";
		String s="";
		while(a>0){
			int n =a%2;
			s=n+s;
			a=a/2;
			
			
		}
		
		
		return s;    
	}

}
