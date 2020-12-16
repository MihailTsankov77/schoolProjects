package Exercise;

public class GeometricObject {
	private int sides;
	private String color;
	private boolean isFill;

	public GeometricObject(int _sides) {
		this.setSides( _sides);
	}
	
	public GeometricObject(int _sides, String color, boolean isFill) {
		this.setSides( _sides);
		this.setColor(color);
		this.setFill(isFill);
	}
	
	public int getSides() {
		return sides;
	}

	private void setSides(int sides) {
		this.sides = sides;
	}

	public boolean isFill() {
		return isFill;
	}

	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
