package Programs;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int a=10/0;
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			
			//System.out.println(20/0);
			System.out.println("the finally");

		}
	}

}
