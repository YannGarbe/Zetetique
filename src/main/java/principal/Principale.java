package principal;

import java.io.IOException;
import analyse.*;
import generalization.GeneralFile;
import lecture.*;

/**
 * Classe principale du projet, il contient le main
 * @author Groupe de Zététique
 * 
 */
public class Principale {
    public static void main(String[] args) throws IOException {

    	/*Appel de la classe factory*/
    	FileChecker fc = factory.FileCheckerFactory.createFileChecker();
    	
    	/*Demande à l'utilisateur quel fichier il veut analyser*/
        GeneralFile f = Console.choice(fc.getFiles());
    	System.out.println(f);
        
    	do {
    	/*Demande à l'utilisateur quel analyse il veut faire*/
    	System.out.println("\nQuelle analyse voulez-vous faire?");
    	AnalyseOption<?> ao = Console.choice(factory.OptionsFactory.initOptions(f.getText()));
    	
    	/*Affiche le résultat de l'analyse*/
    	System.out.println(ao.optionMain());
    	System.out.println("---------------------------------------------------");
    	
    	
    	System.out.println("Souhaitez-vous faire une autre analyse de ce texte?");
    	} while (Console.YesNo());
    }
}
