package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class SmallRiskTrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double[] p = new double[n];
		double[] x = new double[n];
		double[] profit = new double[n];
		
		for(int i=0; i<n; i++) {
			p[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			double y = sc.nextDouble();
			double pi = p[i];
			profit[i] = (pi * x[i]) - ((1 - pi) * y);
		}
		
		sc.close();
		Arrays.sort(profit);
		double maxProfit = 0;
		
		for(int i=n-1; i>=(n-k); i--) {
			double next = profit[i];
			maxProfit = Math.max(maxProfit, Math.max(maxProfit + next, next));
		}
		
		System.out.printf("%.2f", maxProfit);
	}
}
