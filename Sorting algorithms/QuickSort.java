/*
 * This function takes last element as pivot, places the pivot element at its correct 
 * position in sorted array, and places all smaller ( smaller than pivot) to left
 *  of pivot and all greater elements to right of pivot
 */

public class QuickSort {

	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++)

			if (arr[j] <= pivot) {
				i++;

				// Swap arr[i] with arr[j]

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		// swap arr[i+1] with arr[high]

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements Quicksort arr[]--> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */

	void sort(int arr[], int low, int high) {

		if (low < high) {
			/*
			 * pi is partitioning index ,arr[pi] is now at right place
			 * 
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before and after partition

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}

	}

	// A utility function to print an array of size n

	static void printArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);
		System.out.println(" ----------- Sorted array ---------- ");
		printArray(arr);

	}

}

/*
  OUTPUT :  
  ----------- Sorted array ---------- 
              
              1 5 7 8 9 10 
 */

