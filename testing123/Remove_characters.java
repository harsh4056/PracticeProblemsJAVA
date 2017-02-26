package testing123;

import java.util.Scanner;

public class Remove_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			String s= scanner.next();
			String sNew="";
			for(int j= 0;j<s.length();j++){
				
				int t=(int)(s.charAt(j));
				if(!(t<=122&&t>=97||t>=65&&t<=90))
					sNew+=(s.charAt(j));
			
			}
			System.out.println(sNew);
		}

	}

}
