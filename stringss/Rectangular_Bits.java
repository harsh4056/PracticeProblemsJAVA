package stringss;

import java.util.Scanner;

public class Rectangular_Bits {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			
			int col=scanner.nextInt();
			int ops=scanner.nextInt();
			int s1=0,e1=0,s2=0,e2=0,s3=0,e3=0;
			
			boolean firstCase1=true;
			boolean firstCase2=true;
			boolean firstCase3=true;
			
			for(int j=1;j<=ops;j++){
				int row=scanner.nextInt();
				
				int s=scanner.nextInt();
				int e=scanner.nextInt();
			
				
				
				switch (row) {
				case 1:
					if(firstCase1)
					{
						s1=s;
						e1=e;
						
						firstCase1=false;
					}
					else{
					if(s<=s1)
						s1=s;
					if(e>=e1)
						e1=e;
					}
					
					break;
				case 2:
					if(firstCase2)
					{
						s2=s;
						e2=e;
						firstCase2=false;
					}
					else{
					if(s<=s2)
						s2=s;
					if(e>=e2)
						e2=e;
					}
					break;
				case 3:
					
					if(firstCase3)
					{
					s3=s;
					e3=e;
					firstCase3=false;
					}
					else{
					if(s<=s3)
						s3=s;
					if(e>=e3)
						e3=e;
					}
					break;
				default:
					break;
				}
				
				
			
			
			
		
			
			
			
			
				
				
			}
			System.out.println();
			
			int area=0;
			if(e1-s1+1>area)
				area=e1-s1+1;
			
			if(e2-s2+1>area)
				area=e2-s2+1;
			
			if(e3-s3+1>area)
				area=e3-s3+1;
			
			if((Math.min(e1, e2)-Math.max(s1, s2)+1)*2>area)
				area=(Math.min(e1, e2)-Math.max(s1, s2)+1)*2;
			
			if((Math.min(e3, e2)-Math.max(s3, s2)+1)*2>area)
				area=(Math.min(e3, e2)-Math.max(s3, s2)+1)*2;
			
		int max=Math.max(s1, s2);
		max=Math.max(max, s3);
		int min=Math.min(e1, e2);
		min=Math.min(min, e3);
		
		if((min-max+1)*3>area)
			area=(min-max+1)*3;
		
		
		System.out.println(area);
			
			
			
			
			
		}
		scanner.close();
	}

}
