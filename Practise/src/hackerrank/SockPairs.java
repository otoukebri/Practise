package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class SockPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < n; i++){
            int next = in.nextInt();
            map.put(next, map.getOrDefault(next, 0) + 1);
        }
        int count = 0;
		for(int val : map.values()) {
			count += (val/2);
		}
        System.out.println(count);
	}

}
