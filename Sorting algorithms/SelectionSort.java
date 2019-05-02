	
// Selection sort

public class SelectionSort {


	void sort(int[] arr) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {

			// Find the minimum element in unsorted array
			int min_index = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_index])
					min_index = j;

			// Swap the found minimum element with the first element
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	// Prints the array
	void printArray(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSort sort = new SelectionSort();
		int[] arr = { 64, 25, 12, 22, 11, 43, 3, 5, 45, 23, 12 };
		sort.sort(arr);
		System.out.println("Sorted array");
		sort.printArray(arr);
	}

}

/*
 OUTPUT: 
 Sorted array
3 5 11 12 12 22 23 25 43 45 64 
 */
