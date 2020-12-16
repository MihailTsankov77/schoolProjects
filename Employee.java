package Exercise;

import java.util.Date;

public class Employee extends Person{
	
	private String Office;
	private int Salary;
	private Date DateHired;
	
	public Employee(String name, String address, int number, String email, String office, int salary, Date date) {
		super(name, address, number, email);
		this.setDateHired(date);
		this.setOffice(office);
		this.setSalary(salary);
	}

	public String getOffice() {
		return Office;
	}

	private void setOffice(String office) {
		Office = office;
	}

	public int getSalary() {
		return Salary;
	}

	private void setSalary(int salary) {
		Salary = salary;
	}

	public Date getDateHired() {
		return DateHired;
	}

	private void setDateHired(Date dateHired) {
		DateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Employee Office : " + this.Office + " Salary : " + this.Salary + " Date : " + this.DateHired;
	}
	
	
}
