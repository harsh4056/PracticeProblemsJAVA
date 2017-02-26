package arrays;

import java.util.*;



public class Max_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr= new ArrayList<Integer> ();
		arr.add(100);
		arr.add(100);
		arr.add(100);
		arr.add(100);
	//	arr.add(2);


	
		//arr.add(1);
		
		
		System.out.println(maxIndexDiff(arr));
	}
	
public static	 int maxIndexDiff(List<Integer> arr1) 
	    {
	int n=arr1.size();
	Integer arr[] = new Integer[arr1.size()];
	arr1.toArray(arr);
	
	
	        int maxDiff = -1;
	        int i, j;
	 
	        for (i = 0; i < n; ++i) 
	        {
	            for (j = n - 1; j > i; --j) 
	            {
	                if (arr[j] > arr[i] && maxDiff < (j - i))
	                    maxDiff = j - i;
	            }
	        }
	 
	        return maxDiff;
	    }
/*	public static int maximumGap(final List<Integer> a) {
		Integer arr[]=new Integer[a.size()];
		Integer array[]=new Integer[a.size()];
		
	a.toArray(array);
	arr=array.clone();
		
		Arrays.sort(array);
		int index_array[] = new int[a.size()];

		 //iteretate on x arrat
		 for(int i=0; i<a.size(); i++)
		    //search the position of a value of the original x array into the sorted y array, store the position in the index array
		    index_array[i] =Arrays.binarySearch(array, arr[i]);
		
		int max=0;
		int i;
		 for( i=0;index_array[i]!=0; i++)
		 {}
			 
		 for(;i<a.size();i++){
			 if(index_array[i]>max)
				 max=index_array[i];
		 }
		return max;
		
		
		
	}*/
	
	
}
