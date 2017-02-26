package testing123;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Min_Steps_Grid {

	public static void main(String[] args) {
		Integer  A[]= { 4, 8, -7, -5, -13, 9, -7, 8 };
		Integer  B[]= { 4, -15, -10, -3, -13, 12, 8, -8 };
		
		Collection<Integer> a=(Collection<Integer>) Arrays.asList(A);
		Collection<Integer> b=(Collection<Integer>) Arrays.asList(B);
		ArrayList<Integer> X= new ArrayList<Integer>();
		ArrayList<Integer> Y= new ArrayList<Integer>();
	X.addAll(a);
	Y.addAll(b);
		System.out.println(coverPoints(X, Y));
		System.out.println();

	}
	
	 public static int  coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
	
		
			 
			 int count=0,i,xd,yd;
			    for(i=0;i<X.size()-1&&i<Y.size()-1;i++)
			    {
			      xd=Math.abs(X.get(i)-X.get(i+1));
			      yd=Math.abs(Y.get(i)-Y.get(i+1));
			      if(xd>=yd)
			      count=count+xd;
			      else count=count+yd;
			    }
			    return count;
			
	    }

}
