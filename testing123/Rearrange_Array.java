package testing123;

import java.util.ArrayList;

public class Rearrange_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(4);
		ar.add(3);
		ar.add(0);
		ar.add(1);
		ar.add(2);
		
		
            System.out.println(arrange(ar));
		
		
	}
	public static ArrayList<Integer> arrange(ArrayList<Integer> a){
		for(int i=0;i<a.size();i++){
			int holder= a.get(i);
			holder=holder+(a.get(holder) %a.size())*a.size();
			a.set(i, holder);
		}
		
		for(int i=0;i<a.size();i++){
			int holder =a.get(i);
			holder=holder/a.size();
			a.set(i, holder);
			
			
		}
		
		return a;
		
	}
}
