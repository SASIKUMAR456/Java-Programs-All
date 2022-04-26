package Programs;

import java.util.Scanner;

public class CreatecustomExceptionHandling {
	
	
	static void status (int age)throws InvalidAgeException
	{
		if(age>18)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			//System.out.println("Not eligiable for mrg");
			throw new InvalidAgeException();

		}
		
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		CreatecustomExceptionHandling.status(age);
		
	}

}
