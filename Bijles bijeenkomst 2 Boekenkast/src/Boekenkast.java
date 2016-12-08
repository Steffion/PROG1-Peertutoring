
public class Boekenkast {
	private Plank[] planken;

	public Boekenkast(int grootte) {
		this.planken = new Plank[grootte];
	}

	public Plank[] getPlanken() {
		return planken;
	}

	public void plankenToevoegen(Plank plank) {
		int counter = 0;
		
		while (counter < planken.length) {
			if (planken[counter] == null) {
				planken[counter] = plank;
				return;
			}
			
			counter++;
		}
	}

	public void printBoekenkast() {
		System.out.println("Boekenkast");
		System.out.println("______");
		
		int counter = 0;
		
		while (counter < planken.length) {
			if (planken[counter] != null) {
				planken[counter].printPlank();
			}
			
			counter++;
		}
		
		System.out.println("End of Boekenkast");
	}

	public void setPlanken(Plank[] planken) {
		this.planken = planken;
	}
}
