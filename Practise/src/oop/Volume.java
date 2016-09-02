package oop;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

public class Volume {
	 public static void main(String[] args) throws IOException {
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   }
	  }
}

class Calculate {
	Output output = new Output();
	//Scanner sc = new Scanner(System.in);
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	static CalcVol calcVol = new CalcVol();
	public int get_int_val() throws NumberFormatException, IOException {
		int input = Integer.parseInt(sc.readLine());
		if(input <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}
		return input;
	}

	public double get_double_val() throws NumberFormatException, IOException {
		double input = Double.parseDouble(sc.readLine());
		if(input <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}
		return input;
	}

	public static CalcVol do_calc() {
		return calcVol;
	}
}

class CalcVol {
	double get_volume(int a) {
		return Math.pow(a, 3);
	}

	public double get_volume(double r, double h) {
		return Math.PI*Math.pow(r, 2)*h;
	}

	public double get_volume(double r) {
		double d = Math.PI*Math.pow(r, 3)*(2/(double)3);//Double.parseDouble(new BigDecimal(2/3).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(Math.pow(r, 3))).toString());
		System.out.println(d);
		return (2/3)*Math.PI*r;
	}

	public double get_volume(int l, int b, int h) {
		return l*b*h;
	}
}

class Output {
	public void display(double volume) {
		System.out.printf("%.3f", volume);
	}
}