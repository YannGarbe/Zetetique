package generalization;

import java.io.File;
import java.io.FilenameFilter;

import toTexte.ToTextFrom;

/**
 * Cette classe adopte le même comportement que la classe File.
 * Cependant, elle y ajoute une nouvelle méthode qui permet de récupérer les fichiers filtrés en tant que 'GeneralFile'
 * @author Groupe de zététique
 *
 */
@SuppressWarnings("serial")
public class TransformerFile extends File {

	public TransformerFile(String name) {
		super(name);
	}

	/**
	 * En partant du même principe que la méthode list, cette méthode renvoie à la place un tableau de 'GeneralFile', filtré par le FilenameFilter voulu.
	 * Deplus, le GeneralFile crée est associé avec le comportement à adopter, passé en paramètre 
	 * @param filtre le filtre de fichiers
	 * @param ttf le comportement à adopter pour les dossiers filtrés
	 * @return le tableau de fichiers filtrés
	 */
	public GeneralFile [] getListWithFilter(FilenameFilter filtre, ToTextFrom ttf) {
		
		GeneralFile [] tab = new GeneralFile[this.list(filtre).length];
		
		for (int i = 0 ; i < this.list(filtre).length ; i++) {
			ttf.setFile("LesPdf/"+this.list(filtre)[i]);
			tab[i] = new GeneralFile (this.list(filtre)[i], ttf);
		}
		return tab;
	}
}
