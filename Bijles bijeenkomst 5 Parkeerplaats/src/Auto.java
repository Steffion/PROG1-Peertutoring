
public class Auto {
	private String	kenteken;
	private String	merk;
	
	public Auto(String kenteken, String merk) {
		super();
		this.kenteken = kenteken;
		this.merk = merk;
	}
	
	public String getKenteken() {
		return kenteken;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public void printAutoInfo() {
		System.out.println("Auto: " + kenteken + " is een " + merk);
	}

	public void setKenteken(String kenteken) {
		this.kenteken = kenteken;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
}
