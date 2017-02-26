package testing123;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class PRETTYPRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(prettyPrint(24));
	}

	public static  ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		
	
		int loop= 2*a-1;
	ArrayList<ArrayList<Integer>> arri= new ArrayList<ArrayList<Integer>>(loop);
	

		
		Integer arr[][] = new Integer [loop][loop];
	
		for(int i =0;i<loop;i++){
			int negLoop=loop-1-i;
			for(int j=0;j<(2*a-1);j++){
				
				arr[i][i+j]=a;
				arr[i+j][i]=a;
				arr[negLoop-j][negLoop]=a;
				arr[negLoop][negLoop-j]=a;
				  
			/*	arri.get(i).set(i+j, a);
				arri.get(i+j).set(i, a);
				arri.get(negLoop-j).set(negLoop, a);
				arri.get(negLoop).set(negLoop-j, a);
				*/
				
				
				
				
			}a--;
			if(a<0)
				break;
			
			
		}
		
		ArrayList<Integer> aaaa= new ArrayList<Integer>();
	
	
		
		for(int i=0;i<loop;i++){
			ArrayList<Integer> temp= new ArrayList<Integer>(loop);	
			Collection<Integer> tempAList=(Collection<Integer>) Arrays.asList(arr[i]);
			temp.addAll(tempAList);
			arri.add(temp);
		
		}
		
		
	
		
		
		return arri;
	}
	
	
	
	
}
