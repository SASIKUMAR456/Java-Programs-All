package Class;

public class Static {
	{
		System.out.println("This is Instance Block1");
	}
	{
		System.out.println("This is Second Instance Block");
	}
	static
	{
		System.out.println("This is Static Block");
	}
	static
	{
		System.out.println("This is Another Static Block");
	}
	Static()
	{
		System.out.println("This is a Constaructor");
	}
	Static(int a)
	{
		System.out.println("This is block is Another constaructor");
	}
	public static void main(String[] args) {
		//nameless
		//new Static();
		//new Static(10);

	}

}
