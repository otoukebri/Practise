package sample1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;

public class sample7 {
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "javb";
		String a1 = "bvaj";
		System.out.println(a.substring(3,4));
		String website = "https://corporate.homedepot.com";
		System.out.println(website.replace("https://", "").replace("http://", "").replace("www.", ""));
		sample7 s = new sample7();
		System.out.println(s.i);
		
		char[] b = null;
		b = a.toCharArray();
		Arrays.sort(b);
		char[] b1 = null;
		b1 = a1.toCharArray();
		Arrays.sort(b1);
		System.out.println(Arrays.equals(b, b1));
		
		String g= "He is a very very good boy, isn't he?";
		System.out.println(g.replaceAll("[_'@]", " ").replaceAll("[!,?.]", ""));
		
		LinkedList<String> ll = new LinkedList<>();
		
		BigInteger bi1 = new BigInteger("1");
		BigInteger bi2 = new BigInteger("1");
		System.out.println(bi1.add(bi2));
		BigDecimal bd[] = new BigDecimal[10];
		for(int i=0;i<10;i++) {
            bd[i] = new BigDecimal("-10");
        }
		System.out.println(bd[6].compareTo(new BigDecimal("1")));
	}
}