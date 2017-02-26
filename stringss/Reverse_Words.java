package stringss;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_Words {
	
	 public static void main(String args[] ) throws Exception {
	     
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	   

	        	
	  
	    String arr[]=    line.split(" ");
	    for(int i=arr.length-1;i>=0;i--){
	    	System.out.print(arr[i]);
	    	if(i !=0)
	    		System.out.print(" " );
	    }
br.close();
	    }

}
