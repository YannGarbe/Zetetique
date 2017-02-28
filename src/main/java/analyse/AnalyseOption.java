package analyse;

/**
 * Classe abtraite afin de gérer les classes d'analyse sémantique
 * @author Groupe de Zététique
 *
 */
public abstract class AnalyseOption {
	protected String texte;
	
	/**
	 * Crée une Option d'analyse
	 * @param texte le texte à analyser
	 */
	public AnalyseOption (String texte) {
		this.texte = texte;
	}
	
	/**
	 * Analyse le texte en fonction de l'option
	 * @return Le message de fin d'analyse
	 */
	public abstract String getAnalyse();
	
	/**
	 * Affiche une description de l'option
	 * @return La description de l'option
	 */
	public abstract String toString ();
}
