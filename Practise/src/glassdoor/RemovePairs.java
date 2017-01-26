package glassdoor;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemovePairs {

	public static void main(String[] args) {
		String s = "abcAdbBeCa";
		StringBuilder finalS = new StringBuilder();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<s.length(); i++) {
			int c = s.charAt(i) > 96 ? s.charAt(i) - 32 : s.charAt(i);
			if(set.contains(c)) {
				set.remove(c);
			}
			else if(set.contains(c + 32)) {
				set.remove(c + 32);
			}
			else {
				set.add((int)s.charAt(i));
			}
		}
		for(int i : set) {
			finalS.append((char)i);
		}
		System.out.println(finalS.toString());
	}
}