
// Bubble sort 

public class BubbleSort {

	void sortBubble(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort sort = new BubbleSort();
		int[] arr = { 32, 54, 7, 23, 0, 43, 2 };
		sort.sortBubble(arr);

		System.out.println("********** Print the sorted array ! ******************");
		System.out.println();

		sort.printArray(arr);
	}

}

/*
  OUTPUT: 
 ********** Print the sorted array ! ******************
 
			  0 2 7 23 32 43 54 
 */
