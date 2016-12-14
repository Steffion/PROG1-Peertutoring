
public class Reservering {
	private Kamer[]	kamers;
	private Klant	klant;

	public Reservering(Klant klant, int aantalKamers) {
		super();
		this.klant = klant;
		this.kamers = new Kamer[aantalKamers];
	}

	public void addKamer(Kamer kamer) {
		int counter = 0;

		while (counter < kamers.length) {
			if (kamers[counter] == null) {
				kamers[counter] = kamer;
				break;
			}

			counter++;
		}
	}

	public Kamer[] getKamers() {
		return kamers;
	}

	public Klant getKlant() {
		return klant;
	}

	public void printReservering() {
		System.out.println("Reservering: " + klant.getNaam() + " met de kamers:");
		
		int counter = 0;

		while (counter < kamers.length) {
			if (kamers[counter] != null) {
				kamers[counter].printKamer();
			}

			counter++;
		}
	}

	public void setKamers(Kamer[] kamers) {
		this.kamers = kamers;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
	}
}
