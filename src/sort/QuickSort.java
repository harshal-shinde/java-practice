package sort;

public class QuickSort {

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition (int[] arr, int low, int high) {
		
		//pivot
		int pivot = arr[high];
		
		//index of smaller element and 
		//indicates the right position
		//of pivot found so far
		
		int i = (low -1);
		
		for(int j= low; j<=high-1;j++) {
			if(arr[j]< pivot) {
				i++;
				System.out.printf("Element swap " + arr[i]  + " with " + arr[j] + " And indexes are &f, %d \n"+ i, j );
				
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, high);
		
		return (i+1);
	}
	
	static void qsort(int [] arr, int low, int high) {
		if(low < high) {
			// pi is partitioning index , arr[p]
			//is now at right place
			
			int pi = partition(arr, low, high);
			
			//Separately sort elements
			qsort(arr, low, pi-1);
			qsort(arr, pi+1, high);
		}
		
	}
	
	//FUnction to print array
	static void printArray(int arr[], int size) {
		
		for (int i = 0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//Driver code
	
	public static void main(String[] args) {
		int arr[]= {10, 7, 8,9 , 1, 5};
		int n = arr.length;
		qsort(arr, 0, n-1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}
