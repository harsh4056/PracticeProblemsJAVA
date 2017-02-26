package arrays;

import java.util.ArrayList;

public class Pascal_Triangle_Rows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(generate(9));
	}
	public static ArrayList<ArrayList<Integer>> generate(int a) {
		if(a==0){
			ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
			return arr;
			
		}
		a=a+1;
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
		
		return arr;
		
		
	}

}
