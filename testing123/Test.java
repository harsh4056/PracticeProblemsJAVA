package testing123;

import java.util.*;

class Test {
	public static void main (String[] args) {
	    
	    
	    
	
Scanner scanner = new Scanner(System.in);
int T=scanner.nextInt();
System.out.println();

for(int i=1;i<=T;i++){
	int arr[][]= new int [2][4];
	for(int j=0;j<4;j++){
		for(int k=0;k<2;k++){
		
		
		arr[k][j]=scanner.nextInt();
		}
		
	}
	
	double[] dist= new double[6];
	int c=0;
	for(int j=0;j<4;j++){
		for(int k =j+1;k<4;k++){
			dist[c++]=  Math.sqrt (((arr[0][j])-(arr[0][k]))*((arr[0][j])-(arr[0][k]))+((arr[1][j])-(arr[1][k]))*((arr[1][j])-(arr[1][k])));
		}
	}
	
	double max = dist[0];
	double min = dist[0];

	for (int g = 1; g < dist.length; g++) {
	    if (dist[g] > max) {
	      max = dist[g];
	    }
	    if (dist[g] < min) {
		      min = dist[g];
		    }
	}
	
	int countDiag=0;
	int countSide=0;
	for(int j=0;j<6;j++)
	{
		if(dist[j]==max){
			countDiag++;
		}
		if(dist[j]==min){
			countSide++;
		}
	}
	if(countDiag==2 && countSide==4){
		System.out.println("1");
	}
	else{
		System.out.println("0");
	}
	}
scanner.close();
}
}