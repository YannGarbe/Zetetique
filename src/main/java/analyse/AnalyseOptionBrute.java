package analyse;

/**
 * Cette option permet d'afficher tout le texte
 * @author Groupe de Zététique
 *
 */
public class AnalyseOptionBrute extends AnalyseOption<String>{

	public AnalyseOptionBrute(String texte) {
		super(texte);
	}

	public String optionMain() {
		return analyse();
	}

	public String toString() {
		return "Afficher entièrement le texte";
	}

	public String analyse() {
		return this.texte;
	}

}
