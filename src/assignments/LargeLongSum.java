package assignments;

import java.util.*;

public class LargeLongSum {
	
	public static Long sum(String first, String second) {
		//Convert to String
//		String first = number1.toString();
//		String second = number2.toString();
		
		//Make sure that second string is large
		if(first.length() > second.length()) {
			String temp = first;
			first = second;
			second = temp;
		}
		System.out.println("First = " + first);
		System.out.println("Second = " + second);
		String finalString = "";
		int lengthOfFirst = first.length();
		int lengthOfSecond = second.length();
		
		//Reverse both String
		first = new StringBuilder(first).reverse().toString();
		second = new StringBuilder(second).reverse().toString();
		
		int carry =0;
		
		for(int i=0; i< lengthOfFirst; i++) {
			System.out.println("First characters"+i+"index = "+(int)(first.charAt(i)));
			System.out.println("Second characters"+i+"index = "+(int)(second.charAt(i)));
			int sum = (int)(first.charAt(i) - '0') +
					(int)(second.charAt(i) -'0') + carry; 
			System.out.println("SUM = "+sum);
			finalString += (char)(sum % 10 +'0');
			
			//calculate carry for next sum
			carry = sum/10;
		}
		System.out.println("After first iteration sum = "+ finalString);
		
		//Add remaining digit of large number
		for(int i=0; i<lengthOfSecond; i++) {
			int sum = ((int)(second.charAt(i) -'0') + carry);
			finalString += (char)(sum %10 +'0');
			carry = sum/10;
		}
		
		System.out.println("After second iteration sum = "+ finalString);
		//Add remaining carry
		
		if(carry > 0) {
			finalString += (char)(carry +'0');
		}
		System.out.println("After carry remaining iteration sum = "+ finalString);
		
		finalString = new StringBuilder(finalString).reverse().toString();
		System.out.println("Final Sum = "+ finalString);
		return Long.valueOf(finalString).longValue();	
	}
	
	public static void main(String[] args) {
//		List<Long> list = new ArrayList<>();
//		list.add((Long.(1000000001) );
//		list.add((long)1000000002);
//		list.add((long) 1000000003);
//		list.add((long)1000000004);
//		list.add((long) 1000000005);;
		long total = sum("1000000001", "1000000002");
		System.out.println(total);
	}

}
