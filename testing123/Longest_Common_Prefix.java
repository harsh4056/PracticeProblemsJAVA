package testing123;

import java.util.ArrayList;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arr= new ArrayList<String>();
		arr.add("abcd");//A : [ "abcd", "abde", "abcf" ]
		arr.add("abcd");
		arr.add("efgh");

		System.out.println(longestCommonPrefix(arr));
		
	}

	
	
	public static String longestCommonPrefix(ArrayList<String> a) {
				
		
		String LCP="";
		int cnt=0;
		boolean truth=true;
		try {
			while(truth){
				char temp= a.get(0).charAt(cnt);
				for(int i=1;i<a.size();i++){
					if(!(temp==a.get(i).charAt(cnt)))
					{
						truth=false;
						break;
					}
				
					
				}
				
				if(truth){
					
					LCP=LCP+a.get(0).charAt(cnt);
					cnt++;
				}
				else break;
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return LCP;
		}
		
		
		
		
		
		
		
		return LCP;
	}
}
