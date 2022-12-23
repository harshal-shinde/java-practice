package com.code.company.google;

public class SecondMax {

	public static void main(String[] args) {
		int[] input = {1, 2,4,34,12,345,1};

		int length = input.length;

		if(length <0 || length ==1) {
			System.out.println("There is less elements present in given array , Please provide proper input");
		}
		int secondMaxOutput = getSecondMax(input, length);

		System.out.println("Second max is" +secondMaxOutput);
		}


		public static int getSecondMax(int[] input, int length) {
			
			int max  = Integer.MIN_VALUE;
			int secondMax= Integer.MAX_VALUE;

			if(input[0] > input[1]) {
			max = input[0] ;
			secondMax = input[1];
		} else {
			max = input[1] ;
			secondMax = input[0];
		}


		for(int index=2; index <length; index++) {
			if(input[index] >= max) {
				max = input[index];
				secondMax =max;
			} else if(input[index] >= secondMax) {
				secondMax = input[index];
			}
		}
		return secondMax;
	 }



}
