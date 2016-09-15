package sorting;

public class MergeSort {
	static int a[] = {5, 31, 25, 62, 16, 2, 7, 44, 29};
	static int temp[];
	public static void main(String args[]) {
		temp = new int[a.length];
		sort(0, a.length-1);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}
	
	private static void sort(int left, int right) {
		if(left < right) {
			int mid = left + ((right - left) / 2);
			sort(left, mid);
			sort(mid+1, right);
			merge(left, mid, right);
		}
	}

	private static void merge(int i, int j, int l) {
		int k = j+1;
		
		for(int x=i; x<=l; x++) {
			temp[x] = a[x];
		}
		
		for(int x=i; x<=l; x++) {
			if(i > j) a[x] = temp[k++];
			else if(k > l) a[x] = temp[i++];
			else if(temp[i] <= temp[k]) a[x] = temp[i++];
			else a[x] = temp[k++];
		}
	}
}