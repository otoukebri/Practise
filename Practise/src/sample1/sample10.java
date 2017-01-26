package sample1;

public class sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3};
		System.out.println(a[2]);
		sample10 s10 = new sample10();
		s10.arrayTest(a);
		System.out.println(a[2]);
	}
	
	private void arrayTest(int[] b) {
		b[2] = 4;
		System.out.println(b[2]);
	}
}