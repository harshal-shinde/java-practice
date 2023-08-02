package assignments;

public class FountainCount {
	

	static int minimumCountFountains(int a[], int totalElements) {
		int dp[] = new int[totalElements];
		int start = 1;
		int end = 0;
		int countFountain = 0;
		
		for(int location =1; location <= totalElements; location++) {
			int arrElement = a[location -1];
			System.out.println("arrElement = " + arrElement);
			start = Math.max(location - arrElement, 1);
			if(start == totalElements) {
				start = totalElements -1;
			}
			end = Math.min(location + arrElement, totalElements);
			dp[start] = Math.max(dp[start], end);
			System.out.println("Start = " + start +" End = " + end + " dp[Start] = " + dp[start]);
		}
		
		int next = 0;
		end = dp[next];
		
		for (int counter=0; counter < totalElements ; counter ++) {
			System.out.println("Dp counter = " + dp[counter]);
			next = Math.max(next, dp[counter]);
			
			if(counter == end) {
				countFountain++;
				end = next;
			}
		}
		return countFountain;
	}
	
	public static void main(String[] args) {
		int locations[] = {2, 0, 0, 0};
		int N = locations.length ;
		System.out.println(minimumCountFountains(locations, N));
	}
}
