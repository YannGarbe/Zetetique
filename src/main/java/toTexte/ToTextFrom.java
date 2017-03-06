package toTexte;

/**
 * Cette classe abstraite désigne un comportement à adopter en fonction du fichier
 * @author Groupe de Zététique
 *
 */
public abstract class ToTextFrom {

	protected String fichier;
	public ToTextFrom () {
		
	}
	/**
	 * Crée un type de comportement à adopter selon le format
	 * @param fichier le fichier choisi à analyser
	 */
	public ToTextFrom (String fichier) {
		this.fichier = "LesPdf/"+fichier;
	}
	
	public void setFile (String fichier) {
		this.fichier = fichier;
	}
	/**
	 * Permet de récupérer le texte du fichier
	 * @return le texte du fichier
	 */
	public abstract String getText();
}
