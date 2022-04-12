package Unit_01;

import java.util.Scanner;

/* When user takes input from the console
 * nextLine()		read user input [to read string]
 * next()			read next token from the input entered by user
 * 
 * nextBoolean()	reads a boolean value from user
 * nextByte()		reads a byte value from user
 * nextDouble()		reads a double value from user
 * nextFloat()		reads a float value from user
 * nextInt()		reads a int value from user 
 * nextLine()		reads a String value from user
 * nextLong()		reads a long value from user
 * nextShort()		reads a short value from user 
 */
public class P4_Task03_ScannerClassesInJava {

	public static void main(String[] args) {
	
		Scanner myobj1= new Scanner(System.in);// creates a scanner object
		Scanner myobj2= new Scanner(System.in);
		
		//Read the first token (_ Space bar)
		String firstName = myobj1.next();
		System.out.println("Name is: " + firstName +"\n");
		
		String name = myobj2.nextLine();
		String name2 = myobj2.nextLine();
		
		System.out.println("Name is: " + name +"\n");
		System.out.println("Name is: " + name2 +"\n");
		
		boolean b = myobj2.nextBoolean();
		System.out.println(b +"\n");
		
		myobj1.close();
		myobj2.close();
		

	}

}