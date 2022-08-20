package java8;

import java.util.ArrayList;

public class LambdaTest2 {

	public static void main (String args[]) {
	
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		
		//using lambda expression print all elements
		arrList.forEach(n -> System.out.println(n));
		
		//Using lambda expression to print even elements
		
		arrList.forEach(n -> { if (n %2 == 0) System.out.println(n);});
	}
}
