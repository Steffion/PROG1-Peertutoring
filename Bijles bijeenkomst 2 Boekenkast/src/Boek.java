
public class Boek {
	private String	naam;
	private String	schrijver;
	
	public Boek(String naam, String schrijver) {
		super();
		this.naam = naam;
		this.schrijver = schrijver;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public String getSchrijver() {
		return schrijver;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setSchrijver(String schrijver) {
		this.schrijver = schrijver;
	}
	
	public void printBoek() {
		System.out.println("Boek");
		System.out.println("______");
		System.out.println("Naam: " + naam);
		System.out.println("Schrijver: " + schrijver);
		System.out.println("End of Boek");
	}
}
