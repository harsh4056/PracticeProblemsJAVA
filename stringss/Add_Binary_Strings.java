package stringss;

public class Add_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1111111", ""));
	}
	
	public static String addBinary(String a,String b){
		int sA=0,sB=0;
		String str ="";
		if(a.isEmpty())
			return b;
		if(b.isEmpty())
			return a;
		
		
		
		
		int lenA= a.length();
		int lenB=b.length();
		int max=Math.max(lenA, lenB);
		int carry=0;
		for(int i= max-1;i>=0;i-- )
		{
			int sum=0;
			if(lenA<1)
				sA=0;
			else sA=Integer.parseInt(a.charAt(lenA-1)+"");
			if(lenB<1)
				sB=0;
			else sB=Integer.parseInt(b.charAt(lenB-1)+"");
			sum=sA+sB+carry;
			if(sum==0){
			str = "0"+str;
			carry=0;
			}
			else if(sum==1){
				str = "1"+str;
				carry=0;
				}
			else if(sum==2){
				str = "0"+str;
				carry=1;
				}
			else if(sum==3){
				str = "1"+str;
				carry=1;
				}
			
			lenA--;
			lenB--;
	}
		if(carry==1)
			str="1"+str;
		
		
		
		
		
		return str;
		
	}

}
