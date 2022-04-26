package Class;

public class AllClass {
	int a=10; //instance var
	static int b=20; //static var
	void m1(int a)
	{
		System.out.println("First m1 Methode");
	}
	static void m2(String str)  //static methode
	{
		System.out.println("Second one is Static methode");
	}
	AllClass()
	{
		System.out.println("this is constructor");
	}
	AllClass(int a)
	{
		System.out.println("this second with pass the args");
	}
	{
		System.out.println("This Instance Block");
	}
	static 
	{
		System.out.println("This is Ststic Block");
	}
	
	public static void main(String[] args) {
		AllClass t1 = new AllClass();
		AllClass t2=new AllClass();
		
		t1.m1(30);
		AllClass.m2("RRR");

	}

}
