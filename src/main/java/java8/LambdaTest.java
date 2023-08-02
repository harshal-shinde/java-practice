package java8;


//Sample functional interface with one abstract method

interface FuncInterface {
	
	//An abstract function
	void abstractFun(int x);
	
	//a non abstract or default function
	default void normalFun() {
		System.out.println("Hello");
	}
}

public class LambdaTest {
	public static void main (String args[]) {
		//Lambda expression to implement above
		//function interface.this interface
		//by default implements abstractFun()
		FuncInterface fobj = (int x) ->System.out.println(2*x);
		
		//lambda operator -> body
		//this calls above lambda expression and prints 10
		fobj.abstractFun(10);
	}

}
