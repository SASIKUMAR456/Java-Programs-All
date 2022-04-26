package Programs;

	
	class Company
	{
		void salary()
		{
			float sala = 40000;
			System.out.println("the salary is " +sala);
		}
			
	}
	
	
	class Programmer extends Company
	{
		void money()
		{
			
		//	super.salary();
			int bouns= 10000;
			long total = bouns+40000;
			float tax = (float) 2350.80;
			float cgst = total-tax;
			System.out.println("The bouns of employee is " +bouns);
			System.out.println("The total salary is " +total);
			
			System.out.println("The total Tax of the Each person is " + cgst);
		}
		
		
		//double total=40000+10000;
	}
	
	public class Inheritance {
		
	public static void main(String[] args) {
		
		Programmer p1 = new Programmer();
		
		p1.salary();
		p1.money();
		
		//stringBuilder.append("Boums+Salary is employee");
		

	}

}
