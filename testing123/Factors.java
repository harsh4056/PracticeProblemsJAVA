package testing123;

import java.util.ArrayList;
import java.util.Collections;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(allFactors(6));
	}
	
	
	
		public static ArrayList<Integer> allFactors(int A) {
		    ArrayList<Integer> res = new ArrayList<>();
		    int sqrt = (int) Math.sqrt(A);
		    
		    for (int num = 1; num <= sqrt; num++) {
		        
		        if (A % num == 0) {
		            
		            res.add(num);
		            
		            if (num != A / num)
		                res.add(A / num);
		            
		        }
		        
		    }
		    
		    Collections.sort(res);
		    
		    return res;
		    
		
	}

	

}
