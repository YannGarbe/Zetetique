package principal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import generalization.GeneralFile;
import lecture.*;

/**
 * Classe principale qui va transformer un fichier pdf dans le répertoire pdf en fichier txt dans le répertoire txt. Le mieux est d'y laisser un seul fichier
 * @author Groupe de Zététique
 * 
 */
public class TransformePDFTXT {
    public static void main(String[] args) throws IOException {

    	/*Appel de la classe factory*/
    	FileChecker fc = factory.FileCheckerFactory.createFileChecker();
    	
    	/*Demande à l'utilisateur quel fichier il veut analyser*/
        //GeneralFile f = Console.choice(fc.getFiles());
    	//System.out.println(f);
        
    	//do {
    	/*Demande à l'utilisateur quel analyse il veut faire*/
    	//System.out.println("\nQuelle analyse voulez-vous faire?");
    	//AnalyseOption<?> ao = Console.choice(factory.OptionsFactory.initOptions(f.getText()));
    	
    	/*Affiche le résultat de l'analyse*/
    	//System.out.println(ao.optionMain());
    	//System.out.println("---------------------------------------------------");
    	
    	
    	//System.out.println("Souhaitez-vous faire une autre analyse de ce texte?");
    	//} while (Console.YesNo());
    	
    	
    	modify(fc);
    	System.out.println("Fait.");
    }
    
    public static void modify (FileChecker fc) {
    	String name = "";
    	for (GeneralFile f : fc.getFiles() ) {
    		name = f.toString().substring(0, f.toString().length()-3);
    		System.out.println(name);
    		File tFile = new File ("LesTxt/"+name+"txt");
    		try {
				tFile.createNewFile();
				PrintWriter out = new PrintWriter("LesTxt/"+name+"txt");
				out.println(f.getText());
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
    		
    	}
    }
}
