package maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Timely_orders {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		


		

		ArrayList<Integer> cumilativeTransaction= new ArrayList<Integer>();

		ArrayList<Integer> timer= new ArrayList<Integer>();
		
		 Scanner sc = new Scanner(System.in);
		 
		 
	        int N = sc.nextInt();
	    
	         cumilativeTransaction.add(0);
	        timer.add(0);
	       
	        int sum=0;
	        for (int i = 0; i < N; i++) {
	        	
	        	int var=sc.nextInt();
	        	if(var==1){
	        		int order=sc.nextInt();
	        		sum=sum+order;
	        		int time=sc.nextInt();
	        		cumilativeTransaction.add(sum);
	        		timer.add(time);
	        			
	        	}
	        	
	        	if(var==2){
	        		
	        		
	        		int timeGap=sc.nextInt();
	        		int time=sc.nextInt();
	        	
	        		int indexHigh = getClosestK(timer, time+1);
	        		int indexlow=getClosestK( timer, time-timeGap);
	        		
	        		if(timer.size()==2 && time-timeGap<=timer.get(1))
	        			indexHigh=1;
	        		
	        		System.out.println(cumilativeTransaction.get(indexHigh)-cumilativeTransaction.get(indexlow));
	        	}
	        	
	        	
	        	
	        }
	        
	        
	        
	}
	

	
	
	public static int getClosestK(ArrayList<Integer>integers, int x) {

        int low = 0;
        int high = integers.size()-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // test lower case
            if (mid == 0) {
                if (integers.size()-1 == 1) {
                    return mid;
                }

                return mid;
            }


            // test upper case
            if (mid == integers.size()-1 ) {
                return mid;
            }

            // test equality
            if (integers.get(mid) == x || integers.get(mid+1) == x) {
            	if(integers.get(mid)==x)
            		return mid;
            	
                return mid+1;
            }


            // test perfect range.
            if (integers.get(mid) < x  && integers.get(mid+1) > x) {
                return mid ;
            }

            // keep searching.
            if (integers.get(mid) < x) {
                low = mid + 1;
            } else { 
                high = mid;
            }
        }

        throw new IllegalArgumentException("The array cannot be empty");
    }



	
	
	


}
