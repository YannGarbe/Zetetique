package principal;

import java.util.InputMismatchException;
import java.util.List;
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
	 * @return
	 */
	public static String readString () {
		String rep = "";
		while (rep.equals("")) {
			rep = scanner.nextLine();
		}
		return rep;
	}
}
