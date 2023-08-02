package basic;

import java.sql.Date;

public class ImmutableClassExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Harshal Shinde","50k");
		Employee emp2 = new Employee(1, "Harshal Shinde","50k");
	}
}
