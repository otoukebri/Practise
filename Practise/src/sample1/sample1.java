package sample1;

public class sample1 {

	public static void main(String[] args) {
		System.out.println(shortPlain("abacaba"));
	}
	
	public static int shortPlain(String s) {
		char[] pal = s.toCharArray();
		return minPals(pal, 0, pal.length-1);
	}
	
	public static int minPals(char[] pal, int start, int end) {
		
		if(start > end) {
			return Integer.MAX_VALUE;
		}
		if(start == end) {
			return 0;
		}
		if(start == end-1) {
			if (pal[start] == pal[end]) {
				return 0;
			}
			else {
				return 1;
			}
		}
	
		if(pal[start] == pal[end]) {
			return minPals(pal, start+1, end-1);
		}
		else {
			int one = minPals(pal, start, end-1);
			int two = minPals(pal, start+1, end);
			return minValue(one, two) + 1;
		}
		
	}
	
	public static int minValue(int a, int b) {
		if(a < b) {
			return a;
		}
		else {
			return b;
		}
	}

}
