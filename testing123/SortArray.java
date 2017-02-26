package testing123;

public class SortArray 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a []={9,6,7,8,5,4,2,3,1,0};
	sort(a);
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	
	}
    public static void sort(int[] L) 
    {
        sort(L, 0, L.length - 1);
    }

    public static void sort(int[] L, int i, int j) 
    {
        if (L[j] < L[i]) 
        {
            int tmp = L[i];
            L[i] = L[j];
            L[j] = tmp;
        }

        if (j - i > 1) 
        {
        	
        	int t = (j - i + 1) / 3;
        	sort(L, i, j - t);
        	sort(L, i + t, j);
        	sort(L, i, j - t);
            // *********************
            // What's the code here?
            // *********************
        }
    }
}