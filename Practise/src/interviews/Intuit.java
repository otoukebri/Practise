package interviews;

import java.util.Scanner;

public class Intuit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		if(input % 2 == 0)
			System.out.println("Input is not an odd number");
		else
			printFormat(input);
	}

	private static void printFormat(int input) {
		String x = "X";
		String o = "O";
		
		//first loop is for number of rows
		//second loop is for number of columns
		
		for(int row=1; row<=input; row++) {
			for(int col=1; col<=input; col++) {
				if((row == col) || (input+1-col == row)) {
					System.out.print(x);
				}
				else {
					System.out.print(o);
				}
			}
			System.out.println();
		}
		
	}
}
