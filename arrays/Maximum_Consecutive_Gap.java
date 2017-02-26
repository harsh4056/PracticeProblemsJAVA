package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Consecutive_Gap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> a= new ArrayList<Integer>();
			a.add(10);
			a.add(10);
			a.add(21);
			a.add(33);
			a.add(45);
			System.out.println(maximumGap(a));
			
			
	}

	public static int maximumGap(final List<Integer> a) {
		int max_GAP=0;
		int max=Collections.max(a),min=Collections.min(a);
				
				double gap=Math.ceil((double)(max-min+1)/(a.size()-1));
				
		if(a.size()==2)	
		return max-min;
		else if(a.size()==1|| a.isEmpty())
			return 0;
		
		
		ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
		for(int j=0;j<a.size();j++){
			arr.add(new ArrayList<Integer>());
			
		}
		
		
		for(Integer i:a){
			
			int y=(int) Math.floor((i-min)/gap);
			arr.get(y).add(i);
			
			
			
			
		}
		
		ArrayList<Integer> t =new ArrayList<Integer>();
		
		for(int k=0;k<a.size()-1;k++){
			
			if(arr.get(k).isEmpty())
				continue;
			t.add(Collections.min(arr.get(k)));
			t.add(Collections.max(arr.get(k)));
			
			
		}
		
		max_GAP=0;
		for(int k=1;k<t.size()-1;k++){
			int p=t.get(k);
			k++;
			int q=t.get(k);
			k--;
			
			if(max_GAP<Math.abs(p-q))
				max_GAP=Math.abs(p-q);
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return max_GAP;
	}
	
	
	
}
