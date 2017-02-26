package testing123;

public class Excel_Column_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(titleToNumber("ZZZZAZ"));
	}

	
	
	public static int titleToNumber(String a) {
		
		int num=0;
		int consta=0;
		int lent=a.length()-1;
		for(int i=0;i<a.length();i++){
			int asci=((int)a.charAt(lent)-64);
			num=(int) (num+ asci * (Math.pow(26, i) )) ;
			lent--;
		}
		
		
		return num;
	}
}
