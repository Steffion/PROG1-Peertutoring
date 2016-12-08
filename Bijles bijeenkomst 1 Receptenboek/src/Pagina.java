
public class Pagina {
	private int			nRecepten	= 0;
	private Recept[]	recepten;
	
	public Pagina(int aantalRecepten) {
		recepten = new Recept[aantalRecepten];
	}
	
	public void printPagina() {
		int counter = 0;
		System.out.println("----------------------");
		System.out.println();
		
		while (counter < recepten.length) {
			if (recepten[counter] != null) {
				recepten[counter].printRecept();
			}
			counter++;
		}
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
	}
	
	public void receptenToevoegen(Recept recept) {
		if (nRecepten < recepten.length) {
			recepten[nRecepten] = recept;
			nRecepten++;
		}
	}
}
