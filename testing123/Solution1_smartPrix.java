package testing123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution1_smartPrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;
		ArrayList <String> a= new ArrayList <String>();
		ArrayList<String> hm= new ArrayList<String>();
		 a.add(scanner.nextLine());
		a.add(scanner.nextLine());
		/*%sprix is the %s[4] online %s[3]:6 shopping %s:9 in %s
Smartprix is the Best online compar shopping site in India. */
		
		
		String arr[]=a.get(0).split(" ");
		for( count=0;count<arr.length;count++)
	
		{
			hm.add( arr[count]);
			
			
			
		
			
			
		}
		
		
		String formatString=a.get(1);
		String newStr="";
		int cnt=0;
		for(int i=0;i<formatString.length();i++)
		
		{if(i+1!=formatString.length())
			
			if( !(i+1==formatString.length()) && formatString.charAt(i)=='%' && formatString.charAt(i+1)=='s' && formatString.charAt(i+2)=='['   ){
				if(Character.isDigit(formatString.charAt(i+3))  ){
					
					
					if(formatString.charAt(i+5)==':' && Character.isDigit(formatString.charAt(i+6))){
						int z= Integer.parseInt(formatString.charAt(i+3)+"");
						int y= Integer.parseInt(formatString.charAt(i+6)+"");
						if(y>(hm.get(z).length()-1))
								y=(hm.get(z).length()-1);
						
				
					String s= hm.get(z).substring(0, y);
				newStr= newStr +hm.get(z) ;
				i=i+5;}
					
					else if(formatString.charAt(i+3)!='%'){
						int z= Integer.parseInt(formatString.charAt(i+3)+"");
					
						
						if(z>-1 && z<=hm.size()-1)
						{
					String s= hm.get(z);
				newStr= newStr +s ;
				i=i+4;}
					}
					
				
				}
				}
			
			
			
			else if( !(i+1==formatString.length()) && formatString.charAt(i)=='%' && formatString.charAt(i+1)=='s' && formatString.charAt(i+2)!='['  && !(i+1==formatString.length())){
				
				if(formatString.charAt(i+2)==':' && Character.isDigit(formatString.charAt(i+3))){
				
					int y= Integer.parseInt(formatString.charAt(i+3)+"");
					if(y>(hm.get(cnt).length()-1))
							y=(hm.get(cnt).length()-1);
					
			
				String s= hm.get(cnt).substring(0, y);
			newStr= newStr +s ;
			i=i+3;
			cnt++;}
				else{
				i=i+1;
					newStr= newStr +hm.get(cnt) ;
					cnt++;
				}
				
				
			}
			
			else{
				
				char ats=formatString.charAt(i);
				newStr=  newStr +ats;
			}}
		
		if(a.get(1).charAt(a.get(1).length()-1)=='.')
		newStr=newStr+".";
		
		System.out.println(newStr);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	

