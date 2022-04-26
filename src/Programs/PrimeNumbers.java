package Programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		//int a ;
		boolean flag = false;
		Scanner s2 =new Scanner(System.in);
		System.out.println("Enter the value : ");
		int x=s2.nextInt();
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("This is a Prime Number "  +x);
		}
		else
		{
			System.out.println("This is not prime Number " +x);
		}

	}

}
