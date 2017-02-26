package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Largest_Number_Formation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> s= new ArrayList<Integer>();
		s.add(3496);
		s.add(3495);
		s.add(3395);
		
		
		System.out.println(largestNumber(s));
		
		
	}


       
     /** 
     * This method sorts the List on logic of comparison i.e. the input list is 13,300,341,51,92 
     * comparator compares pair wise, first two elements will be compared as 13300 and 30013 and like wise sort the list 
     * @param intList 
     */  
	public static String largestNumber(final List<Integer> list) {
     {  String a="";
     
     List<Integer> intList=list;
            Collections.sort(intList, new Comparator<Integer>() {  

                   @Override  
                   public int compare(Integer first, Integer second) {  
                         int firstSecond = Integer.parseInt(Integer.toString(first) + Integer.toString(second));  
                         int secondFirst = Integer.parseInt(Integer.toString(second) + Integer.toString(first));  
                         return secondFirst-firstSecond;  
                   }  
            });  
            
            int sum=0;
            
            for(int t=0;t<intList.size();t++){
            	sum=sum+intList.get(t);
            	a=a+ intList.get(t);
            }
            
            if(sum==0)
            	return "0";
            
            
            return a;
     }  
	
	
	
	
	
	}
}
