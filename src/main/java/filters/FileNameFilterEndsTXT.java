package filters;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Ce filtre de fichier permet de ne prendre que les fichiers .txt du Programme
 * @author Groupe de Zététique
 *
 */
public class FileNameFilterEndsTXT implements FilenameFilter {

	public boolean accept(File dir, String name) {
		return name.endsWith(".txt");
	}
	
}
