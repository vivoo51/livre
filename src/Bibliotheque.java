/**
 * Classe representant le stock de livre
 * 
 * @author Vivien Laurent
 * 
 */
public class Bibliotheque {
	/**
	 * Attribut de type Liste, representant la liste des livres dans la
	 * bibliotheque
	 */
	private Liste listeLivre;

	/**
	 * Constructeur initialisant une bibliotheque
	 */
	public Bibliotheque() {
		this.listeLivre = new Liste();

	}

	/**
	 * Methode permettant l'ajout d'un Roman dans la Bibliotheque
	 * 
	 * @param titre
	 * @param auteur
	 */
	public void ajouteRoman(String auteur, String titre) {
		listeLivre.ajouter(new Roman(titre, auteur));
	}

	/**
	 * Methode permettant l'ajout d'un Comics dans la Bibliotheque
	 * 
	 * @param auteur
	 *            Auteur du Comics
	 * @param dessinateur
	 *            Dessinateur du Comics
	 * @param titre
	 *            Titre du Comics
	 */
	public void ajouteComics(String auteur, String dessinateur, String titre) {
		listeLivre.ajouter(new Comics(titre, auteur, dessinateur));
	}

	/**
	 * Methode permettant l'ajout d'un Mangadans la Bibliotheque
	 * 
	 * @param auteur
	 *            Auteur du manga
	 * @param dessinateur
	 *            Dessinateur du Manga
	 * @param titre
	 *            Titre du Manga
	 */
	public void ajouteManga(String auteur, String dessinateur, String titre) {
		listeLivre.ajouter(new Manga(titre, auteur, dessinateur));
	}
	
	/**
	 * Methode affichant la liste des BD contenues dans la Bibliotheque
	 */
	public void afficheBD(){
		this.listeLivre.afficheBD();
	}

}
