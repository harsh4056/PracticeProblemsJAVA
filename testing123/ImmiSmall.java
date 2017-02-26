package testing123;

import java.util.Scanner;

public class ImmiSmall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			int lnt= scanner.nextInt();
			
			int[] arr= new int[lnt];
			for(int j=0;j<lnt;j++){
				arr[j]=scanner.nextInt();
				
			}
			int loop=lnt-1;
			
		for(int k=0;k<loop;k++)
		{
			if(arr[k]-arr[k+1]>0){
				System.out.print(arr[k+1]+" ");
			}
			else System.out.print("-1 ");
			} 
		System.out.print("-1 ");
		}
				
			
			
			
		

	

}}
