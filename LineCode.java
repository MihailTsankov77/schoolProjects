package Exercise;

public class LineCode {
    private int index;
    private Programm programm;

    public LineCode(Programm _pr, int _index) {
        this.setIndex(_index);
        this.setProgramm(_pr);
    }

	public int getIndex() {
		return index;
	}

	private void setIndex(int index) {
		this.index = index;
	}

	public Programm getProgramm() {
		return programm;
	}

	private void setProgramm(Programm programm) {
		this.programm = programm;
	}
}
