
public class Kamer {
	private int		kamernummer;
	private String	type;

	public Kamer(int kamernummer, String type) {
		super();
		this.kamernummer = kamernummer;
		this.type = type;
	}

	public int getKamernummer() {
		return kamernummer;
	}

	public String getType() {
		return type;
	}

	public void printKamer() {
		System.out.println("Kamer: " + kamernummer + " is een " + type);
	}

	public void setKamernummer(int kamernummer) {
		this.kamernummer = kamernummer;
	}

	public void setType(String type) {
		this.type = type;
	}
}
