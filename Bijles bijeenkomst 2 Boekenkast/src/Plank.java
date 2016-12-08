
public class Plank {
	private Boek[] boeken;

	public Plank(int grootte) {
		boeken = new Boek[grootte];
	}

	public void boekenToevoegen(Boek boek) {
		int counter = 0;
		
		while (counter < boeken.length) {
			if (boeken[counter] == null) {
				boeken[counter] = boek;
				return;
			}
			
			counter++;
		}
	}

	public Boek[] getBoeken() {
		return boeken;
	}
	
	public void printPlank() {
		System.out.println("Plank");
		System.out.println("______");

		int counter = 0;
		
		while (counter < boeken.length) {
			if (boeken[counter] != null) {
				boeken[counter].printBoek();
			}
			
			counter++;
		}
		
		System.out.println("End of Plank");
	}
	
	public void setBoeken(Boek[] boeken) {
		this.boeken = boeken;
	}
}
