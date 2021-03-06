package factory;

import filters.FileNameFilterEndsPDF;
import filters.FileNameFilterEndsTXT;
import lecture.FileChecker;
import toTexte.ToTextFromPDF;
import toTexte.ToTextFromTXT;

/**
 * Cette classe factory initialise l'ajout de filtres de fichiers (qui pourra être mis à jour) 
 * @author Groupe de Zététique
 *
 */
public class FileCheckerFactory {

	/**
	 * Crée un FileChecker avec l'ajout de filtres
	 * @return le FileChecker ajouté
	 */
	public static FileChecker createFileChecker() {
		/*Création du gestionnaire de filtrage de fichiers*/
    	FileChecker fc = new FileChecker("LesPdf");
    	
    	/*Section d'ajout de filtres pour les fichiers */
    	fc.addFilter(new FileNameFilterEndsPDF(), new ToTextFromPDF());
    	/*Fin de la section*/
    	
    	return fc;
	}
	
	/**
	 * Crée un FileChecker pour le rapport
	 * @return le FileChecker
	 */
	public static FileChecker createReportFileChecker() {
		/*Création du gestionnaire de filtrage de fichiers*/
    	FileChecker fc = new FileChecker("LesTxt");
    	
    	/*Section d'ajout de filtres pour les fichiers */
    	fc.addFilter(new FileNameFilterEndsTXT(), new ToTextFromTXT());
    	/*Fin de la section*/
    	
    	return fc;
	}
	
}
