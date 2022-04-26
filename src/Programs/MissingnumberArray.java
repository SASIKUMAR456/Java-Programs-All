package Programs;

import java.util.Scanner;

public class MissingnumberArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n array size:");
		int n = sc.nextInt();
		
		int array [] = new int[n];
		 System.out.println("Enter (n-1) numbers: ");
	      for(int i=1; i<=n-1; i++) {
	         array[i] = sc.nextInt();
	         
	         int sumOfAll = (n*(n+1))/2;
	         int sumOfArray = 0;
	         for(int j=1; j<=n-1; j++) {
	            sumOfArray = sumOfArray+array[j];
	         }
	         int missingNumber = sumOfAll-sumOfArray;
	         System.out.println("Missing number is: "+missingNumber);
		
		
		
		
		}

}
}
