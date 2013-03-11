
/**
 * @author Vivien Laurent
 *
 */
public abstract class BD extends Livre {
	/**
	 * Chaine de caracteres representant le dessinateur de la bande dessinee
	 */
	private String dessinateur;
	
	/**
	 * @param t Titre de la BD
	 * @param a Auteur de la BD
	 * @param d dessinateur de la BD
	 */
	public BD(String t, String a, String d) {
		super(t, a);
		this.dessinateur=d;
		
	}

	/**
	 * @return le dessinateur
	 */
	public String getDessinateur() {
		return dessinateur;
	}


}
