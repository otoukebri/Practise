package sample1;

import java.util.HashMap;

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
        
        float f = (float) (10.1 / 0.123);
        System.out.println(f);
        
        String s = "aaaaAaaBafgsagsdCa";
        System.out.println(s.split("[A-Z]").length);
        boolean aa[] = new boolean[20];
        System.out.println(aa[19]);
        s.chars().distinct().count();
	}
}
