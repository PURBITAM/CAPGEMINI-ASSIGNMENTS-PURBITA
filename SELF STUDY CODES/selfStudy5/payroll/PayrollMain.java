package selfStudy5.payroll;

import java.util.Scanner;

public class PayrollMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
	        while(true)
	        {
	        	System.out.println("Enter the choice:\n1. Admin\n2. Academic");
		        int ch = sc.nextInt();
		        if (ch == 1)
		        {
		        	 System.out.print("Enter the name: ");
		        	 sc.nextLine();
			         String name = sc.nextLine();
			         System.out.print("Enter salary: ");
			         int salary = sc.nextInt();
			         Admin ad = new Admin(name, salary);
			         ad.adjustSalary(salary);
			         break;
		        }
		        else if (ch == 2)
		        {
		        	 System.out.print("Enter the name: ");
		        	 sc.nextLine();
			         String name = sc.nextLine();
			         System.out.print("Enter salary: ");
			         int salary = sc.nextInt();
			         Academic ac = new Academic(name, salary);
			         ac.adjustSalary(salary);
			         ac.giveLecture();
			         break;
		        }
		        else
		        {
		        	System.out.println("Wrong choice");
		        }
		            
	        }
	  }
	        

}
