package oops;

public class Client {
	public static void main(String[] args)
	{
		Enscapslition es1 =new Enscapslition();
		//es1.setEid(1001);
		//es1.setEname("suvaran");
		int eid=es1.getEid(1001);
		System.out.println(eid);
		String ename=es1.getEname("to Suvaran");
		System.out.println(ename);
		
		
		
		Enscapslition es2 =new Enscapslition();
		//es2.setEid(1002);
		//es2.setEname("suvaran sohila");
		
		int eid1=es2.getEid(1002);
		
		System.out.println(eid1);
		String ename1=es2.getEname("suvaran sohila");
		System.out.println(ename1);
		
		
		
		
	}

}
