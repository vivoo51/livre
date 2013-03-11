/**
 * @author Vivien Laurent
 * 
 */
public class Maillon {
	/**
	 * Attribut Maillon representant le successeur du maillon courant
	 */
	private Maillon suc;

	/**
	 * Attribut Livre representant le livre stocke dans le maillon
	 */
	private Livre valeur;

	/**
	 * @param msuc
	 *            maillon successeur
	 * @param val
	 *            Livre a stocker dans le maillon
	 */
	public Maillon(Maillon msuc, Livre val) {
		this.suc = msuc;
		this.valeur = val;
	}

	/**
	 * @return le maillon successeur
	 */
	public Maillon getSuc() {
		return suc;
	}

	/**
	 * @return le livre de la position courante
	 */
	public Livre getValeur() {
		return valeur;
	}

	/**
	 * @param suc the suc to set
	 */
	public void setSuc(Maillon suc) {
		this.suc = suc;
	}

}
