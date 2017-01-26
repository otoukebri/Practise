package hackerrank;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AsteriskExpressions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<t; i++) {
			String s = sc.nextLine();
			if(s.startsWith("*") || s.endsWith("*") || s.contains("***")) {
                System.out.println("Syntax Error");
            }
            else {
                int value = evaluate(s);
                System.out.println(value>0?value:"Syntax Error");
            }
		}
	}

	private static int evaluate(String s) {
		Queue<String> queue = new LinkedList<String>();
		String small = new String();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 42) {
				if(small.contains("*") && small.length() < 2) {
					small += "*";
				}
				else if(small.length() == 0) {
					small = "*";
				}
				else {
					queue.add(small);
					small = "*";
				}
			}
			else {
				if(small.contains("*")) {
					queue.add(small);
					small = "" +c;
				}
				else if(small.length() > 0) {
					small += c;
				}
				else {
					small = "" +c;
				}
			}
			
			if(i == s.length()-1) {
				queue.add(small);
			}
		}
		
		queue.add("+");
		BigInteger mid = BigInteger.valueOf(-1);
		
		while(!queue.peek().equals("+")) {
			String prev = queue.poll();
			if(prev == null) {
				return 0;
			}
			else if(prev.equals("**")) {
				if(mid == BigInteger.valueOf(-1)) {
					return 0;
				}
				else if(queue.peek().equals("+")){
					return 0;
				}
				else {
					String cur = queue.poll();
					if(cur == null) {
						return 0;
					}
					else {
						mid = mid.modPow(new BigInteger(cur), new BigInteger("1000000007"));
					}
				}
			}
			else if(prev.equals("*")) {
				if(mid == BigInteger.valueOf(-1)) {
					return 0;
				}
				else {
					queue.add("" +mid);
					mid = BigInteger.valueOf(-1);
					queue.add(prev);
				}
			}
			else {
				if(queue.peek().equals("+")) {
					queue.add(prev);
				}
				else {
					String cur = queue.poll();
					if(cur.equals("*")) {
						queue.add(prev);
						queue.add(cur);
					}
					else if(cur.equals("**")){
						if(queue.peek().equals("+")) {
							return 0;
						}
						else {
							String next = queue.poll();
							if(next == null) {
								return 0;
							}
							else {
								mid = new BigInteger(prev).modPow(new BigInteger(next), new BigInteger("1000000007"));
								if(queue.peek().equals("+")) {
									queue.add("" +mid);
								}
							}
						}
					}
					else {
						return 0;
					}
				}
				
			}
		}
		
		queue.remove();
		
		int value = -1;
		
		while(!queue.isEmpty()) {
			String prev = queue.poll();
			if(prev.equals("*")) {
				String cur = queue.poll();
				if(cur == null || value == -1) {
					return 0;
				}
				else {
					value = (int) ((value % (Math.pow(10, 9) + 7)) * ((new BigInteger(cur)).mod(new BigInteger("1000000007")).intValue()));
				}
			}
			else {
				value = (new BigInteger(prev)).mod(new BigInteger("1000000007")).intValue();
			}
		}
		
		return value;
	}

}
