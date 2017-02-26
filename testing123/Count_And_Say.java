package testing123;

public class Count_And_Say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(10));
	}
	
	public static String countAndSay(int a) {
		
		String prev="1",curr="";
		int cnt=1,digit=1;
		a--;
		for(int i=1;i<=a;i++){
			int loop=prev.length();
			prev=prev+"0";
			for(int j=0;j<loop;j++){
				digit=Integer.parseInt(""+ prev.charAt(j));
			if(digit==Integer.parseInt(""+ prev.charAt(j+1))){
				cnt++;
			}
			else{
				curr=curr+cnt+digit;
				cnt=1;
			}
			
				
			}
	
			prev=curr;
			curr="";
			
		}
		
		
		
		
		return prev;
	}
	

}
