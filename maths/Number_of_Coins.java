package maths;

import java.util.ArrayList;


import java.util.Scanner;

public class Number_of_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			int pesa=scanner.nextInt();
		    int size=scanner.nextInt();
		    
		    ArrayList<Integer> arr= new ArrayList<Integer>();
		   
		    for(int j=1;j<=size;j++){
		    	arr.add(scanner.nextInt());
		    }
		    int R[]= new int [pesa+1];
		    int C[]= new int [pesa+1];
		    R[0]=0;
		    C[0]=0;
		    
		    for(int j=1;j<=pesa;j++)
		    {
		    	 R[j]=Integer.MAX_VALUE-1;
		    	 C[j]=-1;
		    	
		    }
		    
		    for(int j=0;j<size;j++)
		    {
		    	 for(int k=1;k<=pesa;k++)
				    {
		    		 if(k>=arr.get(j)){
				    if(R[k-arr.get(j)] +1<R[k]){
				    	R[k]=R[k-arr.get(j)] +1;
				    	C[k]=j;
				    	
				    }}
				    	
				    }
		    	
		    }
		    
		  if(C[pesa]==-1)
			  System.out.println(-1);
		  else{
			  System.out.println(R[pesa]);
		  }
		    
		    
		    
	}
		
	
	
	}

}
