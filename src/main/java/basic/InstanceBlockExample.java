package basic;

public class InstanceBlockExample {
	{
		System.out.println("Instance initilizer block 1");
	}
	
	{
		System.out.println("Instance initilizer block 2");
	}
	
	public InstanceBlockExample() {
		System.out.println("Class Constructor");
	}
	
	
	public static void main(String[] args) {
		InstanceBlockExample ib = new InstanceBlockExample();
		
		InstanceBlockExample ib2 = new InstanceBlockExample();
		System.out.println("Main Method");
	}

}
