package Exercise;

public class Student extends Person{
	
	private String Status;
	
	public Student(String name, String address, int number, String email, String status) {
		super(name, address, number, email);
		this.setStatus(status);
	}

	public String getStatus() {
		return Status;
	}

	private void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Student Status : " + this.Status;
	}
}
