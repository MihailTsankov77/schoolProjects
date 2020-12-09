package Project;

public class CD extends Product{

	private String artist;
	private int  numberSongs;
	private String label;
	
	
	public CD (int number, String name, int qty, double price, String artist, int numS, String label) {
		super(number, name, qty, price);
		this.setArtist(artist);
		this.setLabel(label);
		this.setNumberSongs(numS);
	}


	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberSongs() {
		return numberSongs;
	}

	public void setNumberSongs(int numberSongs) {
		this.numberSongs = numberSongs;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	//override toString() Method from the Object class
	//to allow display of each object to the console
@Override
	public String toString()
	{
	     return "Artist " + this.artist 
	    		 + "\nNumber of songs " + this.numberSongs
	    		 + "\nlabel " + this.label + "\n" + super.toString();
	}//end method toString
}
