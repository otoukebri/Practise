package sample1;

public class sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		a[5]=1234;
		int b[] = a;
		b[5] = 5678;
		System.out.println(a[5] +" " +b[5]);
		
	}
}