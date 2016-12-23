
public class Garage {
	private String			naam;
	private Verdieping[]	verdiepingen;
	
	public Garage(String name) {
		super();
		this.naam = name;
		this.verdiepingen = new Verdieping[5];
		
		int counter = 0;
		
		while (counter < verdiepingen.length) {
			verdiepingen[counter] = new Verdieping(counter);
			counter++;
		}
	}
	
	public String getNaam() {
		return naam;
	}
	
	public Verdieping[] getVerdiepingen() {
		return verdiepingen;
	}
	
	public void setNaam(String name) {
		this.naam = name;
	}
	
	public void setVerdiepingen(Verdieping[] verdiepingen) {
		this.verdiepingen = verdiepingen;
	}

	/**
	 * Extra method om door te verwijzen.
	 * @param auto
	 */
	public void parkAuto(Auto auto) {
		int counter = 0;

		while (counter < verdiepingen.length) {
			if (!verdiepingen[counter].isFull()) {
				verdiepingen[counter].parkAuto(auto);
				return;
			}

			counter++;
		}
	}

	public void printGarage() {
		System.out.println("Parkeerplaats: " + naam + " (" + verdiepingen.length + " verdiepingen)");
		
		int counter = 0;

		while (counter < verdiepingen.length) {
			verdiepingen[counter].printVerdieping();
			counter++;
		}
	}
}
