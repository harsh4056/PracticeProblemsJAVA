package testing123;

public class Excel_Column_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(numberToTitle(29));
	}

	
	public static String numberToTitle(int a) {
		String s="";
		
		int n=a;
		while(n>0){
			
			int rem = n%26 ;
			if(rem==0){
				rem =rem+26;
				n=n/26;
			n--;	
			}
			
			else n=n/26;
			s= String.valueOf(Character.toChars(rem+64)) +s;
			
			
			
		}
		
		
		
		return s;
		

		
		
		
	}
	
}
