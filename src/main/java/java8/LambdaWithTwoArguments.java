package java8;

public class LambdaWithTwoArguments {

	//Operation is implemented using lambda expression
	interface FuncInter1 {
		int operation(int a, int b);
	}
	
	
	interface FuncInter2 {
		void sayMessage(String message);
	}
	
	//performs Operates operation on a and b
	
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}
	
	public static void main(String args[]) {
		
		//lambda expression for addition for two 
		//parameters data type for x and y is optional
		//this expression implements funcInter1 interface
		FuncInter1 add = (int x, int y) -> x + y;
		
		//Lambda expression multiplication for two parameters
		//this expression also implements using lambda expression 
		FuncInter1 multiply = (int x, int y) -> x * y ;
	
		// creating an object of test to call operate using
		//different implementations using lambda expression
		
		LambdaWithTwoArguments lambdaWithTwoArguments =
				new LambdaWithTwoArguments();
		
		//add two numbers using lambda
		System.out.println("Addition is " + 
				lambdaWithTwoArguments.operate(6, 3, add));
		
		//multiply two numbers using lambda
				System.out.println("Addition is " + 
						lambdaWithTwoArguments.operate(6, 3, multiply));
		//Lambda expression for single parameter
		//This expression implements `FuncInter2` interface
				
				FuncInter2 fobj = message -> System.out.println("Hello "
                        + message);
				
				fobj.sayMessage("Geek");
		
	}
}
