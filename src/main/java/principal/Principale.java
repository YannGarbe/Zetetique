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
        
    	/*Demande à l'utilisateur quel analyse il veut faire*/
    	System.out.println("Quelle analyse voulez-vous faire?");
    	AnalyseOption ao = Console.choice(factory.OptionsFactory.initOptions(f.getText()));
    	
    	/*Affiche le résultat de l'analyse*/
    	System.out.println(ao.optionMain());
    }
}
