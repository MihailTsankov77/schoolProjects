package Exercise;

import java.util.Date;

public class Faculty extends Employee {

	private int Hours;
	private String Rank;
	public Faculty(String name, String address, int number, String email, String office, int salary, Date date, int hours, String rank) {
		super(name, address, number, email, office, salary, date);
		this.setHours(hours);
		this.setRank(rank);
	}
	public int getHours() {
		return Hours;
	}
	private void setHours(int hours) {
		Hours = hours;
	}
	public String getRank() {
		return Rank;
	}
	private void setRank(String rank) {
		Rank = rank;
	}


	@Override
	public String toString() {
		return super.toString() + " Faculty Hours : " + this.Hours + " Rank : " + this.Rank;
	}
	
}
