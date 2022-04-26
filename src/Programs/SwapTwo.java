package Programs;

import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the two values:");
		int a =sc .nextInt();
		int b = sc.nextInt();
		/*
		// with using temp varibales
		//System.out.printf("Before swapping the two values:" +a,b);
		System.out.println("x = " +a);
		System.out.println("Y = " +b);
		
		int temp = a;
		a=b;
		b=temp;
		//System.out.printf("After swapping the two values:" +a,b);
		System.out.println("x = " +a);
		System.out.println("Y = " +b);
		
		
		*/

		//without using temp variable
		
		//System.out.printf("Before swapping the two values:" +a,b);
		System.out.println("A = " +a);
		System.out.println("B = " +b);
		
		a=a+b;  //a=2 b=3 2+3=5
		b=a-b;  //        5-3=2
		a=a-b; //         2-5=3    
		
		//System.out.printf("After Swapping The Two values: " +a,b);
		System.out.println("A = " +a);
		System.out.println("B = " +b);
		
	}

}
