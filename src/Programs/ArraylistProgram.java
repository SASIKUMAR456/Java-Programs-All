package Programs;

import java.util.ArrayList;
import java.util.Collection;

public class ArraylistProgram {

	public static void main(String[] args) {
		
		Collection<String> al = new ArrayList();
		al.add("Welcome");
		al.add("to");
		al.add("india");
		
		
		System.out.println(al);
		
		
		al.isEmpty(); 
		System.out.println(al);
	}

}
