package testing123;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Prime_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primesum(1048574));

	}
	  public static ArrayList<Integer> primesum(int n)
	  { 
		  
		  ArrayList<Integer> ar= new ArrayList<Integer>();
		  
		  ArrayList<Integer> list= new ArrayList<Integer>();
		  
		  
		 int z=n;
		 n=n+1;
		  
		  
		  boolean[] isPrimeNumber = new boolean[n + 1]; // boolean defaults to
		    // false
		   
		    for (int i = 2; i < n; i++) {
		      isPrimeNumber[i] = true;
		    }
		    for (long i = 2; i < n; i++) {
		      if (isPrimeNumber[(int) i]) {
		       list.add((int) i);
		        // now mark the multiple of i as non-prime number
		        for (long j = i; j * i <= n; j++) {
		          isPrimeNumber[(int) (i * j)] = false;
		        }
		      }

		    }
		 
		   for(int i=0;i<list.size();i++){
			   
			   if(list.contains(z-list.get(i)))
			   {
				   ar.add(list.get(i));
				   ar.add(z-list.get(i));
			   break;
		   }
		   }
		    
			return ar;
			

	    }
}
