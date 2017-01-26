package collections;

import java.util.*;

public class AllColl {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		System.out.println(list.contains(3));
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(3);
		q.add(2);
		q.add(1);
		System.out.println(q.poll());
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(7);
		System.out.println(linkedList.poll());
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(2);
		System.out.println(set.remove(3));
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(2);
		System.out.println(treeSet.pollFirst());
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Two", 2);
		treeMap.put("Three", 3);
		treeMap.put("One", 1);
		treeMap.put("One", treeMap.getOrDefault("One", 0)+1);
		System.out.println(treeMap.pollFirstEntry());
		for(String key : treeMap.keySet()) {
			//key
			treeMap.get(key);
		}
		
		
		Integer.parseInt("123");
		
		for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		
		String s1 = "Hi";
		String s2 = s1;
		String s3 = "Hi";
		System.out.println(s2=="Hi");
		String s4 = new String();
		
		StringBuilder sb = new StringBuilder("Prash");
		
	}
}
