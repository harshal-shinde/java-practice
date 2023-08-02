package dataStructure;

//Java implementation of recursive Binary Search
public class BinarySearch {
	//Returns index of x if it present in array[]
	
	int binarySearch(int arr[], int start, int end, int key) {
	System.out.println("Start = "+ start);
	System.out.println("End = "+ end);	
		
		if(end >= start) {
			int mid = (start + (end-1)) /2;
			System.out.println("mid = "+ mid);	
			
			//if the element is present at the middle itself
			if(arr[mid] == key) {
				return mid;
			}
			
			//If element is smaller than mid
			//It can only present in left sub array
			if(arr[mid] > key) 
				return binarySearch(arr, start, mid -1, key);
		
			return binarySearch(arr, mid+1, end, key);
		}	
		return -1;
	}
	
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = {2, 3, 4, 10, 40};
		int n = arr.length;
		int key = 455;
		int result = ob.binarySearch(arr, 0, n-1, key);
		if(result == -1) 
			System.out.println("Element is not presrent");
		else
			System.out.println("Element found at index = " + result);
	}
}
