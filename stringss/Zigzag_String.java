package stringss;

import java.util.Arrays;

public class Zigzag_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println( convert("NX9AROO79WZSd",24));
	
		System.out.println(" adsd");
	
	}
	
	public static String convert(String a, int b) {
		if(a.length()<=b)
			return a;
		if(b==1)
			return a;
	
		
		
		String Answer="";
		
		String arr[]= new String[b];
		Arrays.fill(arr, "");
		boolean cond=true;
		int i =0;
		
		for(;i<b;)
		{
			arr[i]=arr[i]+a.charAt(i);
			i++;
		}
		
		
		for(;i<a.length();)
		
		{
			if(cond){
			for(int j=b-2;j>=0;j--){
				if(i==a.length())
					break;
				arr[j]=arr[j]+a.charAt(i);
				i++;

			}cond=false;
			
			}
			
			else{
			for(int j=1;j<b;j++){
				if(i==a.length())
					break;
				arr[j]=arr[j]+a.charAt(i);
				i++;

			}cond=true;
			
			}
	
		}
		
		for(int j=0;j<b;j++)
			Answer=Answer+arr[j];
		
		return Answer;
	}
	
	
	
}
