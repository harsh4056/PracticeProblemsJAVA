package testing123;

import java.util.ArrayList;

public class IDIDIDID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(findPerm("ID", 3));
	}
	 public static ArrayList<Integer> findPerm(final String A, int B) {
		 int min =1,max=B;
		 ArrayList<Integer> listEle= new ArrayList<Integer>();
		 for(int i=0;i<A.length();i++)
		 {
			 if(A.charAt(i)=='I'){
				 listEle.add(min++);
				 
			 }
			 else{
				 listEle.add(max--);
			 }
			 
			 
		 }
			 
		 listEle.add(max);
		 
		 
		 
		return listEle;
	        
	        
	        
	    }
}
