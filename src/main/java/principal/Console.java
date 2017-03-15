package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Cette classe contient des fonctions utiles pour les interactions avec les utilisateurs
 * @author Groupe de Zététique
 *
 */
public class Console 
{
	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * Prend une liste générique d'éléments, les affiches et retourne l'élément choisi.
	 * @param liste
	 * @return
	 */
	public static <T> T choice (List <T> liste) {
		for (int i = 0 ; i < liste.size() ; i++)
			System.out.println(i+") "+liste.get(i).toString());
		
		System.out.println("Quel est votre choix?");
		return liste.get(readInt(liste.size()));
	}
	
	/**
	 * Permet de demander un choix oui/non à l'utilisateur
	 * @return true si oui, false si faux
	 */
	public static boolean YesNo() {
		List<String> l = new ArrayList<String>();
		l.add("Oui");
		l.add("Non");
		return choice(l).equals("Oui");
	}
	/**10
	 * read an integer from 0 (included) to n (excluded) from standard input
	 * input is repeated as long as it is not correct
	 * 
	 * @param n the upper (excluded) bound for input
	 * @return the valid read input 
	 */
	public static int readInt(int n) {
		int input = -1;
		while (input < 0 || input >= n) {
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException	e) {
				// consume the input (that is not an integer)
				scanner.skip(".*");
			}
		} 
		return input;
	}
	
	/**
	 * Lit une chaîne de caractère écrite par l'utilisateur
	 * @return la chaîne de caractère enregistrée
	 */
	public static String readString () {
		String rep = "";
		while (rep.equals("")) {
			rep = scanner.nextLine();
		}
		return rep;
	}
	
	/**
	 * Permet d'afficher une map selon certaines normes pour un programme python
	 * @return
	 */
	public static String printPythonMap (Map <String, Integer> map, int max, String nom) {
		String rep = nom+" ";
		List<Integer> ln = new ArrayList<Integer>();
		
		/*Récupération des valeurs*/
		for(Integer i : map.values()) {
			ln.add(i);
		}
		/*On trie la liste*/
		Collections.sort(ln);
		Collections.reverse(ln);
		
		int i = 0;
		int cpt = 0;
		
		while (i < ln.size() && cpt < max) {
			Integer j = new Integer(ln.get(i));
			for(String o : map.keySet()) {
				if(j.equals(map.get(o)) && cpt < max ) {
					rep+= o+":"+j+" ";
					map.replace(o, -1);
					cpt++;
				}
			}
			i++;
		}
		return rep.substring(0, rep.length()-1)+"\n";
	}
	
	/**
	 * Permet un affichage plus élégant d'une map
	 * @param map la map à afficher
	 * @return la chaîne de caractère d'affichage
	 */
	public static String printMap(Map<String, Integer> map, int max) {
		String rep = "";
		List<Integer> ln = new ArrayList<Integer>();
		
		/*Récupération des valeurs*/
		for(Integer i : map.values()) {
			ln.add(i);
		}
		/*On trie la liste*/
		Collections.sort(ln);
		Collections.reverse(ln);
		
		int i = 0;
		int cpt = 0;
		
		while (i < ln.size() && cpt < max) {
			Integer j = new Integer(ln.get(i));
			for(String o : map.keySet()) {
				if(j.equals(map.get(o)) && cpt < max ) {
					rep+= "[ '"+o+"' : "+j+" ]\n";
					map.replace(o, -1);
					cpt++;
				}
			}
			i++;
		}
		return rep;
	}
}
