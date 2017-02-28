package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ensemble de méthodes sur des chaînes de caractères.
 * @author Groupe de Zetetique
 *
 */
public class StringTools {
		
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
}
