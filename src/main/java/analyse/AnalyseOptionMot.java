package analyse;

import java.util.List;

import principal.Console;
import principal.Tools;

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
		return "Il y a "+analyse(mot)+" occurences du mot <"+mot+"> dans ce texte sur "+Tools.splitWordsToList(texte).size()+" mots.";
		
	}

	public String toString() {
		return "Rechercher le nombre d'occurences d'un certain mot";
	}

	public Integer analyse() {
		return null;
	}
	
	public Integer analyse(String mot) {
		int nbOcc = 0;
		List <String> liste = Tools.splitWordsToList(texte);
		for(String s: liste) {
			if(mot.toLowerCase().equals(s.toLowerCase()))
				nbOcc++;
		}
		
		return nbOcc;
	}

}
