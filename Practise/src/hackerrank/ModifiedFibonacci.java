package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(t1 +" " +t2 +" " +n);
        BigInteger sum = BigInteger.valueOf(t1).add(BigInteger.valueOf(t2).pow(2));
        BigInteger prev = BigInteger.valueOf(t2);
        
        for(int i=3; i<n; i++) {
        	BigInteger temp = sum;
            sum = prev.add(sum.pow(2));
            prev = temp;
        }
        System.out.println(sum);
	}
}
