package feblab2;

public class Employee {
	//problem 1
	long employeeid;
	String employeename;
	String employee_Address;
	long employee_phone;
	double basicSalary;
	double specialAllowance;
	double Hra=1000;
	//double trasnport Allowance
	public Employee(long id,String name, String Address,long phone) {
		this.employeeid =id;
		this.employeename= name;
		this.employee_Address= Address;
		this.employee_phone=phone;
		//this.basicSalary = salary
	}
	void calculateSalary()
	{
		double salary = basicSalary+(basicSalary * specialAllowance/100)+(basicSalary * Hra/100);
		System.out.println("salary of "+employeename+"is"+salary);
	}
	//adding default transport allowance method
	void calculateTransportAllowance() {
		double transportAllowance= 10*basicSalary/100;
		System.out.println(employeename+"Transport Allowance is:"+transportAllowance);		
	}
}
//deriving manager class from emplyee class
class Manager extends Employee{//child class from employee class
		public Manager (long id,String name,String Address,long phone,double Salary) {
			super(id,name,Address,phone);
			super.basicSalary=Salary;						
	}
		void calculateTransportAllowance() {
			double transportAllowance=15*basicSalary/100;
			System.out.println(employeename+"Transport Allowance is:"+transportAllowance);		
		}		
}
//deriving trainee class from employee class
class Trainee extends Employee{
	public Trainee(long id,String name,String Address,long phone,double Salary) {
		super(id ,name,Address,phone);
		super.basicSalary=Salary;
		
	}
}
 
