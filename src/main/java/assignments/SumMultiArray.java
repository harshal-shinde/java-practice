package assignments;

public class SumMultiArray {
	
	public static void main(String[] args) {
	
		int rows = 3 ;
		int column = 3;
		
		int arr[][] = {{1, 0, 3},{0,2,1},{1,2,0}};
			
		
		/**
		 * 1 1 1 0
		 * 0 5 0 1
		 * 2 1 3 10
		 */
	
		
		
		int sum = 0;
		for (int rowIndex = 0; rowIndex<rows;rowIndex++) {
			
			for (int j = 0; j<column;j++) {
				
				if(rowIndex == 0) {
					if(arr[rowIndex][j]!= 0) {
						sum += arr[rowIndex][j];
					}
				} else {
					
					System.out.println("For "+ rowIndex + " row and " +j +" th Column" + " Value is = " + arr[rowIndex][j]);
					
					boolean zeros = false;
					
					int traverseUp = rowIndex;
					
					while(traverseUp > 0) {
						
						//Check above element is o or not
						if(arr[traverseUp-1][j] == 0) {
							zeros = true;
						}
						traverseUp --;
					}
					
					//if there is no zero in column wise traversal add to sum
					if(!zeros) {
						sum += arr[rowIndex][j];
					}		
				}
			}
		}
		
		System.out.println("Sum = > "+ sum);
		
	}

}
