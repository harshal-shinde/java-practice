package geekforgeeks.amazon;

public class PlatformCounter {
	
	public static void main (String[] args) {
		
	int arrivalTimes[] = {900, 940, 950,1100, 1500, 1800};
	int departTimes[] = {910, 1200, 1120, 1130, 1900, 2000};
	
	int platforms = getPlatformCount(arrivalTimes, departTimes);
	
	}
	
	public static int getPlatformCount(int arrivalTimes[], int departTimes[]) {
		
		int arrivalCount = arrivalTimes.length;
		if(arrivalCount ==0 || departTimes.length ==0) {
			System.out.println("Invalid request please check");
			return 0;
		}
		
		for (int i=1; i<arrivalCount; i++) {
			
			for (int j =i; j>0; j--) {
				
				if(arrivalTimes[i]< departTimes[j-1]) {
					
				}
			}
		}
		
		return 1;
	}
	
	

}
