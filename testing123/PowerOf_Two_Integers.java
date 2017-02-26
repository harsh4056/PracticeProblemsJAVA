package testing123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowerOf_Two_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPower(102400 ));
		
	}

	public static boolean isPower(int A) {
		int i,a;
	    double p;
	  
	    if(A == 1)
	        return true;
	    for(a = 1;a <= Math.sqrt(A);a++)
	    {
	        p = Math.log(A) / Math.log(a);
	        if(p - (int)p < 0.000000001)
	            return true;
	    }
	   
		
		
		return false;
	}
	
}
