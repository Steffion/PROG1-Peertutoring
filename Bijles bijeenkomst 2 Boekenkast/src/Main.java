
public class Main {

	public static void main(String[] args) {
		// Boekenkast
		Boekenkast boekenkast = new Boekenkast(5);
		
		// Plank1
		Plank plank1 = new Plank(2);
		plank1.boekenToevoegen(new Boek("Head First Java", "Henk Collert"));
		plank1.boekenToevoegen(new Boek("Eclipse for Dummy's", "Hans Gerrtison"));
		boekenkast.plankenToevoegen(plank1);
		
		// Plank2
		Plank plank2 = new Plank(3);
		plank2.boekenToevoegen(new Boek("Boek drie op plank 2", "Test gelukt"));
		plank2.boekenToevoegen(new Boek("cool boek", "coole schrijver"));
		plank2.boekenToevoegen(new Boek("Waarom komt de NS nooit op tijd?", "Onderzoeksbureau"));
		boekenkast.plankenToevoegen(plank2);
		
		boekenkast.printBoekenkast();
	}
}
