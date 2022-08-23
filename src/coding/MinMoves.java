package coding;

public class MinMoves {
	
	static int findMinMoves(int arr[], int n) {
		System.out.println("Number of elements are = "+ n);
		
		int noOfZeros [] = new int[n];
		int  i, count = 0;
		
		//count number of zeros
		//on right side of every one
		
		noOfZeros[n-1]  = 1 - arr[n-1];
		
		System.out.println("Value of noOfZeros[n-1] = " + noOfZeros[n-1]);
		
		for(i = n-2; i>=0; i--) {
			System.out.println("Value of i = " + i);
			noOfZeros[i] = noOfZeros[i+1];
			
			System.out.println("noOfZeros[i]   = " + noOfZeros[i+1]);
			if(arr[i] == 0) {
				noOfZeros[i]++;
			}
		}
		for (int zeros : noOfZeros)
		System.out.println("Number of zero = " + zeros);
		
		//count total number of swaps by adding number
		//of zeros on right side of every one
		
		for(i=0; i <n ; i ++) {
			if(arr[i] == 1) {
				count += noOfZeros[i];
				System.out.printf("count = %d, noOfZeros[i]= %d \n" , count, noOfZeros[i]);
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
//		int arr[]  = {1, 1,  1, 1, 0, 1, 0, 1};
//		int arr[] = { 0, 0, 1, 0, 1, 0, 1, 1 };
//		int arr[] = { 1, 1, 1, 1, 0, 0, 0, 0 };
		int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1 };
		System.out.println(findMinMoves(arr, arr.length));
	}

}
