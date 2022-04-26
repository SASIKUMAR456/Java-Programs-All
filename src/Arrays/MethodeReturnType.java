package Arrays;

public class MethodeReturnType {
	
	
	
	int [] m1()
	{
		System.out.println("m1 methode");
		int a[]= {10,20,30};
		return a;
	}
	void m2(double[] d)
	{
		System.out.println("m2 methode no args");
		for(double dd:d)
		{
			System.out.println(dd);
		}
	}

	public static void main(String[] args) {
		MethodeReturnType t= new MethodeReturnType();
		int [] x =t.m1();
		for(int aa:x)
		{
			System.out.println(aa);
		}
		double [] d= {20.4,30.8,60.9};
		t.m2(d);
		}

	}

