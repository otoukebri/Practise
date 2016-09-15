package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {5, 31, 25, 62, 16, 2, 7, 29};
		sort(a, 0, a.length-1);
		display(a);
	}

	private static void sort(int[] a, int left, int right) {
		if(left < right) {
			int pivot = partition(a, left, right);
			sort(a, left, pivot-1);
			sort(a, pivot+1, right);
		}
	}

	private static int partition(int[] a, int left, int right) {
		int pivot = right; int swap = left;
		for(int i=left; i<right; i++) {
			if(a[i] < a[pivot]) {
				swap(a, i, swap);
				swap++;
			}
		}
		swap(a, pivot, swap);
		return swap;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void display(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] +" ");
		System.out.println();
	}
}

//for(int i=right; i>left; i--) {
//if((a[i] < a[pivot] && pivot < i) || (a[i] > a[pivot] && pivot > i)) {
//	int temp = a[pivot];
//	a[pivot] = a[i];
//	a[i] = temp;
//	pivot = i;
//}
//}
//System.out.println(a[pivot] +" " +pivot);