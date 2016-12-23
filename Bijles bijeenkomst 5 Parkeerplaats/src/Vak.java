
public class Vak {
	private Auto	auto;
	private String	vaknummer;
	
	public Vak(String vaknummer) {
		super();
		this.vaknummer = vaknummer;
	}
	
	public Auto getAuto() {
		return auto;
	}
	
	public String getVaknummer() {
		return vaknummer;
	}
	
	public void removeAuto() {
		auto = null;
	}
	
	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public void setVaknummer(String vaknummer) {
		this.vaknummer = vaknummer;
	}

	/**
	 * Extra lookup method.
	 * @return
	 */
	public boolean isCarParked() {
		return auto != null;
	}

	public void printVakInfo() {
		System.out.println("Vak: " + vaknummer);
		
		if (isCarParked()) {
			auto.printAutoInfo();
		} else {
			System.out.println("Leeg vak");
		}
	}
}
