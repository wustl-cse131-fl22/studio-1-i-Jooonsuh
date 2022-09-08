package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		// take year number ====> true or false leap year (boolean)
		System.out.println("what is the year?");
		int year = in.nextInt();
		
		// true is divisible by 4
		boolean div4 = year % 4 == 0 &&
				year % 100 != 0 ||
				year % 400 == 0;
		System.out.println(year + 
				" is a leap year: " +
				div4
				);
	}

}
