package codestorywithMIK.twopointers;

// leetcode : 345
public class ReverseVowelsInString {

	public static void main(String[] args) {
		String str = "hello";
		String ans = function(str);
		System.out.println(ans);
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public static String function(String s) {
		char[] chars = s.toCharArray();
		int n = chars.length;

		// Take two pointers
		int i = 0;
		int j = n - 1;
		while (i <= j) {
			if (!isVowel(chars[i])) {
				i++;
			}else if (!isVowel(chars[j])) {
				j--;
			}else {
				//swap
				char tmp = chars[i];
				chars[i] = chars[j];
				chars[j] = tmp;
				i++;
				j--;
			}
		}
		return new String(chars);
	}
}
