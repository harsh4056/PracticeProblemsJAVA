package stringss;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Add_Strings {
	public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long n1 =Integer.parseInt(br.readLine());
            long n2=Integer.parseInt(br.readLine());
            
            System.out.println(n1+n2);
        }
        

     
    }
}
