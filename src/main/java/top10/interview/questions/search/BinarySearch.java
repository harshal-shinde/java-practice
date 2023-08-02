package top10.interview.questions.search;

class BinarySearch {

	int binarySearch(int arr[], int left, int right, int x) {
		
		if(right >= left) {
			int mid = left + (right - left) /2;
			if(arr[mid] ==x) {
			return mid;
		}
	
		if(arr[mid] > x) {
			return binarySearch(arr, left, mid -1, x);
		}
			return binarySearch(arr, mid +1, right, x);
		}
		return -1;
	}//end of binary search

	public static void main (String args[]) {
		
		BinarySearch ob = new BinarySearch();
		int arr[] = {2, 3, 4, 10, 40};
		int size = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, size -1, x);
		
		if(result == -1) {
			System.out.println("Element is not present");
		}else {
			System.out.println("Element is present");
		}
	}
}
