package arrays;

import java.util.ArrayList;

public class Pascal_Kth_Row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(3));
	}

	public static ArrayList<Integer> generate(int a) {
		int z=a;
		a=a+2;
		ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a;i++){
			ArrayList<Integer> ar1= new ArrayList<Integer>();
			
			ar1.add(1);
			
			for(int j=1;j<i-1;j++){
				ar1.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
				
				
			}
			ar1.add(1);
			arr.add(ar1);
			
		}
		
		arr.remove(0);
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(1);
		arr.set(0, ar1);
		
		return arr.get(z);
		
		
	}
	
}
