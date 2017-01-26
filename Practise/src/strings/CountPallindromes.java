package strings;

public class CountPallindromes {

	public static void main(String[] args) {
		System.out.println(countPallindromes("hellolle"));
	}

	private static int countPallindromes(String S) {
		int len = S.length(), count = 0;
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				String temp = S.substring(i, j+1);
				if(temp.equals(reverse(temp)))
					count++;
			}
		}
		return count;
	}
	
	private static String reverse(String str) {
		int len = str.length();
		char chars[] = str.toCharArray();
		for(int i=0; i<len/2; i++) {
			char temp = chars[i];
			chars[i] = chars[len-i-1];
			chars[len-i-1] = temp;
		}
		return new String(chars);
	}
}