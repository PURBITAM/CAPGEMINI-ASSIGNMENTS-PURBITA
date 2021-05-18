package selfStudy4.PersonAndSubclasses;

public class Staff extends Person
{
	private String school;
	private double pay;
	
	public String getSchool() {return school;}
	public double getPay() {return pay;}
	
	public void setSchool(String school) {this.school=school;}
	public void setPay(double pay) {this.pay=pay;}
	//Person p=new Person();
	public String toString()
	{
		return ("Staff[Person[name="+getName()+", address="+getAddress()+"], school="+school+", pay="+pay+"]");
	}
}
