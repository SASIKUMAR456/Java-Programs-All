package oops;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptid;
	
	void dispaly()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptid);
		
	}

	public static void main(String[] args) {
	
		
		Employee emp1=new Employee();
		emp1.empid=100;
		emp1.empname="ankit";
		emp1.salary=20000;
		emp1.deptid=10;
		emp1.dispaly();
	}

}
