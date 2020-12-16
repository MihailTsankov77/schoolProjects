package Exercise;

import java.util.List;

public class Project {

	private String name;
	Programmer programmer;
	List<Programm> programms;
	
	public Project(String _name, Programmer pr) {
		this.setName(_name);
		this.setProgrammer(pr);
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public Programmer getProgrammer() {
		return this.programmer;
	}

	private void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}
}
