package basic;

/**
 * Find Duplicates from array
 * For Example [1, 2, 2,4, 1, 3, 4, 5]
 * o/p = 1,2,4
 * @author Harshal Shinde (hashalsharadshinde@gmail.com)
 * 
 *
 */
public class Duplicates {
	static int[] getDuplicates(int[] arr) {
		int length = arr.length;
		if(length ==0) {
			return null;
		}
		int noOfCount [] = new  int[length];
		
		//Iterate to store counts for each number
		for(int i=0; i<length; i++)
			noOfCount[arr[i]]++;
		
		for(int i=0; i<length; i++) {
			if(noOfCount[i] > 1)
			System.out.printf("Count for position %d = %d \n",i , noOfCount[i]);
		}
		
		return null;
		
	}
	
	public static void main (String[] args) {
		int [] arr  = {1, 2, 2, 4, 1, 3, 4, 5};
		int [] duplicates = getDuplicates(arr);
	}

}
