package hackerrank;

import java.awt.Point;
import java.util.Scanner;

public class SymmetricPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            Point p1 = new Point(sc.nextInt(), sc.nextInt());
            Point p2 = new Point(sc.nextInt(), sc.nextInt());
            System.out.println(p2.x-p1.x+p2.x +" " +(p2.y-p1.y+p2.y));
        }
	}

}
