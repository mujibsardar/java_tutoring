import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Use array to store and retrieve correct month statement
		String[] monthsStatements = new String[13];
		monthsStatements[1] = "(NEW) January has 31 days";
		monthsStatements[2] = "(NEW) February has 29 days";
		monthsStatements[3] = "(NEW) March has 31 days";
//		...
		
		System.out.println("Please enter the month number");
		int monthNum = scan.nextInt();
		
//		Print here using array
		System.out.println(monthsStatements[monthNum]);
		
		if(monthNum == 1) {
		System.out.println("January has 31 days");
		}else if(monthNum == 2) {
		System.out.println("February has 29 days");
		}else if(monthNum == 3) {
		System.out.println("March has 31 days");
		}else if(monthNum == 4) {
		System.out.println("April has 30 days");
		}else if(monthNum == 5) {
		System.out.println("May has 31 days");
		}else if(monthNum == 6) {
		System.out.println("June has 30 days");
		}else if(monthNum == 7 || monthNum == 8) {
		System.out.println("July and August have 31 days");
		}else if(monthNum == 9) {
		System.out.println("September has 30 days");
		}else if(monthNum == 10) {
		System.out.println("October has 31 days");
		}else if(monthNum == 11) {
		System.out.println("November has 30 days");
		}else if(monthNum == 12) {
		System.out.println("December has 31 days");
		}
		scan.close();
		}

}