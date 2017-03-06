package generalization;

import toTexte.ToTextFrom;

/**
 * Cette classe permet stocker un nom de fichier avec son comportement permettant d'obtenir son texte
 * @author Groupe de Zététique
 *
 */
public class GeneralFile {
	
	private String name;
	private ToTextFrom ttf;
	
	/**
	 * Crée un GeneralFile avec son nom et son comportement
	 * @param name le nom du fichier
	 * @param ttf le comportement à adopter en fonction du fichier
	 */
	public GeneralFile(String name, ToTextFrom ttf) {
		this.name = name;
		this.ttf = ttf;
	}
	
	/**
	 * Permet de récupérer le contenu du fichier en fonction de son comportement
	 * @return le contenu du fichier en chaîne de caractère
	 */
	public String getText () {
		return this.ttf.getText();
	}
	
	/**
	 * Modifie le chemin d'analyse
	 * @param path le nouveau chemin
	 */
	public void setPathAnalyse(String path) {
		this.ttf.setFile(path);
	}
	
	public String toString() {
		return this.name;
	}
}