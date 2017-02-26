package testing123;

import java.util.Scanner;

public class Overlapping {
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int T=scanner.nextInt();
	
String s1="";
String s2="";
	for(int i=1;i<=T;i++){
		int arr[][]= new int [2][4];
		for(int j=0;j<4;j++){
			for(int k=0;k<2;k++){
			
			
			arr[k][j]=scanner.nextInt();
			if(j<2)
			s1=s1+arr[k][j];
			else
				s2=s2+arr[k][j];
			
			
			}
			
			
			
		}
		int LowY =Math.min(arr[1][0], arr[1][1]);
		int HighY=Math.max(arr[1][0], arr[1][1]);
		int HighX=Math.max(arr[0][0], arr[0][1]);
		int LowX=Math.min(arr[0][0], arr[0][1]);
		
		if(!(s1.equals(s2))){
		if((arr[1][2]>LowY&&arr[1][2]<HighY)||(arr[1][3]>LowY&&arr[1][3]<HighY)){
			
			
			if((arr[0][2]>LowX&&arr[0][2]<HighX)||(arr[0][3]>LowX&&arr[0][3]<HighX)){
				
				System.out.println("1");
				
			}
			else{

				System.out.println("0");
			}
			
		}
		else{
			System.out.println("0");
		}
		
		
		}else
			System.out.println("1");
	}
	}
	}


