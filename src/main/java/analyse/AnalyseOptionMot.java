package analyse;

import principal.Console;

/**
 * Cette option permet de compte le nombre d'occurrence d'un certain mot
 * @author Groupe de Zététique
 *
 */
public class AnalyseOptionMot extends AnalyseOption<Integer>{

	public AnalyseOptionMot(String texte) {
		super(texte);
	}

	public String optionMain() {
		System.out.println("Quel mot voulez-vous rechercher?");
		String mot = Console.readString();
		return "Il y a "+analyse(mot)+" occurences du mot <"+mot+"> dans ce texte.";
		
	}

	public String toString() {
		return "Rechercher le nombre d'occurence d'un certain mot";
	}

	public Integer analyse() {
		return null;
	}
	
	public Integer analyse(String mot) {
		int nbOcc = 0;
		texte = texte+"i";
		String [] tab = texte.split(mot);
		nbOcc = tab.length-1;
		return nbOcc;
	}

}
