package analyse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import principal.Tools;

public class AnalyseOptionDoubleWordOccurence extends AnalyseOption<Map<String, Integer>>{

	private Map<String, Integer> map;
	
	public AnalyseOptionDoubleWordOccurence(String texte) {
		super(texte);
		this.map = new HashMap<String, Integer>();
	}

	@Override
	public String optionMain() {
		return null;
	}

	@Override
	public Map<String, Integer> analyse() {
		//List <String> liste = Tools.removeUselessBugs(Tools.splitWordsToList(texte.toLowerCase()));
		List <String> liste = Tools.splitWordsToList(texte.toLowerCase());
		String tmpMot, tmpPrec, tmpSuiv;
		for(int i=1; i < liste.size()-1; i++){
			tmpMot = liste.get(i);
			tmpPrec = liste.get(i - 1);
			tmpSuiv = liste.get(i + 1);
			
			if(!map.containsKey(tmpPrec + " " + tmpMot))
				map.put(tmpPrec + " " + tmpMot, 1);
			else 
				map.replace(tmpPrec + " " + tmpMot, map.get(tmpPrec + " " + tmpMot) + 1);
			
			if(!map.containsKey(tmpMot + " " + tmpSuiv)) 
				map.put(tmpMot + " " + tmpSuiv, 1);
			else 
				map.replace(tmpMot + " " + tmpSuiv, map.get(tmpMot + " " + tmpSuiv) + 1);
		}
		
		//Tools.removeBugs(map);
		return map;
	}

	@Override
	public String toString() {
		return null;
	}

}
