package basic;

import java.util.Scanner;

public class ReadInput {
	public static void main(String[] args) {
	
		//Declare the variables
		int num;
		
		//Input the integer 
		System.out.println("Enter the integer : ");
		try (Scanner s = new Scanner(System.in)) {
			//Read the next integer from screen
			num =s.nextInt();
		}
		
		//Display the integer
		System.out.println("Entered integer is : " + num);
	}

}
