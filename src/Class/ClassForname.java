package Class;

public class ClassForname {
	static
	{
		System.out.println("This Block is Static but using Main methode");
	}

	public static void main(String[] args)  throws ClassNotFoundException
	{
		
		Class.forName("Classb");
		Class.forName("Classc");
		
	

	}

}
