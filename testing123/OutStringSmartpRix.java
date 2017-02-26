package testing123;

import java.util.ArrayList;
import java.util.List;

public class OutStringSmartpRix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a=someCoolFunction("[ab][bc][ca]", "[", "]");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

	
	public static String[] someCoolFunction(String str, String open, String close) {
	    if (str == null || open == null || close == null) {
	        return null;
	    }
	    int strLen = str.length();
	    if (strLen == 0) {
	        return null;
	    }
	    int closeLen = close.length();
	    int openLen = open.length();
	    List list = new ArrayList();
	    int pos = 0;
	    while (pos < (strLen - closeLen)) {
	        int start = str.indexOf(open, pos);
	        if (start < 0) {
	            break;
	        }
	        start += openLen;
	        int end = str.indexOf(close, start);
	        if (end < 0) {
	            break;
	        }
	        list.add(str.substring(start+1, end));
	        pos = end + closeLen;
	    }
	    if (list.isEmpty()) {
	        return null;
	    } 
	    return (String[]) list.toArray(new String [list.size()]);
	}
}
