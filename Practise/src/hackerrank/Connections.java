package hackerrank;

import java.util.*;

public class Connections {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int q = sc.nextInt();
	        HashMap<Integer, Integer> conn = new HashMap<Integer, Integer>();
	        for(int i=0; i<n; i++) {
	        	String line = sc.nextLine();
	        	if(line.charAt(0) == 'M') {
	        		int a = Integer.parseInt(line.split(" ")[1]);
	        		int b = Integer.parseInt(line.split(" ")[2]);
	        		int max = conn.getOrDefault(a, 0)>conn.getOrDefault(b, 0)?conn.getOrDefault(a, 0):conn.getOrDefault(b, 0);
	        		conn.put(a, max+1);
	        		conn.put(b, max+1);
	        	}
	        	else {
	        		int a = Integer.parseInt(line.split(" ")[1]);
	        		System.out.println(conn.getOrDefault(a, 1));
	        	}
	        }
	}

}