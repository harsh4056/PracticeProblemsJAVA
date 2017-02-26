package testing123;



import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class SYCO {

	static HashMap<String, String> q ;
	static HashMap<String, String> namkaran ;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		String commandsNdata="";
		
			q = new HashMap<String, String>();
		 namkaran = new HashMap<String, String>();
		//print
		//toUpper
		//reverse    
		//toLower
		//append_a
		namkaran.put("print", "P");
		namkaran.put("toupper", "U");
		namkaran.put("reverse", "R");
		namkaran.put("tolower", "L");
		namkaran.put("append_a", "A");
		String s = "";
		while(scanner.hasNext() && !(s.equals("exit"))){
			
			
			
			s= scanner.next();
			if(s.equals("exit"))
					break;
			
			if(s.equals("define"))
			{
				String es=scanner.next();
				q.put(es, "V");
				String nameOfFunc=es;
		
				while(!es.equals("end")){//for function definition translation
					String nw="";
					 es=scanner.next();
					 String forPuttingOnHm= namkaran.get(es);
					 if(forPuttingOnHm==null   ){
						 forPuttingOnHm="";
					 
					
						
						 
					 }
					 nw= forPuttingOnHm + q.get(nameOfFunc);
					 if(forPuttingOnHm.equals("")&& !es.equals("str")  ){
						 nw="#"+es + "#" +forPuttingOnHm + q.get(nameOfFunc);
					 }
					 
					 
					 if(es.equals("str")){
						  
						 nw= new StringBuilder(nw).reverse().toString();
					 }
					 
					 
					 
				
						q.put(nameOfFunc, nw );
						
					
				}
				namkaran.put(nameOfFunc, q.get(nameOfFunc));
				
				
				
				
				
			}
			else {
				
				if(s.startsWith("\"")  && s.endsWith("\"")){
					s = s.replaceAll("^\"|\"$", "");
					commandsNdata=commandsNdata+"-"+s+"_";
					
					
				}
				else{
					
					if(namkaran.containsKey(s)){
						commandsNdata=  commandsNdata+  namkaran.get(s);
					}
					else{
						commandsNdata= commandsNdata+ "#" + s+"#";
					}
					
				}
				
				
			}
			
			
			
		
			
		}//----------------------------------------------------while method ends---------------------------------
	 
		
		for(Entry<String, String> e: q.entrySet()){
			commandsNdata=commandsNdata.replaceAll("#"+e.getKey()+"#",  e.getValue());
		}
		
		String arr1[]=commandsNdata.split("_");
		
		for(int i=0;i<arr1.length;i++){
			String ar[]=arr1[i].split("-");
			iffer(ar[0], ar[1]);
		}
 
		
	}
	
	
	

	
	
	
	public  static void iffer(String s,String data){
		
		
		
			int i=s.length()-1;
			String string= s;
			while(i>=0){
			switch (string.charAt(i)){
			
			case 'P' :
	            System.out.println(data);
	            break;
	       
	         case 'R' :
	        	data= new StringBuilder(data).reverse().toString();
	           
	         case 'U' :
	        	 data= data.toUpperCase();
	            break;
	         case 'L' :
	        	 data= data.toLowerCase();
	            break;
	         case 'A' :
		          data=data+"a";
		            break;
		       default:
		    	   break;
	           
			
			
			}
			i--;
			
			}
			
			
			
			
		
			
			
			
			
			
			
		
		
	}

/*	public  void print(String s){
		System.out.println(s);
		
	}
	
	
	
public  String reverse(String s){
	s= new StringBuilder(s).reverse().toString();
return s;
	}

public  String toUpper(String s){
	return s.toUpperCase();
	
}
public  String toLower(String s){
	return s.toLowerCase();
}
public  String append_a(String s){
	return s+"a";
}*/
	
}
