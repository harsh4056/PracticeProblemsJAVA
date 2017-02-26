package testing123;

public class Roman_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int romanToInt(String s) {
		int data=0;
		int i=s.length()-1;
		String string= s;
		while(i>=0){
		switch (string.charAt(i)){
		
		case 'M' :
           data=data+1000;
            break;
       
         case 'D' :
        	data=data+500;
           
         case 'C' :
        	 data= data+100;
            break;
         case 'L' :
        	 data= data+50;
            break;
         case 'X' :
	          data=data+10;
         case 'V' :
	          data=data+5;
         case 'I' :
	          data=data+1;
	            break;
	       default:
	    	   break;
		}
		
		
		
		i--;}
		
		return 0;
	}
}
