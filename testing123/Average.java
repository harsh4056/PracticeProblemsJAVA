package testing123;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			int StudNo= scanner.nextInt();
			String [] names= new String[StudNo];
			int marks[]= new int[StudNo];
			for(int j=0;j<StudNo;j++){
				names[j]=scanner.next();
				int t=3;
				while(t--!=0){
					int buffer=scanner.nextInt();
				marks[j]= marks[j]+buffer;
				}
				marks[j]=marks[j]/3;
			}
			int max=marks[0];
			int index =0;
		for(int k=0;k<StudNo;k++){
			if(marks[k]>max){
				max=marks[k];
				index=k;
			}
			
		}
			System.out.println(names[index]+" "+ marks[index]);
		}

	}

}
