package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 5,8, 21, 45};
		int[] sortedNumbers = {1, 5, 12, 17, 21, 28, 33, 41, 45, 52, 59, 60, 75, 78, 83, 86, 91, 94, 99};
		
		//Call Linear Search Function
		/*int position = algorithms.search.linearSearch(numbers, 45);
		if(position == -1)
			System.out.println("Number not found.");
		else
			System.out.println("Number found at position " + position + ".");
		
		//Call Binary Search Function	
		int index = algorithms.search.binarySearch(sortedNumbers, 94, 0, sortedNumbers.length-1);
		
		if(index == -1)
			System.out.println("Number not found.");
		else 
			System.out.println("Found at position " + index + ".");*/
		
		//Call Bubble Sort Function
		algorithms.Sort.bubbleSort(numbers);
	}

}
