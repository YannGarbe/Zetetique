package analyse;

/**
 * Cette option permet de compter le nombre de ligne du texte
 * @author Groupe de Zététique
 *
 */
public class AnalyseOptionLignes extends AnalyseOption<Integer> {

	public AnalyseOptionLignes(String texte) {
		super(texte);
	}

	public String optionMain() {
		return "Le nombre de lignes de ce document est "+this.analyse()+".\n";
	}

	public String toString() {
		return "Compter le nombre de lignes";
	}

	public Integer analyse() {
		int nbLigne = 0;
		
		for (int i = 0 ; i < texte.length() ; i++) {
			if (texte.charAt(i) == '\n')
				nbLigne ++;
		}
		return nbLigne;
	}
	
	

}
