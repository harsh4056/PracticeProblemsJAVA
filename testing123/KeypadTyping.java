package testing123;

import java.util.Scanner;

public class KeypadTyping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		String keypad[]= {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		for(int i=1;i<=T;i++){
			
			String s=scanner.next();
			
			s= s.toUpperCase();
			for(int j=0;j<s.length();j++){
				boolean found=false;
				int cnt=0;
				while(!found){
					if(keypad[cnt].contains(""+s.charAt(j))){
						found=true;
					}
					else cnt++;
				}
				System.out.print(cnt);
			}
			System.out.println();
			
			
			
		}

	}

}
