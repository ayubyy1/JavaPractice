package algorithms;

public class Sort {
	//Sorting method which sorts an array of integers from least to greatest
	//Runs at O(n^2)
	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		boolean swapped = false;
		int j;
		for(int i = 0; i < size - 2; i++) {
			swapped = false;
			for(j = 0; j < size - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		System.out.print("[ ");
		for(int i = 0;i < size; i++) {
			System.out.print(arr[i] + " ");
			}
		System.out.println("]");
	}
	
	//method to print out array
	public static void printArray(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	//method to swap two values in an array
	public static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp;
		temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
}
