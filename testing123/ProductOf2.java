package testing123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOf2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			
			String s="";
			int length=scanner.nextInt();
			int prod=scanner.nextInt();
			
			
			int arr[]= new int[length];
			for (int j=0;j<length;j++){
				arr[j]=scanner.nextInt();
			}
			int remain=0;
			int mileStone = 0;
			String gotit="No";
		    for(int j= 0;j<length;j++){
		    	if(prod % arr[j]==0){
		    		remain=prod / arr[j];
		    		mileStone=j;
		    		
		    		for(int k= mileStone;k<length;k++){
				    	if(remain==arr[k]){
				    		gotit="Yes";
				    		break;
				    	}
				    	
				    }
		    		
		    	}
		    	
		    
		    
			
			
		
		scanner.close();
	

}System.out.println(gotit);
		    }
		}
	}
