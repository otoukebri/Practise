package hackerrank;

import java.util.Scanner;
import java.util.stream.Stream;

public class MaxStringAltChars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
	}

	public static String removeConsecutiveChars(String s) {
		char c = s.charAt(0);
		boolean bool = false;
		for(int i=1; i<s.length(); i++) {
			if(c == s.charAt(i)) {
				bool = true;
				break;
			}
			c = s.charAt(i);
		}
		if(bool) {
			s = removeOneChar(s.replaceAll(c +"", ""));
			s = removeConsecutiveChars(s);
		}
		return s;
	}

	private static String removeOneChar(String s) {
		return null;
	}
}
