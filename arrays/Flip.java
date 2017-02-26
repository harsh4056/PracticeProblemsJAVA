package arrays;

import java.util.ArrayList;

public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> maxArray = new ArrayList<Integer>();
		maxArray.add(-1);
		maxArray.add(-1);
		maxArray.add(1);
		maxArray.add(-1);
		maxArray.add(1);
		maxArray.add(-1);
		maxArray.add(1);
		
		System.out.println(maxset("00101011100100110111101100011101111011111000011"));
	}

	
	
	public static ArrayList<Integer> maxset(String q) {
		
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 if(q.isEmpty())
			 return a;
		for(int j=0;j<q.length();j++){
			if(q.charAt(j)=='0')
				a.add(1);
			else 
				a.add(-1);
				
			
		}
		
		
	    long maxSum = 0;
	    long newSum = 0;
	    int count=0;
	   // int start_index=0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	 count ++;
	            newSum += i;
	            newArray.add(count);
	       
	        if ((maxSum < newSum)  ) {
	            maxSum = newSum;
	            maxArray = (ArrayList<Integer>) newArray.clone();
	        }
	        if(newSum<0){
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        
	    }
	    	    
	    newArray = new ArrayList<Integer>();
	    
	    if(maxArray.isEmpty())
	    	return newArray;
	    newArray.add(maxArray.get(0));
	    newArray.add(maxArray.get(maxArray.size()-1));
	    
	    
	    return newArray;
	}
}
