package factory;

import java.util.ArrayList;
import java.util.List;

import analyse.AnalyseOption;
import analyse.AnalyseOptionBrute;
import analyse.AnalyseOptionLignes;
import analyse.AnalyseOptionMot;

/**
 * Cette classe factory initialise une liste d'option (qui pourra être mise à jour pour chaque nouvelle option)
 * @author Groupe de Zététique
 *
 */
public class OptionsFactory {
	
    /**
     * Initialise une liste d'options pour analyser le texte
     * @param texte le texte
     * @return la liste d'options
     */
    @SuppressWarnings("rawtypes")
	public static List <AnalyseOption> initOptions (String texte) {
    	List <AnalyseOption> liste = new ArrayList<AnalyseOption>();
    	liste.add(new AnalyseOptionBrute(texte));
    	liste.add(new AnalyseOptionLignes(texte));
    	liste.add(new AnalyseOptionMot(texte));
    	return liste;
    }
}
