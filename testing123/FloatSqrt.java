package testing123;

import java.util.Scanner;

public class FloatSqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
	     System.out.println(  floorSqrt(scanner.nextLong()));
		}

	}
	 static long floorSqrt(long x)
	 {
	
			long lowerSquare=0;
			int inc2=1;
			long num= x;
			long inc1=0;
			for(long j=1;j<num;){
				
				lowerSquare=lowerSquare+inc2;
				
				
				j=lowerSquare;
				inc2+=2;
				inc1++;
			
				
			}
			if(num==lowerSquare)		
			return(inc1);
			else{
				return(inc1-1);
			}
	 }

}
