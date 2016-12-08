
public class Main {

	public static void main(String[] args) {
		Receptenboek boek = new Receptenboek("Laura's Kookboek", 1);
		
		Pagina pagina1 = new Pagina(2);

		Recept recept1 = new Recept("Soep", "Gooi alles bij elkaar en laat dit koken.", 3);
		recept1.ingredientenToevoegen("Tomaat");
		recept1.ingredientenToevoegen("Water");
		recept1.ingredientenToevoegen("Boullionblokje");
		
		Recept recept2 = new Recept("Worteltjes met Worst", "Kook de worteltjes en bak de worst", 2);
		recept2.ingredientenToevoegen("Worteltjes");
		recept2.ingredientenToevoegen("Worst");
		
		pagina1.receptenToevoegen(recept1);
		pagina1.receptenToevoegen(recept2);
		
		boek.paginasToevoegen(pagina1);
		boek.printReceptenboek();

	}

}
