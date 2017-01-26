package stacks;

import java.util.Stack;

public class Locks {

	public static void main(String[] args) {
		String[] a = {"ACQUIRE 364","ACQUIRE 364", "ACQUIRE 365", "RELEASE 365"};
		System.out.println(check_log_history(a));
	}

	static int check_log_history(String[] events) {
		int len = events.length;
		Stack<String> acquired = new Stack<String>();
		
		for(int i=0; i<len; i++) {
			String curLock = events[i];
			if(curLock.contains("ACQUIRE")) {
				if(acquired.contains(curLock.split(" ")[1]))
					return i+1;
				acquired.push(curLock.split(" ")[1]);
			}
			else {
				if(!curLock.split(" ")[1].equals(acquired.pop())) {
					return i+1;
				}
			}
		}

		if(acquired.isEmpty())
			return 0;
		else
			return len+1;
	}
}
