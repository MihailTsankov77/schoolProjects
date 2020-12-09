package Project;

public class DVD extends Product{
	
	private int length;
	private int  ageRating;
	private String studio;
	
	
	public DVD (int number, String name, int qty, double price, int len, int age, String std) {
		super(number, name, qty, price);
		this.setLength(len);
		this.setAgeRating(age);
		this.setStudio(std);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	
	//override toString() Method from the Object class
		//to allow display of each object to the console
	@Override
		public String toString()
		{
		     return super.toString() + "\nLength (minutes) " + this.length 
		    		 + "\nAge Rating " + this.ageRating 
		    		 + "\nFilm Studio " + this.studio;
		}//end method toString
	
	@Override
	public double getInventoryValue()
    {
      return super.getInventoryValue()*1.05;
    }
	
}
