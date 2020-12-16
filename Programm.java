package Exercise;

import java.util.Arrays;
import java.util.List;

public class Programm {
	
	private String name;
	public List<LineCode> lines;

	public Programm(String _name, int _lines) {
		this.setName(_name);
		
		LineCode [] lns = new LineCode[_lines];
		for(int i = 0; i<_lines; i++) lns [i] = new LineCode(this, i+1);
		
		this.lines = Arrays.asList(lns);
	}
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	
}
