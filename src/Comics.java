/**
 * 
 */

/**
 * @author Vivien Laurent
 *
 */
public class Comics extends BD {

	/**
	 * @param t Titre du Comics
	 * @param a Auteur du Comics
	 * @param d Dessinateur du Comics
	 */
	public Comics(String t, String a, String d) {
		super(t, a, d);
		
	}

	/* (non-Javadoc)
	 * @see Livre#categorie()
	 */
	@Override
	public String categorie() {
		
		return "Comics";
	}

}
