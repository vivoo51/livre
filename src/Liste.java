/**
 * @author Vivien Laurent
 * 
 */
public class Liste {

	/**
	 * Attribut representant le premier maillon de la liste. Null si la liste
	 * est vide.
	 */
	private Maillon tete;

	private int nb_element;

	/**
	 * Constructeur initialisant une liste vide
	 */
	public Liste() {
		this.tete = null;
		this.nb_element = 0;
	}

	/**
	 * Methode permettant l'ajout d'un livre dans la liste
	 * 
	 * @param l
	 *            Livre a ajouter
	 */
	public void ajouter(Livre l) {
		if (tete == null)
			this.tete = new Maillon(null, l);
		else {
			this.tete = new Maillon(tete, l);
		}
		nb_element++;
	}

	/**
	 * Methode permettant la suppression d'un livre dans la liste
	 * 
	 * @param titre
	 *            Titre du film à supprimer
	 * @return Faux en cas d'erreur, Vrai en cas de succes
	 */
	public boolean supprime(String titre) {
		// Initialisation
		boolean trouve = false;

		Maillon maillonCourant = tete;
		// Recherche
		// test du cas particulier, suppression en tete de liste
		if (tete.getValeur().getTitre() == titre) {
			tete = tete.getSuc();
			return true;
		}
		// Parcours de la liste tant que le maillon suivant existe et que
		// l'element n'a pas ete trouve
		while (maillonCourant.getSuc() != null && !trouve) {
			// Si le maillon contient le livre, trouve passe à vrai
			if (maillonCourant.getSuc().getValeur().getTitre() == titre)
				trouve = true;
			// Memorisation du maillon
			
			// décalage de la position courante
			maillonCourant = maillonCourant.getSuc();
		}
		// Suppression
		// maillonTemp.setSuc(maillonCourant);
		// On retourne vrai si l'element a été trouvé et supprimé, faux le cas
		// contraire

		// MAJ du nombre d elements
		nb_element--;
		return trouve;
	}

	public String toString() {
		Maillon m = tete;
		StringBuilder s = new StringBuilder();
		s.append(nb_element + "\n");
		// parcours de la liste
		while (m != null) {
			s.append(m.getValeur().toString() + "\n");
			m = m.getSuc();
		}
		return s.toString();
	}

	public String afficheBD() {
		int n = 0;
		Maillon m = tete;
		StringBuilder s = new StringBuilder();
		while (m != null) {
			if (m.getValeur().categorie() == "BD") {
				n++;
				s.append((m.getValeur().toString() + "\n"));
			}
			m = m.getSuc();
		}
		return n + "\n" + s.toString();
	}
}
