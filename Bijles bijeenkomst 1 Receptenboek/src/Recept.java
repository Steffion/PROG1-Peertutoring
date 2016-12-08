
public class Recept {
	private int			amountIngredienten;
	private String		bereidingswijze;
	private String[]	ingredienten;
	private String		naam;
	private int			nItems	= 0;
	
	public Recept(String titel, String bereiden, int aantalIngredienten) {
		naam = titel;
		amountIngredienten = aantalIngredienten;
		bereidingswijze = bereiden;
		ingredienten = new String[amountIngredienten];
	}
	
	public void ingredientenToevoegen(String ingredient) {
		if (nItems < amountIngredienten) {
			ingredienten[nItems] = ingredient;
			nItems++;
		} else {
			System.out.println("Teveel ingredienten!");
		}
	}
	
	public void printRecept() {
		int counter = 0;
		
		System.out.println("--Recept voor " + naam + "--");
		System.out.println();
		System.out.println("Ingredienten:");
		
		while (counter < amountIngredienten) {
			if (ingredienten[counter] != null) {
				System.out.println(ingredienten[counter]);
			}
			counter++;
		}
		
		System.out.println();
		System.out.println("Bereidingswijze:");
		System.out.println(bereidingswijze);
		System.out.println();
	}
	
}
