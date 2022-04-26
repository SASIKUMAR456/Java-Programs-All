package Programs;

public class MethodeOverloading {
	
	 static int add(int a ,int b)
	{
		return a+b;
	}
	 static int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		//MethodeOverloading s1 =new MethodeOverloading();
		//MethodeOverloading s2 =new MethodeOverloading();
		
		System.out.println("the adding is "  +add(10,20));
		System.out.println("The sub is "  +add(10,20,50));
		

	}

}
