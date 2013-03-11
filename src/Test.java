/**
 * Classe de Test
 * 
 * @author Vivien Laurent
 * 
 */
public class Test {

	// Generation de bibliotheques pour les test

	/**
	 * Cette méthode génère une bibliotheque vide
	 * 
	 * @return Une Bibliotheque vide
	 */
	public Bibliotheque biblioTestVide() {
		Bibliotheque b = new Bibliotheque();
		return b;
	}

	/**
	 * Cette méthode génère une bibliotheque type
	 * 
	 * @return Une Bibliotheque vide
	 */
	public Bibliotheque biblioTest() {
		Bibliotheque b = new Bibliotheque();
		// Ajout de Romans
		b.ajouteRoman("Hugo", "Les Miserables");
		b.ajouteRoman("Tolkien", "Bilbo");
		// Ajout de Comics
		b.ajouteComics("Marvel", "Dessinateur", "Batman");
		// Ajout de Manga
		b.ajouteManga("Manga", "dessinateur", "titre");
		return b;
	}

	// Methodes de test
	public boolean testRoman() {
		Livre l, l2;
		l = new Roman("dfbdg", "dgdg");
		l2 = new Roman("gjs", "kjg");
		System.out.println(l.toString());
		return true;

	}

	public boolean testListeAjoutDansListeVide() {
		Livre livre = new Roman("jsjfkf", "qfs");
		Maillon m = new Maillon(null, livre);
		Liste l = new Liste();
		l.ajouter(livre);
		return true;
	}

	public boolean testListeSuppression() {
		Livre livre = new Roman("j", "qfs");
		Livre roman = new Roman("a", "qfs");
		Livre roman2 = new Roman("b", "qfs");
		Livre roman3 = new Roman("c", "qfs");
		Liste l = new Liste();

		l.ajouter(roman);
		l.ajouter(roman2);
		l.ajouter(roman3);
		l.ajouter(livre);
		System.out.println(l.afficheBD());
		return l.supprime("a");

	}

	/**
	 * Test la méthode d'affichage des BDs
	 * 
	 * @return
	 */
	public boolean testBibliothequeAfficheBD() {
		biblioTest().afficheBD();
		return true;
	}
	
	public boolean testBibliothequeRechercheAuteur(){
		biblioTest().rechercheAuteur("Hugo");
		
		return true;
		
	}

}
