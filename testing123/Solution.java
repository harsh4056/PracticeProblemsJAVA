package testing123;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
	
	public static void main(String[] args) {
		
		
		Integer[] a= {336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 };
		Collection<Integer> c=(Collection<Integer>) Arrays.asList(a);
		ArrayList<Integer> listEle= new ArrayList<Integer>();
		listEle.addAll(c);
		
		//[ 1967513926, 1540383426, -1303455736, -521595368 ]
		

		
		Solution s= new Solution();
		listEle=	s.maxset(listEle);
		System.out.println("Happy to help");
		
		
		
	}

	
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		a.add(0, -1);
		long sum=0;
		long prevSum =0;
		boolean Condition =true;
		int start=0,end = 0,prevStart=0,PrevEnd=0;
		ArrayList<Integer> listEle= new ArrayList<Integer>();
		
		ArrayList<Integer> buffer= new ArrayList<Integer>();
	
		for(int i=a.size()-1;i>=0;i--){
			if(a.get(i)>=0){
				
				buffer.add(a.get(i));
				sum =sum +a.get(i);
				if(Condition){
					Condition=false;
					end=i;
					
				}
				
				
				
			}
			 if(a.get(i)<0  )  {
				
				start=i+1;
				
				if(sum>prevSum)
				{
				prevSum=sum;
				prevStart=start;
				PrevEnd=end;
				Condition =true;
				listEle=(ArrayList<Integer>) buffer.clone();
				
				}
				
				else if(sum==prevSum){
					if(buffer.size()>listEle.size()){
						prevSum=sum;
						prevStart=start;
						PrevEnd=end;
						Condition =true;
						listEle=(ArrayList<Integer>) buffer.clone();
					}
					else if(buffer.size()==listEle.size()&&!buffer.isEmpty()){
						if(start>prevStart){
							prevSum=sum;
							prevStart=start;
							PrevEnd=end;
							Condition =true;
							listEle=(ArrayList<Integer>) buffer.clone();
						}
						
						
						
					}
					
					
					
					
				}
				Condition =true;
				
				if(listEle.isEmpty())
					listEle=(ArrayList<Integer>) buffer.clone();
				buffer.clear();
				sum=0;
				
			}
			
			
			
		}
		
		
		
		
		 Collections.reverse(listEle);
		
		return listEle;
	    
	    
	    
	    
	}
	
	
	
}
