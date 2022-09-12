package lambdaExpression;


public class ExampleFunctionalInterface {
	
	public static void main(String args[]) {
		
		Movie movie = () -> System.out.println("I am watching Marvels");
		movie.show();
	}

}
