package collections;

import java.util.*;

public class sample1 {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(2);
		s.add(1);
		s.add(1);
		System.out.println(new TreeSet<Integer>(s));
		s.stream().filter(p -> p.equals(1))
		.forEach(p -> System.out.println(p));
		System.out.println(s.size());
		TreeSet t = new TreeSet(s);
		NavigableSet<Integer> n = t.descendingSet();
		System.out.println(n);
	}

}