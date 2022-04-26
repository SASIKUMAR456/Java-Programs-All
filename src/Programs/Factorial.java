package Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//int a;
		//float c;
		long fact=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value:");
		int x=s1.nextInt();
	//	System.out.println("Enter the Float value:  ");
		//float y=s1.nextFloat();
		
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial is "+fact);
		
		

	}

}
