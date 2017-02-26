package testing123;

import java.util.ArrayList;
import java.util.List;

public class Max_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-2,1,-3,4,-1,2,1,-5,4
		List<Integer> lst = new ArrayList<Integer>() ;
		lst.add(-1);
		lst.add(-2);
	
		lst.add(-3);
	
	
	
		lst.add(-5);

		
		maxSubArray(lst);

	}
	public static int maxSubArray(final List<Integer> a) {
	    
		
		 int n = a.size();
         int curSum = 0, maxSum = Integer.MIN_VALUE;
         for (int i = 0; i < n; i++) {
             curSum += a.get(i);
             maxSum = Math.max(maxSum, curSum);
             if (curSum < 0) curSum = 0;
         }
         return maxSum;
		
		
	}
	
	
	
	

}
