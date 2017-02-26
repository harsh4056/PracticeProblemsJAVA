package stringss;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare_Version_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compareVersion("02" , "1.13.4"));
		
	}
	public static int compareVersion(String a, String b) {
		String AA[]=a.split("\\.");
		String BB[]=b.split("\\.");
		
		
	int ans=0;
		ArrayList<String> A= new ArrayList<String>();
		ArrayList<String> B= new ArrayList<String>();
	
		for(int i=0;i<AA.length;i++){
			AA[i]=AA[i].replaceFirst("^0+(?!$)", "");
			A.add(AA[i]);
			}
			for(int i=0;i<BB.length;i++){
				BB[i]=BB[i].replaceFirst("^0+(?!$)", "");
				B.add(BB[i]);	
			}
		
		
		
		
		
		if(A.size()>B.size()){
			int diff=A.size()-B.size();
			for(int i=0;i<diff;i++)
				B.add("0");
			
			
		}
		else if(A.size()<B.size()){
			int diff=B.size()-A.size();
			for(int i=0;i<diff;i++)
				A.add("0");
		}
		
		for(int i=0;i<A.size();i++){
			int cmp=comparator(A.get(i), B.get(i));
			
			if(cmp==1)
				return 1;
			else if(cmp==-1)
				return -1;
			
			
		}
		
		
		
		
		
		
	/*	String sumA="";
		String sumB="";
		
		for(int i=0;i<A.length;i++){
		sumA=adder(A[i], sumA);
		}
		for(int i=0;i<B.length;i++){
			sumB=adder(B[i], sumB);
		}*/
	
		
		
	
		
		
		return ans;
	}


	
	public static int comparator(String sumA,String sumB){
		
		if(sumA.length()>sumB.length())
			return 1;
		if(sumA.length()<sumB.length())
			return -1;	
		if(sumA.length()==sumB.length())
		{
			for(int i=0;i<sumA.length();i++){
				int inA=Integer.parseInt(sumA.charAt(i)+"");
				int inB=Integer.parseInt(sumB.charAt(i)+"");
				
				if(inA>inB)
					return 1;
				if(inA<inB)
					return -1;	
				
			}
		
	}
	
return 0;	
}
	
}
