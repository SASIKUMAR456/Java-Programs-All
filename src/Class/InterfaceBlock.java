package Class;

public class InterfaceBlock {
	
	InterfaceBlock()
	{
		System.out.println("without arguments");
	}
	
	InterfaceBlock(int a)
	{
		System.out.println("the 1 args are passed");
	}
	
	
	public static void main(String[] args) {
		
		new InterfaceBlock();
		new InterfaceBlock(10);
		
		

	}

}
