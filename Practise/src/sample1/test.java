package sample1;

public class test {
	public static void main(String args[]) {
		int a = 0, b = 0x6;
		System.out.println(~b);
		
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(-7));
		System.out.println(Integer.parseInt("01111111111111111111111111111001", 2));
		
		int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
	}
}
