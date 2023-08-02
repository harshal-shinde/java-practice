package coding;

/**
 * This coding question ask for amazon
 * @author admin
 *
 */
public class MinMovesLeft {
	
	static int findMinMoves(int arr[], int n) {
		System.out.println("Number of elements are = "+ n);
		
		int noOfOnes [] = new int[n];
		int  i, count = 0;
		
		//count number of zeros
		//on right side of every one
		
		noOfOnes[n-1]  = arr[n-1];
		
		System.out.println("Value of noOfOnes["+(n-1)+"] = " + noOfOnes[n-1]);
		
		for(i = n-2; i>=0; i--) {
//			System.out.println("Value of i = " + i);
			noOfOnes[i] = noOfOnes[i+1];
			
			System.out.println("noOfOnes["+i+"]   = " + noOfOnes[i+1]);
			if(arr[i] == 1) {
				noOfOnes[i]++;
			}
		}
		
		//count total number of swaps by adding number
		//of zeros on right side of every one
		
		for(i=0; i <n ; i ++) {
			if(arr[i] == 0) {
				count += noOfOnes[i];
				System.out.printf("count = %d, noOfOnes["+i +"]= %d \n" , count, noOfOnes[i]);
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
//		int arr[]  = {1, 1,  1, 1, 0, 1, 0, 1};
//		int arr[] = { 0, 0, 1, 0, 1, 0, 1, 1 };
//		int arr[] = { 1, 1, 1, 1, 0, 0, 0, 0 };
//		int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1 };
		int arr[] = { 1, 0, 1, 1, 0, 1, 0, 1 };
		System.out.println(findMinMoves(arr, arr.length));
	}

}
