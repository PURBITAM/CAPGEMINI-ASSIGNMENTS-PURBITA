package selfStudy5.payroll;

public class Admin extends Payroll
{
	private String name;
	private double salary;
	
	public Admin(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void adjustSalary(int amt)
	{
		System.out.print("Admin ");
		super.adjustSalary(amt);
	}
}
