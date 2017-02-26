package testing123;

public class Reverse_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Reverse(1146467285));
	}

	
	public static int Reverse(int a) {
		int b=a;
		if(b<0)
			b=b*-1;
		
		String s=""+b;
		String revs=	new StringBuilder(s).reverse().toString();
	
		
		
		long var=0;
		long ten=1;
		for(int i=revs.length()-1;i>=0;i--)
		{
			var=var+ten*(Integer.parseInt(revs.charAt(i)+""));
			ten=ten*10;
		}
		if(a<0)
			var= -1*var;
		
		
		if(var<-2147483648)
			return 0;
		if(var>2147483647)
			return 0;
	
		
		
		
		
		
		
		return (int)var;
		
		
		
	
	}
}
