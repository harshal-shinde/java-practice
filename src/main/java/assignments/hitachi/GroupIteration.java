package assignments.hitachi;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Harshal
 * Input is iteration = 7, group =4, array = {1, 2,3, 4, 5, 6}
 *
 */
public class GroupIteration {
	
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int group = 4;
		int iterations = 7;
		List<List <Integer>> result	 = getIterations(arr, group, iterations);
		
	}
	
	public static List<List <Integer>> getIterations(int[] arr, int group , int iterations) {
		int arrLength = arr.length;
		int totalItr = arrLength * iterations;
		List <Integer> customList = new ArrayList<Integer>(group);
		List<List <Integer>> mainList = new ArrayList<List <Integer>>(group);
		
		for (int index = 1; index < totalItr+1; index++) {
			int subGroup = group;
			
			
			if(subGroup <=5) {
				int value = (index% group) != 0 ? (index% group) : group;
				System.out.printf("index = %d, value = %d, iterations= %d \n", index, value,iterations);
				customList.add(value);
			} else {
				mainList.add(customList);
				subGroup = group;
			}	
		}
		return mainList;
	}
}
