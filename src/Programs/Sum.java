package Programs;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a,b;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Two values");
		a=s.nextInt();
		b=s.nextInt();
		int c=a+b;
		System.out.println("the sum is " +c);
	}

}
