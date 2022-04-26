package Programs;

import java.util.Scanner;

public class FibbonicSeries {

	public static void main(String[] args) {
		
		
		Scanner s3 =new Scanner(System.in);
		System.out.println("Enter the value of :");
		int n = s3.nextInt();
		
		int firstTerm = 0, secondTerm = 1;
	   // System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; i++) 
	    {
	      //System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	      System.out.print(firstTerm + ", ");

	}

	}
}
