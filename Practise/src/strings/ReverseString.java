package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(reverseRec(str));
		System.out.println(reverseLoop(str));	
		
	}

	private static String reverseRec(String str) {
		if(str == null || str.length() <= 1)
			return str;
		else
			return reverseRec(str.substring(1)) +str.charAt(0);
	}
	
	private static String reverseLoop(String str) {
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