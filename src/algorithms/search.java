package algorithms;

public class search {

	public static int linearSearch(int[] dataSet, int target) {
		int counter = 0;
		for(int i = 0; i < dataSet.length; i++) {
			if(dataSet[i] == target)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		int midpoint = (start+end)/2;
		int value = dataSet[midpoint];
		System.out.println("Midpoint: " + midpoint + "\nValue: " + value + "\nStart: " + start + "\nEnd: " + end);
		while(start<=end) {
			if(value < target) {
				System.out.println(value + "<" + target);
				return binarySearch(dataSet,target,midpoint+1,end);
			}
			else if(value > target){
				System.out.println(value + ">" + target);
				return binarySearch(dataSet,target,start,midpoint-1);
			}
			else
				return midpoint;
		}
		return -1;
	
		
	}
	
}
