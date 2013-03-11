/**
 * Cette classe représente un Roman, type hérité de Livre
 */

/**
 * @author Vivien Laurent
 *
 */
public class Roman extends Livre {
	
	
	/**
	 * @param t Titre du Roman
	 * @param a Auteur du Roman
	 */
	public Roman(String t, String a) {
		super(t, a);
		
	}

	/* (non-Javadoc)
	 * @see Livre#categorie()
	 */
	@Override
	public String categorie() {
		return "Roman";
	}

}
