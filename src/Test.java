import com.sun.org.apache.bcel.internal.generic.RETURN;

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
		return new Bibliotheque();
	}

	/**
	 * Cette méthode génère une bibliotheque type
	 * 
	 * @return Une Bibliotheque type
	 */
	public Bibliotheque biblioTest() {
		Bibliotheque b = new Bibliotheque();
		// Ajout de Romans
		b.ajouteRoman("Hugo", "Les Miserables");
		b.ajouteRoman("Hugo", "Les Miserables");
		b.ajouteRoman("Hugo", "Les Miserables");
		b.ajouteRoman("Tolkien", "Bilbo");
		// Ajout de Comics
		b.ajouteComics("Marvel", "Dessinateur", "Batman");
		// Ajout de Manga
		b.ajouteManga("Manga", "dessinateur", "titre");
		b.ajouteManga("Manga", "dessinateur", "titre");
		b.ajouteManga("Manga", "dessinateur", "titre");
		return b;
	}

	// Generation de listes

	/**
	 * @return Une liste vide
	 */
	public Liste listeVide() {
		return new Liste();
	}

	/**
	 * @return Une liste type
	 */
	public Liste listeTest() {
		Liste l = new Liste();
		l.ajouter(new Roman("Hugo", "Les Miserables"));
		l.ajouter(new Comics("Marvel", "Batman","Marvel"));
		l.ajouter(new Manga("Manga", "Manga","Manga"));
		return l;
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
		Liste l=listeTest();
		System.out.println(l.toString());
		boolean res = l.supprime("Batman");
		System.out.println("Suppression de Manga");
		System.out.println(l.toString());
		return res;
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

	public boolean testBibliothequeRechercheAuteur() {
		Bibliotheque b=biblioTest();
		b.rechercheAuteur("Hugo");
		b.rechercheAuteur("Tolkien");

		return true;

	}

	public boolean testBibliothequeRechercheDessinateur() {
		biblioTest().rechercheDessinateur("dessinateur");

		return true;

	}

}
