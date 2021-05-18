package selfStudy4.PersonAndSubclasses;

public class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	
	public String getProgram() {return program;}
	public int getYear() {return year;}
	public double getFee() {return fee;}
	
	public void setProgram(String program) {this.program=program;}
	public void setYear(int year) {this.year=year;}
	public void setFee(double fee) {this.fee=fee;}
	
	//Person p=new Student();
	
	public String toString()
	{
		return ("Student[Person[name="+getName()+", address="+getAddress()+"], program="+program+", year="+year+", fee="+fee+"]");
	}
}
