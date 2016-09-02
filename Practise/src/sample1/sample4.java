package sample1;

import java.util.Scanner;

public class sample4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for(int i=0; i<tests; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int sum = a;
			for(int j=0; j<n; j++) {
				sum += Math.pow(2, j) * b;
				System.out.print(sum +" ");
			}
			System.out.println();
		}
	}
}