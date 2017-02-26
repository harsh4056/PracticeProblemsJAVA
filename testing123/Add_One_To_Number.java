package testing123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Add_One_To_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> plusOne = new ArrayList<Integer>();
	;
	plusOne.add(0);
	plusOne.add(0);
	plusOne.add(0);
				
	plusOne.add(9);
		plusOne.add(0);
		plusOne.add(9);
	
		System.out.println(plusOne(plusOne));
		
		
	}
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
         
		ArrayList<Integer> plusOne = new ArrayList<Integer>();
	
		
		int inc=0;
		
		while( inc<a.size() && a.get(inc)==0){
			inc++;
		}
		while(inc<a.size()){
		
			plusOne.add(a.get(inc));
			inc++;
			
		}
		
		
		if(!plusOne.isEmpty())
			a=plusOne;
		else{
			plusOne.add(0);
			a=plusOne;
		}
		
	
		
		if(a.get(a.size()-1)==9){
		
			for(int i=a.size()-1;i>=0;i--){
				if(a.get(i)==9){
					
					a.set(i, 0);
				}
				else {a.set(i, (a.get(i)+1));
				break;
				}
			
					
			}
		if(a.get(0)==0  )	{
			a.add(0,1);
		}
		
			
		}
		else{
			a.set(a.size()-1, a.get(a.size()-1)+1);
		}
		



		
		
		
		
		return a;
	}

}
