package selfStudy5.payroll;

public class Academic extends Payroll
{
	private String name;
	private double salary;
	
	public Academic(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void adjustSalary(int amt)
	{
		System.out.print("Academic ");
		//System.out.println("Salary is : "+amt);
		super.adjustSalary(amt);
	}
	
	public void giveLecture()
	{
		System.out.println("Give Lecture");
	}
	
}
