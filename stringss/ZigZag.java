package stringss;

import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int j=1;j<=T;j++){
			int size=scanner.nextInt();
			int firstElement=scanner.nextInt();
			int nextElement=0;
			int counter=0;
			for(int i=1;i<size;i++){
				nextElement=scanner.nextInt();
				if(counter%2==0)
				{
					if(firstElement>nextElement){
						
						int temp=firstElement;
						firstElement=nextElement;
						nextElement=temp;
					}
					
					
				}
				if(counter%2==1)
				{
					if(firstElement<nextElement)
					{
						int temp=firstElement;
						firstElement=nextElement;
						nextElement=temp;
					}
					
				}
				System.out.print(firstElement + " ");
				counter++;
				firstElement=nextElement;
				
				
			}
			
			System.out.print(firstElement + " ");
			
		}
	}

}
