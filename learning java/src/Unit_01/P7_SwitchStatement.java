package Unit_01;

import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {

		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		int ch = obj.nextInt();

		switch (ch) {
		case 1: {
			if (ch == 1) {
				System.out.println("Current Year: 2022");
			}
			break;
		}
		case 2: {
			if (ch == 2) {
				System.out.println("Current month: April");
			}
			break;
		}
		case 3: {
			if (ch == 3) {
				System.out.println("Current Day: Saturday");
			}
			break;
		}
		default: {
			System.out.println("Invalid choice");
		}
			break;

		}

	}
}