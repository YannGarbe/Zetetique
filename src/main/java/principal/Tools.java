package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Ensemble de méthodes outils.
 * @author Groupe de Zetetique
 *
 */
public class Tools {
		
	/**
	 * Fusionne deux listes. Les doublons ne sont pas inclus.
	 * @param l1 La première liste
	 * @param l2 La deuxième liste
	 * @return la fusion des deux listes
	 */
	public static ArrayList<String> uniqConcat(List<String> l1, List<String> l2) {
		ArrayList<String> l3 = new ArrayList<String>();
		l3.addAll(l1);
		
		for (String s : l2) {
			System.out.println(s);
			if (!l3.contains(s)) {
				l3.add(s);
			}
		}
		return l3;
	}

	/**
	 * Découpe la chaîne de caractères passée en paramètre en liste de mots
	 * @param s La chaîne de caractères à découper
	 * @return La liste de mots
	 */
	public static List<String> splitWordsToList (String s) {
		String [] words = s.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
		return Arrays.asList(words);
	}
	
	/**
	 * Cette méthode enlève les mots parasites présents dans la map de mots
	 * @param map la map à analyser
	 * @return la map nettoyée
	 */
	public static Map<String, Integer> removeBugs(Map<String, Integer> map) {
		/*
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			tmpMot = entry.getKey();
			tmpInt = entry.getValue();
			if(tmpInt <= 1 
					|| tmpMot.matches("le|la|les|un|uns|une|unes|de|des|du|a|à|au|aux")){
				map.remove(tmpMot);
			}
		}
		*/
		return map;
	}
	
}
