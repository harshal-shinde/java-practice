package dataStructure.heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class FirstKelements {
	
	public static void firstk(int arr[], int size, int k) {
		//Creating min heap for given
		//array with only k elements
		//Create min heap with priority queue
		
		PriorityQueue<Object> minHeap = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			minHeap.add(arr[i]);
		}
		
		//Loop for each element in array
		//After the kth element
		
		for(int i =k; i<size; i++) {
			/**
			 * if the current element is smaller
			 * than minimum element , do nothing 
			 * and continue to next element
			 */
			
			int firstElement = (int) minHeap.peek();
			if( firstElement > arr[i]) {
				continue;
			} else {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		
		/**
		 * Now min heap contains k maximum
		 * Elements, iterate to print
		 */
		
		Iterator<Object> iterator = minHeap.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " "); 
		}
	}
	
	//Driver code
	public static void main(String[] args) {
		int arr[] = {11, 3, 2, 1, 15, 5,4, 45,88,96,50,45};
		
		int size = arr.length;
		int k =3;
		
		firstk(arr, size, k);
		
	}

}
