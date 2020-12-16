package Exercise;

public class Person {
	
	private String Name;
	private String Address;
	private int PhoneNumber;
	private String Email;
	
	public Person(String name, String address, int number, String email) {
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(number);
		this.setEmail(email);
	}

	public String getName() {
		return Name;
	}

	private void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	private void setAddress(String address) {
		Address = address;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	private void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	private void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "Person : " + this.Name + " Address : " + this.Address + " Phone number : " +this.PhoneNumber + " E-mail : " + this.Email;
	}
}
