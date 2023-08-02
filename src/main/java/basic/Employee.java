package basic;

import java.util.Date;

public final class Employee {

	private final int id;
	private final String name;
	private final Date dob;
	
	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	public String getSalary() {
		return salary;
	}
	
	
}
