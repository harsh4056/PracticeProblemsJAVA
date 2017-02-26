package testing123;

public class Bug_01 {

	public static void main(String[] args) {
		
		System.out.println(isPrime(49));
		
	}
	
	
	
		public static int isPrime(int A) {
			int upperLimit = (int)(Math.sqrt(A));
			for (int i = 2; i <= upperLimit; i++) {
				if (i < A && A % i == 0) return 0;
			}
			return 1;
		}
	}


