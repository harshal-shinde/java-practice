package java8;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckBirthday {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Birthdate:");
		String input = sc.next();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate userdate = LocalDate.parse(input, format);
		int userday = userdate.getDayOfMonth();
		int usermonth = userdate.getMonthValue();
		LocalDate currentdate = LocalDate.now();
		int currentday = currentdate.getDayOfMonth();
		int currentmonth = currentdate.getMonthValue();
		if (userday == currentday && usermonth == currentmonth) {
			System.out.println("Happy Birthdate To You!!");
		} else {
			System.out.println("Today is not your Birthdate");
		}
	}

}