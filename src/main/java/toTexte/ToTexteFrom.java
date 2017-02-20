package toTexte;

/**
 * Cette classe abstraite désigne un comportement à adopter en fonction du fichier
 * @author Groupe de Zététique
 *
 */
public abstract class ToTexteFrom {

	protected String fichier;

	public ToTexteFrom (String fichier) {
		this.fichier = fichier;
	}
	
	public abstract String getTexte();
}
