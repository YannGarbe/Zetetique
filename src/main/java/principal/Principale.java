package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import analyse.*;
import filters.*;
import generalization.GeneralFile;
import lecture.*;
import toTexte.*;

/**
 * Classe principale du projet, il contient le main
 * @author Groupe de Zététique
 * 
 */
public class Principale {
    public static void main(String[] args) throws IOException {

    	/*Création du gestionnaire de filtrage de fichiers*/
    	FileChecker fc = new FileChecker("Programmes");
    	
    	/*Section d'ajout de filtres pour les fichiers */
    	fc.addFilter(new FileNameFilterEndsPDF(), new ToTextFromPDF());
    	fc.addFilter(new FileNameFilterEndsTXT(), new ToTextFromTXT());
    	/*Fin de la section*/
    	
    	/*Demande à l'utilisateur quel fichier il veut analyser*/
        GeneralFile f = Console.choice(fc.getFiles());
    	System.out.println(f);
        
    	/*Demande à l'utilisateur quel analyse il veut faire*/
    	System.out.println("Quelle analyse voulez-vous faire?");
    	AnalyseOption ao = Console.choice(initOptions(f.getText()));
    	
    	/*Affiche le résultat de l'analyse*/
    	System.out.println(ao.Analyse());
    }
    
    /**
     * Initialise une liste d'options pour analyser le texte
     * @param texte le texte
     * @return la liste d'options
     */
    public static List <AnalyseOption> initOptions (String texte) {
    	List <AnalyseOption> liste = new ArrayList<AnalyseOption>();
    	liste.add(new AnalyseOptionBrute(texte));
    	liste.add(new AnalyseOptionLignes(texte));
    	liste.add(new AnalyseOptionMot(texte));
    	return liste;
    }
}
