package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Max_Non_Negative_SubArray {


		 public static void main(String args[] ) throws Exception {

		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		     
		        int N = Integer.parseInt(br.readLine());
		         ArrayList<Integer> maxArray = new ArrayList<Integer>();
		         
				for(int i=0;i<N;i++){
					
					maxArray.add(Integer.parseInt(br.readLine()));
					
				
	    
	}
				int sum=Integer.parseInt(br.readLine());
				
				System.out.println(maxset(maxArray, sum));
				
				
		 }
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> a,int sum) {
	    long maxSum = sum;
	    long newSum = 0;
	    
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ( ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	           
	            maxArray = newArray;
	        }
	       
	    }
	    return maxArray;
	}

}
