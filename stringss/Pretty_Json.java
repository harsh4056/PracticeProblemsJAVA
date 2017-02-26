package stringss;

import java.util.ArrayList;

public class Pretty_Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> prettyJSON;
		// prettyJSON= prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");	

		 prettyJSON= prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");	
		 for(int i=0;i<prettyJSON.size();i++){
			 System.out.println(prettyJSON.get(i));
		 }
		 
		 
		 
	}
	
	
	public static ArrayList<String> prettyJSON(String a) {
		
	int indents =0;
	 ArrayList<String> prettyJSON =new ArrayList<String> ();
	 String strGen="";
	 int len=a.length();
	 a+="~";
		for(int i=0;i<len;i++){
			
			if(a.charAt(i)=='{' ||a.charAt(i)=='[')
			{    if(!strGen.equals("")){
				strGen= createSpaces(indents)+strGen;
				prettyJSON.add(strGen);
			}
				prettyJSON.add(createSpaces(indents)+a.charAt(i)+"");
				strGen="";
				indents++;
				continue;
			}
				
			
			
			
				
				if(a.charAt(i)==']'  &&a.charAt(i+1)!=','){
					
					  if(!strGen.equals("")){
							strGen= createSpaces(indents)+strGen;
							prettyJSON.add(strGen);
						}
					--indents;

					prettyJSON.add(createSpaces(indents)+a.charAt(i)+"");
					strGen="";
					continue;
				}
				
				
				if(a.charAt(i)=='}'   &&a.charAt(i+1)!=','){
					
					  if(!strGen.equals("")){
							strGen= createSpaces(indents)+strGen;
							prettyJSON.add(strGen);
						}
					--indents;

					prettyJSON.add(createSpaces(indents)+a.charAt(i)+"");
					strGen="";
					continue;
				}
				
				if (a.charAt(i+1)==',' &&  a.charAt(i)==']'){
					 if(!strGen.equals("")){
							strGen= createSpaces(indents)+strGen;
							prettyJSON.add(strGen);
						}
					--indents;
					String s=createSpaces(indents)+a.charAt(i)+a.charAt(i+1);
					prettyJSON.add(s);
					
					strGen="";
					i++;
					continue;
					
				}
				if ( a.charAt(i)=='}'){
					if(a.charAt(i+1)==','){
						 if(!strGen.equals("")){
								strGen= createSpaces(indents)+strGen;
								prettyJSON.add(strGen);
							}
						--indents;
					String s=createSpaces(indents)+a.charAt(i)+a.charAt(i+1);
					prettyJSON.add(s);
					
					strGen="";
					i++;
					continue;
					
				}}
				
				strGen= strGen+a.charAt(i);
			if(a.charAt(i)==',' ){
				strGen= createSpaces(indents)+strGen;
				prettyJSON.add(strGen);
				strGen="";
			}
				
				
			
			
		}
	
		
		
		
	return prettyJSON;
	}
	
	public static String createSpaces(int a){
		String s="";
		for(int i=0;i<a;i++){
		s=s+"\t";	
		}
		
		
		return s;
		
	}
	
	

}
