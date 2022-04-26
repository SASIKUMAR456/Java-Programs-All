package Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.next();
		//String str ="amma";
		String name = "";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			name=ch+name;
		}
		System.out.println(name);
		if(str.toLowerCase().equals(name.toLowerCase()))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
