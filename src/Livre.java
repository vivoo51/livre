/**Cette classe représente l'objet Livre
 * 
 */

/**
 * @author Vivien Laurent
 * 
 */
public abstract class Livre {

	/**
	 * Chaîne de caractères codant le titre du Livre.
	 */
	private String titre;

	/**
	 * Chaîne de caractères codant le nom de l'auteur du Livre.
	 */
	private String auteur;

	/**
	 * Numero du dernier livre créé. Si egal à 0, aucun livre.
	 */
	private static int lastId = 0;

	/**
	 * Numero identifiant le livre
	 */
	private int id;

	/**
	 * Constructeur initialisant un livre. Initialise les attributs titre et
	 * auteur, et incrémente le compteur numero
	 * 
	 * @param t
	 *            titre du Livre
	 * @param a
	 *            auteur du Livre
	 */
	public Livre(String t, String a) {
		this.titre = t;
		this.auteur = a;
		id=lastId++;

	}

	// Methodes

	/**
	 * @return une chaine de caractères correspondant au type du Livre
	 */
	public abstract String categorie();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return categorie() + ";" + id + ";" + titre + ";" + auteur;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @return the lastId
	 */
	public static int getLastId() {
		return lastId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
