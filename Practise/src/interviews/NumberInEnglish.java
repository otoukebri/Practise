package interviews;

import java.util.Scanner;

public class NumberInEnglish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(numberInEnglish(input));
	}
	
	private static String numberInEnglish(int input) {
		
		if(input < 0 || input > 100)
			return "Invalid input";
		
		String eng = "";
		String[] onesPlace = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String[] tensPlace = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] tens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		
		if(input == 0) eng = "Zero";
		else if(input == 100) eng = "Hundered";
		else if(input >=10 && input <20) eng = tens[input%10];
		else {
			int n = input, pos = 1;
			while(n > 0) {
				int rem = n % 10;
				n = n / 10;
				if(pos == 1 && rem != 0) {
					eng = onesPlace[rem-1];
				}
				else if(pos == 2) {
					eng = tensPlace[rem-2] +" " +eng;
				}
				pos++;
			}
		}
		return eng;
	}

}
