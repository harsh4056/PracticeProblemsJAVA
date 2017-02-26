package stringss;

import java.util.ArrayList;

public class Multiply_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(multiply("199999999999921991", "99999999999999999999"));
		
		
	}
	
	
	public static String multiply(String a, String b) {
		String Large="";
		String Small="";
				
		ArrayList<String> arr= new ArrayList<String>();
		if(a.length()>=b.length())
			{
			Large=a;
			Small=b;
			}
		else if(a.length()<b.length()){
			Large=b;
			Small=a;
		}
	
		String zero="";
		for(int i=Small.length()-1;i>=0;i--){
			arr.add(multiplier(Large, Small.charAt(i))+zero);
			zero=zero+"0";
			
		}
		
	if(arr.size()==1)
		return arr.get(0);
	
	String s="0";
	
	for(int i=0;i<arr.size();i++)
		s=adder(arr.get(i), s);
			
			
			
			
		
		
		
		
		
		s= s.replaceFirst("^0+(?!$)", "");
		
		return s;
	}
	
	
	
	public static String multiplier(String a,char b){
		 
		 int multDigit=Integer.parseInt(b+"");
		 
		int lenA= a.length()-1;
		int carry=0;
		String product="";
		while(lenA>=0){
			int digit=0;
		int sum=Integer.parseInt(a.charAt(lenA--)+"")	*multDigit+carry;
		if(sum>9){
		carry=sum/10;
		digit=sum%10;
		}
		else {digit=sum;
			carry=0;
		
		}
		
		
			product=digit+product;
			
			
			
			
		}
		
		if(carry>0)
			product=carry+product;	
 	 
		 return product;
	}
	
	
	public static String adder(String a,String b){
		String answer="";
		/*a="0"+a;
		b="0"+b;*/
		
		int lenA= a.length();
		int lenB=b.length();
		int max=Math.max(lenA, lenB);
		int carry=0;
		int sum=0;
		while(max>=0){
			int sA=0,sB=0;int digit=0;
		if(lenA<1)
			sA=0;
		else sA=Integer.parseInt(a.charAt(lenA-1)+"");
		if(lenB<1)
			sB=0;
		else sB=Integer.parseInt(b.charAt(lenB-1)+"");
		sum=sA+sB+carry;
		if(sum>9){
			carry=sum/10;
			digit=sum%10;
			}
			else{ digit=sum;
			carry=0;
			}
			
			
		answer=digit+answer;
		lenB--;
		lenA--;
		max--;
		
		}
		
		
		return answer;
	}
	
	
	

}
