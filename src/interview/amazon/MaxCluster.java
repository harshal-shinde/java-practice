package interview.amazon;

import java.util.PriorityQueue;

public class MaxCluster {
	public static void main(String[] args) {
		int[] processingPowers = {3,6,1,3,4};
		int[] bootingPowers = {2,1,3,4,5};
		int maxPower =25;
		int noOfCluster = getNoOfMaxCluster(processingPowers,bootingPowers, maxPower);
	
		System.out.println();
		System.out.println("No of max cluster = "+ noOfCluster);
	}
	
	
	public static int getNoOfMaxCluster(int[]processingPowers,int[] bootingPowers, int maxPower) {
		int maxSize = 0;
		int currentSize = 1;
		int start =0;
		int end =0;
		int processingPowerSize = processingPowers.length;
		
		PriorityQueue<Integer> maxBootingPower = new PriorityQueue<>((a, b) -> 
		Integer.compare(b, a));
		
		int processingPowerSum = processingPowers[0];
		System.out.println("Initial processingPowerSum = " + processingPowerSum);
		
		//Create queue with initial booting power present
		maxBootingPower.add(bootingPowers[0]);
		
		//Check this loop until end variable is not less than processing power size
		while(end < processingPowerSize) {
			
			int currentBootingPower = maxBootingPower.peek();
			System.out.println("-------------------Start----------------");
			System.out.println("\n\ncurrentBootingPower = " + currentBootingPower);
			
			int currentPower = currentBootingPower + processingPowerSum * currentSize;
			System.out.printf("Current Power = %d + %d * %d = " ,currentBootingPower, processingPowerSum ,currentSize);
			System.out.println(currentPower);
			
			
			if(currentPower <= maxPower) {
				
				maxSize = currentSize;
				end ++;
				currentSize ++;
				
				System.out.printf("\n(%d <= %d), maxSize = %d, "
						+ "end = %d currentSize = %d", currentPower,maxPower, maxSize,end, currentSize);
			} else {
				System.out.printf("\n(%d > %d)", currentPower,maxPower);
				System.out.printf("\nstart = %d , processingPowers[%d] = %d", start, start, processingPowers[start]);
				
				processingPowerSum -= processingPowers[start];
				maxBootingPower.remove(bootingPowers[start]);
				
				System.out.printf("\nstart =%d, bootingPowers[%d] = %d", start, start, bootingPowers[start]);
				
				start++;
				end ++;
				
				System.out.printf("\nprocessingPowerSum = %d, "
						+ "start = %d end = %d", processingPowerSum,start, end);
			}
			
			if(end < processingPowerSize) {
				
				System.out.printf("\n\n(%d < %d) \n", end, processingPowerSize);
				System.out.printf("\nend = %d, bootingPowers[%d] = %d",end, end, bootingPowers[end]);
				System.out.printf("\nend = %d, processingPowers[%d] = %d", end, end, processingPowers[end]);
				
				maxBootingPower.add(bootingPowers[end]);
				processingPowerSum += processingPowers[end];
				
				System.out.println("\nProcessing Power Sum = " + processingPowerSum);
				
			}
			
		}
		System.out.println("\n-------------------END----------------");
		return maxSize;
	}

}
