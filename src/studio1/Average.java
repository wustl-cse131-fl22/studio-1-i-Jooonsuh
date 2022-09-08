package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			
		
		System.out.print("What is the first number?");
		int n1 = in.nextInt();
		
		
		
		System.out.print("What is the second number?");
		int n2 = in.nextInt();
		
		
		System.out.println("The average of " + n1 +        // Average of 5 and 6 is 5.5
												" and " +
												n2 +
												" is " +
												(double) (  (n1+n2)/2.0  )
												
												
												
												);
		
	}

}
