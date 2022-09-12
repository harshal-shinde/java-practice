package basic;

public class StaticBlockExample {

	static {
		System.out.println("First static block");
	}
	
	static {
		System.out.println("Second static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
}
