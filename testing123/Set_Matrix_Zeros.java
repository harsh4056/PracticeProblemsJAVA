package testing123;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_Matrix_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr1=	 new ArrayList<Integer>() ;
		arr1.add(0);
		arr1.add(0);
		ArrayList<Integer> arr2=	 new ArrayList<Integer>() ;
		arr2.add(1);
		arr2.add(0);
		a.add(arr1);
		a.add(arr2);
		setZeroes(a);
		System.out.println(a);
		
		
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		
		int col= a.get(0).size();
		int row=a.size();
		int arrC []= new  int[col];
		int arrR []= new  int[row];
		Arrays.fill(arrC, 1);
		Arrays.fill(arrR, 1);
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < col; j++) {
				 if(a.get(i).get(j)==0){
					 arrC[j]=0;
					 arrR[i]=0;
					 
				 }
				 
			 }
	
		
		 }
		 
		 a.clear();
		 for (int i = 0; i < row; i++) {
			 ArrayList<Integer> arr=	 new ArrayList<Integer>() ;
			 for (int j = 0; j < col; j++) {
				 
				 arr.add(arrC[j]*arrR[i]);
			
					 
				 
				 
			 }
			 a.add(arr );
		
		 }
		 
		 
		
	
		
	}
	
	
}
