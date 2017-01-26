package sorting;

public class Shell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 45, 52, 23, 2, 46, 98, 17, 1, 9};
		a = sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}
	
	public static int[] sort(int[] a) {
		int h = 1;
		int n = a.length;
		
		while(h < n/3)
			h = 3*h + 1;
		
		while(h >= 1) {
			for(int i=0; i+h<n; i++) {
				int k = i+h;
				while(k-h >=0 && a[k] < a[k-h]) {
					int temp = a[k];
					a[k] = a[k-h];
					a[k-h] = temp;
					k -= h;
				}
			}
			h = h/3;
		}
		
		return a;
	}

}
