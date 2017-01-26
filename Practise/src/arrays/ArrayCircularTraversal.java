package arrays;
import java.util.*;

public class ArrayCircularTraversal {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		int start = 2;
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+start)%arr.length);
		}
		
		int i = start;
		do {
			System.out.println(i%arr.length);
			i++;
		} while(i%arr.length != start);
	}
}