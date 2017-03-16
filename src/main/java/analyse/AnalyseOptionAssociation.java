package analyse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import principal.Console;
import principal.Tools;

public class AnalyseOptionAssociation extends AnalyseOption<Map<String, Integer>>{

	private Map<String, Integer> map;
	
	public AnalyseOptionAssociation(String texte) {
		super(texte);
		this.map = new HashMap<String, Integer>();
	}

	public String optionMain() {
		System.out.println("Quel mot voulez-vous rechercher l'association?");
		String mot = Console.readString();
		
		System.out.println("[ Mot : Nombre d'occurences]");
		return Console.printMap(analyse(mot), 10, Tools.getMaxWords(texte));
	}

	public Map<String, Integer> analyse() {		
		return null;
	}

	public Map<String, Integer> analyse(String mot) {
		String tmp = "";
		mot = mot.toLowerCase();
	
		
		List <String> liste = Tools.splitWordsToList(texte);
		for (int i = 0 ; i < liste.size() ; i++) {
			if (mot.equals(liste.get(i).toLowerCase()) && i == 0) {
				tmp = liste.get(i+1).toLowerCase();
				uniqPut(tmp);
			} else if (mot.equals(liste.get(i).toLowerCase()) && i == liste.size()-1) {
				tmp = liste.get(i-1).toLowerCase();
				uniqPut(tmp);
			} else if (mot.equals(liste.get(i).toLowerCase())) {
				tmp = liste.get(i+1).toLowerCase();
				uniqPut(tmp);
				tmp = liste.get(i-1).toLowerCase();
				uniqPut(tmp);
			}
			
		}
		
		return map;
	}
	
	/**
	 * Ajoute dans le mot dans la map s'il n'a pas déjà été ajouté. Sinon, son compteur s'incrémente
	 * @param map
	 * @param mot
	 */
	private void uniqPut(String mot) {
		if (!map.containsKey(mot)) 
			map.put(mot, 1);
		else 
			map.replace(mot, map.get(mot)+1);
	}

	public String toString() {
		return "Rechercher les 5 mots les plus associés avec celui choisi";
	}

}
