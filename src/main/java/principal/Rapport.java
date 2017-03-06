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
		
		System.out.println("Début de l'analyse");
		FileChecker fc = factory.FileCheckerFactory.createReportFileChecker();
		String rep = "";
		
		AnalyseOptionAssociation assoc;
		for (GeneralFile f : fc.getFiles()) {
			f.setPathAnalyse("LesTxt/"+f);
			rep += "Pour le cas de "+f.toString()+":\n";
			
			assoc = new AnalyseOptionAssociation(f.getText());
			rep += "[France] : \n"+Console.printMap(assoc.analyse("France"))+"\n\n";
			
			rep += "[Politique] : \n"+Console.printMap(assoc.analyse("Politique"))+"\n\n";
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
	}
}
