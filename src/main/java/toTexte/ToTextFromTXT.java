package toTexte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Cette classe désigne le comportement à adopter lorsqu'il s'agit d'un fichier txt
 * @author Groupe de Zététique
 *
 */
public class ToTextFromTXT extends ToTextFrom{

	/**
	 * TODO Modifier l'algo dessus, il ne prends pas en compte les retours chariot
	 */
	public String getText() {
		File f = new File (fichier);
		String s = "";
		String tmp = "";
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(f));
			while ((tmp = in.readLine()) != null) {
				s = s+tmp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

}
