package testing123;

import java.util.ArrayList;
import java.util.Collections;

public class Sorted_Permutation_Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findRank("abed"));
	}
	public static int findRank(String a) {
		
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
	for(int i=0;i<a.length();i++)
		arr.add((int)a.charAt(i));
	long fac=1;
	int len=a.length()-1;
	ar.add(0);
	for(int i=1;i<=a.length()-1;i++){
		fac=fac*i;
		
	
	}
		
		Collections.sort(arr);
		
		
		long pos=1;
		int cnt=0;
		while(cnt<a.length()-1){
			
			int x=(int)a.charAt(cnt);
			int y=arr.indexOf(x);
			arr.remove(y);
			
			long z=(fac*y);
			fac=fac/len--;
			pos=pos+z;
			cnt++;
			
		}
		
		int pi=(int) (pos%1000003);
		return (pi);
	}
}
