package Exercise;

import java.util.List;

public class Programmer {
	
	private String name;
	List<Project> projects;
	
	public Programmer(String _name) {
		this.setName(_name);
	}
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
}
