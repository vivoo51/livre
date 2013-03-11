/**
 * Classe de Test
 * 
 * @author Vivien Laurent
 * 
 */
public class Test {

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

}
