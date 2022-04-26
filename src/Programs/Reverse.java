package Programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int reverse=0;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Digits: ");
		int x = sc.nextInt();
		while(x!=0)
		{
			
			int reminader=x%10;
			reverse=reverse*10+reminader;
			x=x/10;
					
		}
		System.out.println("the Reverse of digit is \n"  +reverse);
	}

}
