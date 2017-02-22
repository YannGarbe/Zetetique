package lecture;

import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generalization.GeneralFile;
import generalization.TransformerFile;
import toTexte.ToTextFrom;

/**
 * Permet de gerer le filtrage de fichiers en fonction des filtres
 * @author Groupe de Zététique
 *
 */
public class FileChecker {
	private String path;
	private Map <FilenameFilter, ToTextFrom> filtres;
	
	/**
	 * Création d'un FileChecker avec son paramètre
	 * @param filter Le filtre voulu
	 */
	public FileChecker(String path) {
		this.path = path;
		this.filtres = new HashMap<FilenameFilter, ToTextFrom>();
	}
	
	/**
	 * Permet d'ajouter un filtre avec son comportement associé
	 * @param filter le filtre de fichiers
	 * @param ttf le comportement à adopter
	 */
	public void addFilter (FilenameFilter filter, ToTextFrom ttf) {
		this.filtres.put(filter, ttf);
	}
	
	/**
	 * Permet de récupérer les différents fichiers acceptés par les filtres, sous forme de liste
	 * @return une liste des fichiers sous forme de chaîne de caractères
	 */
	public List<GeneralFile> getFiles (){
		TransformerFile dir = new TransformerFile (this.path);
		List <GeneralFile> l = new ArrayList<GeneralFile>();
		for (FilenameFilter f : filtres.keySet()) {
			l.addAll(  Arrays.asList(dir.getListWithFilter(f, filtres.get(f)))  );
		}
		return l;
	}
}
