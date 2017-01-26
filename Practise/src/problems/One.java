package problems;

import java.util.*;

public class One {

	public static void main(String[] args) {
		String str1 = "thought";
		String str2 = "sloughs";
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(str2.contains("" +c)) {
				str1.replaceFirst("" +c, "");
				str2.replaceFirst("" +c, "");
			}
		}
		Stack<String> stack = new Stack<>();
		stack.pop();
	}

}
