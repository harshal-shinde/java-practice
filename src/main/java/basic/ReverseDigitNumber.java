package basic;

/*
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-digits-of-a-number/?ref=lbp
 */

public class ReverseDigitNumber {
	
	public static int getReverseNumber( int num) {
		int reverseNumber = 0;
		
		while(num > 0) {
		
			reverseNumber = reverseNumber*10 + (num%10);
			num = num/10;
		}
		return reverseNumber;
	}
	
	public static void main(String [] args) {
		int num = 12345;
		System.out.println("Reverse Number = "+ getReverseNumber(num));
	}

}
