package stringss;

import java.util.ArrayList;


public class Justified_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("What");
		arr.add("must");//A : [ "What", "must", "be", "shall", "be." ]
		arr.add("be");
		arr.add("shall");
		arr.add("be.");
	
		
		


		
		System.out.print(fullJustify(arr, 12));
		
		
	}
	public static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		int i=0;
		if(a.isEmpty())
			return null;
		if(a.get(0).equals(""))
			return null;
		
		
	a.add("");
		ArrayList<String> ans= new ArrayList<String>();
		
		while(i<a.size()){
			ArrayList<String> temp= new ArrayList<String>();
			int sum=0;
			int leftSpaces=0;
			while(i<a.size() && sum+a.get(i).length()<=b ){
			sum=sum+	a.get(i).length()+1;
			leftSpaces=leftSpaces+a.get(i).length();
			temp.add(a.get(i));
			i++;
				
				
				
			}
			
			if(i==a.size()){
				String s="";
				for(int j=0;j<temp.size();j++)
					s=s+temp.get(j)+" ";
				
				for(int j=0;j<b-s.length();j++)
				s=s+" ";
				
				ans.add(s);}
			else
			ans.add(arrangeSpaces(temp, b-leftSpaces));
			
			
			
			
		}
		
		
		return ans;
	}
	
	public static String arrangeSpaces(ArrayList<String> a, int b){
		String answer="";
		
		int numberOfSPaces;
		int leftSpaces;
		if(a.size()==1)
		{numberOfSPaces=b;
		leftSpaces=0;
		
			
		}
		
		else{
			 numberOfSPaces=b/(a.size()-1);
			 leftSpaces=b%(a.size()-1);
		}
		
		for(int i=0;i<a.size();i++){
			answer=answer+a.get(i);
			if(i==0){
				for(int j=0;j<numberOfSPaces+leftSpaces &&b>0;j++){
					answer=answer+" ";
					b--;
					
				}	}
			else{
				for(int j=0;j<numberOfSPaces &&b>0;j++){
					answer=answer+" ";
					b--;
				}
				
			}
			
			
		}
		
		
		
		
		
	return answer;
	
	}
	
	
	
}
