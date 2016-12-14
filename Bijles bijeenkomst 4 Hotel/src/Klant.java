
public class Klant {
	private int		aantalPersonen;
	private String	naam;

	public Klant(String naam, int aantalPersonen) {
		super();
		this.naam = naam;
		this.aantalPersonen = aantalPersonen;
	}

	public int getAantalPersonen() {
		return aantalPersonen;
	}

	public String getNaam() {
		return naam;
	}

	public void printKlant() {
		System.out.println("Klant: " + naam + " met " + aantalPersonen + " personen.");
	}

	public void setAantalPersonen(int aantalPersonen) {
		this.aantalPersonen = aantalPersonen;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
