package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Cette classe permet de faire des match avec des mots en différentes catégories
 * @author Groupe de Zetetique
 *
 */
public class Dictionnary {

	public static boolean isPreposition(String s) {
		return (s.matches("à|dans|par|pour|en|vers|avec|de|sans|sous|sur|chez|malgré"));
	}
	
	public static boolean isConjCoord(String s) {
		return (s.matches("mais|ou|et|donc|or|ni|car"));
	}
	
	public static boolean isDeter(String s) {
		return (s.matches("un|une|des|le|la|les|uns|unes|l'"));
	}
	
	public static boolean isQu (String s) {
		return (s.matches("qui|que|quoi|dont|où|lequel|laquelle|lesquels"));
	}
	
	public static boolean isPronom(String s) {
		return (s.matches("je|tu|il|elle|on|nous|vous|ils|elles|ce|cette|ces|mon|ton|son|nos|vos|leur|leurs|notre|votre|"
				+ "ma|ta|sa|son|ses|mes"));
	}
	
	public static boolean isOther(String s) {
		return s.matches("aux|au|du|auquel|desquels|duquel|auxquels|afin|ne|est");
	}
	
	public static boolean isTMP (String s) {
		//return s.matches("plus|pas|sont|tout|tous|entre|aussi|fi|faut|doit|comme|sera");
		return false;
	}
	/*-----------------------------------*/
	public static boolean isWriggle(String s) {
		return isPreposition(s) || isConjCoord(s) || isDeter(s) || isQu(s) || isPronom(s) || isOther(s) || isTMP(s);
		//return false;
	}
	
	@SuppressWarnings("resource")
	public static boolean isFrench (String s) {
		File f = new File ("Librairies/liste_francais.txt");
		String tmp = "";
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(f));
			while ((tmp = in.readLine()) != null) {
				if (tmp.equals(s))
					return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
