package ExceptionHandling;

public class TryAndCatchFinallyblock {
	public static void main(String[] args)
	{
		/*try
		{
			System.out.println("try block");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("CAtch Block");
			
		}
		finally 
		{
			System.out.println("finally block");
		}*/
	
		
	/*	******************************************
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("CAtch Block");
			
		}
		finally 
		{
			System.out.println("finally block");
		}
	**********************************************************	
*/
		
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Catch Block");
			
		}
		finally 
		{
			System.out.println("finally block");
		}
		
		
	}

}

