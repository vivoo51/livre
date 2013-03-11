/**
 * 
 */

/**
 * @author Vivien Laurent
 *
 */
public class Manga extends BD {

	/**
	 * @param t Titre du Manga
	 * @param a Auteur du Manga
	 * @param d Dessinateur du Manga
	 */
	public Manga(String t, String a, String d) {
		super(t, a, d);
	}

	/* (non-Javadoc)
	 * @see Livre#categorie()
	 */
	
	@Override
	public String categorie() {
		// TODO Auto-generated method stub
		return "Manga";
	}

}

