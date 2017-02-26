package stringss;

public class Power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(power("2147483647"));
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
