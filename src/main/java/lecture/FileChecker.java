package lecture;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Permet de gerer le filtrage de fichier en fonction du filtre
 * @author Groupe de Zététique
 *
 */
public class FileChecker {
	private String path;
	private FilenameFilter filter;
	
	/**
	 * Création d'un FileChecker avec ses paramètres
	 * @param filter Le filtre voulu
	 * @param path Le chemin du répertoire voulu
	 */
	public FileChecker(FilenameFilter filter, String path) {
		this.path = path;
		this.filter = filter;
	}
	
	/**
	 * Permet de récupérer les différents fichier acceptés par le filtre
	 * @return une liste des fichiers sous forme de chaîne de caractères
	 */
	public List<String> getFiles (){
		File dir = new File (this.path);
		return Arrays.asList(dir.list(this.filter));
	}
}
