
public class Verdieping {
	private Vak[]	vakken;
	private int		verdiepingNummer;
	
	public Verdieping(int verdiepingNummer) {
		super();
		this.verdiepingNummer = verdiepingNummer;
		vakken = new Vak[3];
		
		int counter = 0;

		while (counter < vakken.length) {
			vakken[counter] = new Vak(verdiepingNummer + "-" + counter);
			counter++;
		}
	}
	
	public Vak[] getVakken() {
		return vakken;
	}
	
	public int getVerdiepingNummer() {
		return verdiepingNummer;
	}
	
	/**
	 * Extra lookup method.
	 * 
	 * @return
	 */
	public boolean isFull() {
		int counter = 0;
		
		while (counter < vakken.length) {
			if (!vakken[counter].isCarParked()) return false;
			
			counter++;
		}

		return true;
	}
	
	public void parkAuto(Auto auto) {
		int counter = 0;
		
		while (counter < vakken.length) {
			if (!vakken[counter].isCarParked()) {
				vakken[counter].setAuto(auto);
				return;
			}
			
			counter++;
		}
	}

	public void setVakken(Vak[] vakken) {
		this.vakken = vakken;
	}
	
	public void setVerdiepingNummer(int verdiepingNummer) {
		this.verdiepingNummer = verdiepingNummer;
	}

	public void printVerdieping() {
		System.out.println("Verdieping: " + verdiepingNummer + " (" + vakken.length + " vakken)");
		
		int counter = 0;
		
		while (counter < vakken.length) {
			vakken[counter].printVakInfo();
			counter++;
		}
	}
}
