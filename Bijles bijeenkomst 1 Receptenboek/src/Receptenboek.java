
public class Receptenboek {
	private String		naam;
	private int			nPagina;
	private Pagina[]	paginas;

	public Receptenboek(String titel, int aantalPaginas) {
		naam = titel;
		paginas = new Pagina[aantalPaginas];
	}

	public void paginasToevoegen(Pagina pagina) {
		if (nPagina < paginas.length) {
			paginas[nPagina] = pagina;
			nPagina++;
		}
	}

	public void printReceptenboek() {
		int counter = 0;
		System.out.println("Receptenboek " + naam);
		System.out.println();

		while (counter < paginas.length) {
			if (paginas[counter] != null) {
				paginas[counter].printPagina();
			}
			counter++;
		}

		System.out.println();
		System.out.println("Einde receptenboek " + naam);
	}
}
