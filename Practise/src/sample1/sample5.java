package sample1;

import java.util.Scanner;

public class sample5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(sc.hasNextLine()) {
			System.out.println(++i +" " +sc.nextLine());
		}
	}
}
