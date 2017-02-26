package testing123;

public class Trailing_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(trailingZeroes(120));
	}
	
	public static int trailingZeroes(int a) {
	   	    double b=(double)a;
	    int twos=0;
	    
	    
  int multiplier2=2;
while(multiplier2<=a){
	    	
	    	if( (int) Math.floor((b/multiplier2))>0);
	    	twos=twos+(int) Math.floor((b/multiplier2));
	    	multiplier2=multiplier2*2;
	    	
	    	
	    }
	    int fives=0;
	    int multiplier=5;
	    while(multiplier<=a){
	    	
	    	if( (int) Math.floor((b/multiplier))>0);
	    	fives=fives+(int) Math.floor((b/multiplier));
	    	multiplier=multiplier*5;
	    	
	    	
	    }
	    
	    
	    
	    
	    
	  return Math.min(fives, twos);  
	}

}
