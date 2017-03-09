package analyse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import principal.Tools;

public class AnalyseOptionWordOccurence extends AnalyseOption<Map<String, Integer>> {

	private Map<String, Integer> map;
	
	public AnalyseOptionWordOccurence(String texte) {
		super(texte);
		this.map = new HashMap<String, Integer>();
	}

	@Override
	public String optionMain() {
		return null;
	}

	@Override
	public Map<String, Integer> analyse() {
		List <String> liste = Tools.removeUselessBugs(Tools.splitWordsToList(texte.toLowerCase()));
		String tmpMot;
		for(int i=0; i < liste.size(); i++){
			tmpMot = liste.get(i);
			if(!map.containsKey(tmpMot))
				map.put(tmpMot, 1);
			else 
				map.replace(tmpMot, map.get(tmpMot)+1);
		}
		return map;
	}

	@Override
	public String toString() {
		return "Chercher le nombre d'occurence de chaque mot";
	}

}
