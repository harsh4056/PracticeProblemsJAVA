package stringss;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("   +7 "));
	}
	
	
	public static int atoi(final String a) {
		String number="";
		boolean negative=false;
		int i=0;
		
		try {
			for(;i<a.length();i++){
				//char dig=a.charAt(i);
				 if(a.charAt(i)=='-'){
					if(Character.isDigit(a.charAt(i+1))){
						i++;
						negative=true;
						break;
					}
					else return 0;
					
					
				}
				 
				 
				 if(a.charAt(i)=='+'){
						if(Character.isDigit(a.charAt(i+1))){
							i++;
							
							break;
						}
						else return 0;
						
						
					}
				 
				else if(Character.isDigit(a.charAt(i)))
					break;
				else if(Character.isWhitespace(a.charAt(i)))
				{
					
				}
				else return 0;
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
		for(;i<a.length();i++){
			if(Character.isDigit(a.charAt(i))){
				number=number+a.charAt(i);
			}
			else break;
			
			
		}
		
		int ans= 0;
		
		
			
			if(negative){
				ans=Integer.MIN_VALUE;
			}
			else{
				ans=Integer.MAX_VALUE;
			}
			
		
		
			try {
				if(negative)
				ans=Integer.parseInt(number) *-1;
				else ans=Integer.parseInt(number);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				if(negative){
					ans=Integer.MIN_VALUE;
				}
				else{
					ans=Integer.MAX_VALUE;
				}
				return ans;
			}
		
		
		
		
		
		
		
		
		
		
		return ans;
	}
	
	
	
public static String power(String a) {
		
		
		
	 String newA="",A=a;

	 String binary=""; 
	 boolean cond=true;
	 while(cond){
	 int len=0;
	 int sum=0;
	 
	 while(len<A.length())
	 {
		
			
		 int i= Integer.parseInt(A.charAt(len)+"");
	
			 sum=sum*10+i;
		
		 
		 int s=sum/2;
		 if(s==0)
		 newA= newA+"0";
		 else newA=newA+s;
		 
		 if(sum%2==1)
			 sum=1;
		 else sum=0;
		 
		 len++;
		 
		 
		 if(len==A.length()){
			 binary= sum+binary;
			
		 }
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 A=newA;
	 newA="";
	 A=A.replaceFirst("^0+(?!$)", "");
	 if(A.equals("1")){
		cond=false;
		 
		
	 }
	
		
	 }
		
		return binary;
	}

}
