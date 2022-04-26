package oops;
import java.util.*;
import java.lang.*;


	interface Oops
	{
		void m1();
		//void m2();
		//void m3();
	}
	class Program implements Oops{
		 public void m1() {
			 System.out.println("m1 block");
			 }
		public void m2() {
			System.out.println("m2 block");
			}
		public void m3() {
			System.out.println("m3 block");
			}
	
	}
	class Interface {
	public static void main(String[] args)
	{
		Program t = new Program();
		t.m1();
		t.m2();
		t.m3();
		/*It t1 = new Test();
		t1.m1();
		t1.m2();
		t1.m3();
		*/
	}

}

 
 
