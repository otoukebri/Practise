package sample1;

import java.util.*;

public class sample13 {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		
		Iterator<Integer> i = n.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
			break;
			
		}
		System.out.println(n);
	}

}