package codestorywithMIK.twopointers;

import java.util.StringTokenizer;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str =  "Ram     is    a     good            boy!";
		StringTokenizer st = new StringTokenizer(str, "s+ ");
		System.out.println(st);
		
		String result = "";
		
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			result = nextToken + " " + result;
			System.out.println(nextToken);
		}
		
		System.out.println(result);
	}
	
}
