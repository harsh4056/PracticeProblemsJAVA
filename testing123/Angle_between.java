package testing123;

import java.util.Scanner;

public class Angle_between {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T=scanner.nextInt();
		for(int i=1;i<=T;i++){
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			
			if(x==12)
				x=0;
			double res=(5.5 *y)-(30*x);
			res=((Math.sqrt(Math.pow(res, 2))));
			if(y==60)
				res=res+30;
			if(res>180)
				res=360-res;
			
			if(x==12 &&y==60)
				res=0;
			
			System.out.println ((int)(Math.floor(res)));
			
			
			
			
		}

	}

}
