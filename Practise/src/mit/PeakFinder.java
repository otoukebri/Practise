package mit;

public class PeakFinder {
	static int peak;
	public static void main(String[] args) {
		int arr[] = {5, 2, 6, 1, 3, 7, 4};
		peak(arr, 0, arr.length-1);
	}

	private static void peak(int[] arr, int i, int j) {
		int n = i + ((j - i) / 2);
		if(arr[n] < arr[n-1])	peak(arr, i, n-1);
		else if(arr[n] < arr[n+1])	peak(arr, n+1, j);
		else peak = arr[n];
	}
}