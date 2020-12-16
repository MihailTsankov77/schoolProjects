package Exercise;

import java.util.Date;

public class Staff extends Employee {
	
	private String Title;
	
	public Staff(String name, String address, int number, String email, String office, int salary, Date date, String title) {
		super(name, address, number, email, office, salary, date);
		this.setTitle(title);
	}

	public String getTitle() {
		return Title;
	}

	private void setTitle(String title) {
		Title = title;
	}
	

	@Override
	public String toString() {
		return super.toString() + " Staff Title : " + this.Title;
	}
	
}
