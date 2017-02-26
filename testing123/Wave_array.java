package testing123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Wave_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {6, 17, 15, 13 };
		Collection<Integer> c=(Collection<Integer>) Arrays.asList(a);
		ArrayList<Integer> listEle= new ArrayList<Integer>();
		listEle.addAll(c);
		System.out.println(wave(listEle));
	}
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		
		ArrayList<Integer> omega = new ArrayList<Integer>(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.sort(omega);
		
    for(int i=0;i<omega.size();i=i+2){
    	if(i+1<omega.size())
    	list.add(omega.get(i+1));
    	list.add(omega.get(i));
    	
    	
    	
   
    	
    	
    	
    }
		return list;
	}

	public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
	
	
}
