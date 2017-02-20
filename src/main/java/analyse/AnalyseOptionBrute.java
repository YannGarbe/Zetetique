package analyse;

/**
 * Cette option permet d'afficher tout le texte
 * @author Groupe de Zététique
 *
 */
public class AnalyseOptionBrute extends AnalyseOption{

	public AnalyseOptionBrute(String texte) {
		super(texte);
	}

	public String Analyse() {
		return texte;
	}

	@Override
	public String toString() {
		return "Afficher entièrement le texte";
	}

}
