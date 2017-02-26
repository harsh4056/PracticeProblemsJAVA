package testing123;

import java.util.Scanner;

public class Replacer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		
		for(int i=1;i<=T;i++){
			
			String lnt= scanner.next();
			String s=lnt.replace('0', '5');
            System.out.println(s);

	}}

}
