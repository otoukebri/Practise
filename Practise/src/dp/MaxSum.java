package dp;

import java.util.Scanner;

//Project Euler #149: Searching for a maximum-sum subsequence.
//Sample input:
//8
//4
//81 -89 45 6
//3 2 2 1 0
//3
//-78 -45 54
//1 0 0 1 2

public class MaxSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n = 3000;
		int l = sc.nextInt();
		
		int a[] = new int[l];
		for(int i=0; i<l; i++) {
			a[i] = sc.nextInt();
		}
		
		int f[] = new int[n*n];
		for(int i=0; i<5; i++) {
			f[i] = sc.nextInt();
		}
		for(int i=5; i<(n*n); i++) {
			f[i] = (f[i-1] + f[i-2] + f[i-3] + f[i-4] + f[i-5]) % l;
		}
		
		int m = sc.nextInt();
		
		int b[] = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		
		int g[] = new int[n*n];
		for(int i=0; i<5; i++) {
			g[i] = sc.nextInt();
		}
		for(int i=5; i<(n*n); i++) {
			g[i] = (g[i-1] + g[i-2] + g[i-3] + g[i-4] + g[i-5]) % m;
		}
		
		sc.close();
		
		int s = 0;
		int matrix[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = a[f[s]] + b[g[s]];
				s++;
			}
		}
		
		//int matrix[][] = {{-2, 5, 3, 2},{9, -6, 5, 1},{3, 2, 7, 3},{-1, 8, -4, 8}};
		CalcMax calMax = new CalcMax(matrix);
		calMax.mainMatrix();
	}
}

class CalcMax {
	int[][] matrix;
	
	CalcMax(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void mainMatrix() {
		int max = Integer.MIN_VALUE;
		for(int ij=0; ij<matrix.length; ij++) {
			max = maximum(max, subMatrix(ij));
			System.out.printf("Max in sub matrix %d is %d %n", ij, max);
		}
	}

	public int subMatrix(int sub) {
		int max = Integer.MIN_VALUE;
		
		int i=sub, j=0;
		while(j<=sub) {
			max = maximum(max, allMax(i, j++));
		}
		
		i=0; j=sub;
		while(i<sub) {
			max = maximum(max, allMax(i++, j));
		}
		
		return max;
	}
	
	private int allMax(int i, int j) {
		int max = Integer.MIN_VALUE;
		max = maximum(max, horizontal(i, j));
		max = maximum(max, vertical(i, j));
		max = maximum(max, diagonal(i, j));
		max = maximum(max, antiDiagonal(i, j));
		return max;
	}
	
	private int horizontal(int i, int j) {
		int max = matrix[i][j];
		int sum = max;
		while(j > 0) {
			sum += matrix[i][--j];
			max = maximum(max, sum);
		}
		return max;
	}
	
	private int vertical(int i, int j) {
		int max = matrix[i][j];
		int sum = max;
		while(i > 0) {
			sum += matrix[--i][j];
			max = maximum(max, sum);
		}
		return max;
	}
	
	private int diagonal(int i, int j) {
		int max = matrix[i][j];
		int sum = max;
		while(i>0 && j>0) {
			sum += matrix[--i][--j];
			max = maximum(max, sum);
		}
		return max;
	}
	
	private int antiDiagonal(int tempI, int tempJ) {
		int i = tempI, j = tempJ;
		int max = matrix[i][j];
		int sum = max;
		
		if(i>j) {
			while(i>0 && j<tempI) {
				sum += matrix[--i][++j];
				max = maximum(max, sum);
			}
		}
		else {
			while(i<tempJ && j>0) {
				sum += matrix[++i][--j];
				max = maximum(max, sum);
			}
		}
		
		return max;
	}
	
	private int maximum(int x, int y) {
		return x>y?x:y;
	}
}