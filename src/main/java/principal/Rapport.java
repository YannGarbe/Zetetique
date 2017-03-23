package principal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import analyse.*;
import generalization.GeneralFile;
import lecture.FileChecker;

/**
 * Classe principale à lancer afin de 
 * @author Groupe de Zététique
 *
 */
public class Rapport {

	
	public static void main (String [] args) {
		
		System.out.println("Début de l'analyse...");
		FileChecker fc = factory.FileCheckerFactory.createReportFileChecker();
		String rep = "";
		int cpt = 0;
		/*---------------------------*/
		AnalyseOptionAssociation assoc;
		AnalyseOptionWordOccurence wO;
		//AnalyseOptionDoubleWordOccurence dwO;
		AnalyseOptionMot m;
		/*---------------------------*/

		for (GeneralFile f : fc.getFiles()) {
			System.out.println("Fichier '"+f.toString()+"' \t\t ("+cpt+"/"+fc.getFiles().size()+")");
			
			f.setPathAnalyse("LesTxt/"+f);
			//rep += "Pour le cas de "+f.toString()+":\n";
			
			/*-----------------------------------------------*/
			assoc = new AnalyseOptionAssociation(f.getText());
			wO = new AnalyseOptionWordOccurence(f.getText());
			//dwO = new AnalyseOptionDoubleWordOccurence(f.getText());
			m = new AnalyseOptionMot(f.getText());
			/*-----------------------------------------------*/
			
			//rep += "[France] (Sur "+ Tools.getMaxWords(f.getText())+" mots): \n"+Console.printMap(  Tools.removeUselessMap((assoc.analyse("France")) ), 10, Tools.getMaxWords(f.getText()) )+"\n\n";
			
			rep += Console.printPythonPerCentMap(  Tools.removeUselessMap(wO.analyse()), 10,Tools.getMaxWords(f.getText()),  f.toString().substring(0, f.toString().length()-4));
			
			//rep += "[Femmes] : \n"+m.analyse("Femmes")+" Sur "+Tools.getMaxWords(f.getText())+"\n\n";
			
			//rep += "(Sur "+ Tools.getMaxWords(f.getText())+" mots): \n"+ Console.printMap( Tools.removeUselessMap(wO.analyse()), 10, Tools.getMaxWords(f.getText()))+"\n\n";
			
			/*----------------------TEST ZONE--------------------------*/
			//rep += Console.printMap(Tools.removeUselessMap(dwO.analyse()), 10, Tools.getMaxWords(f.getText()));
			cpt++;
		}
		File f = new File ("RapportAnalyse.txt");
		try {
			f.createNewFile();
			PrintWriter out = new PrintWriter("RapportAnalyse.txt");
			out.println(rep);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("("+cpt+"/"+fc.getFiles().size()+") Fin de l'analyse.");
	}
}
