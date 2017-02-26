package testing123;

import java.util.ArrayList;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(isPrime(391));
	}

	public static int isPrime(int n) {
	    
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
		    if(list.get(list.size()-1)==n-1)
		    return 1;
		    return 0;
	    
	}
	
}
