package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// collection of one to another
		
		Collection<String> c1 = new ArrayList<String>();
		c1.add("babu");
		c1.add("princy");
		c1.add("sasi");
		c1.add("reddy");
		System.out.println(c1);
		Collection<String> c2 =new ArrayList<String>();
		c2.add("rmp");
		c2.add("suvar");
		c2.add("rocky");
		c2.add("rrr");
		Collection<String> c3 = new ArrayList<String>();
		c3.add("rama");
		Collection<String> c4 =new ArrayList<String>();
		c4.addAll(c1);
		c4.addAll(c2);
		c4.addAll(c3);
		System.out.println(c4);
		System.out.println(c4.size());
		System.out.println(c4.removeAll(c2));
		System.out.println(c4);
		
		
		
		
		
		
		

	}

}
