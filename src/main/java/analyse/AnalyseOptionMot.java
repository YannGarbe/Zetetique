package analyse;

import principal.Console;
import values.Value;

/**
 * Cette option permet de compte le nombre d'occurrence d'un certain mot
 * @author Groupe de Zététique
 *
 */
public class AnalyseOptionMot extends AnalyseOption{

	public AnalyseOptionMot(String texte) {
		super(texte);
	}

	public String getAnalyse() {
		int nbOcc = 0;
		
		System.out.println("Quel mot voulez-vous rechercher?");
		String mot = Console.readString();
		
		texte = texte+"i";
		String [] tab = texte.split(mot);
		nbOcc = tab.length-1;
		
		return "Il y a "+nbOcc+" occurences du mot <"+mot+"> dans ce texte.";
		
	}

	public String toString() {
		return "Rechercher le nombre d'occurence d'un certain mot";
	}

	public Value Analyse() {
		return null;
	}

}
