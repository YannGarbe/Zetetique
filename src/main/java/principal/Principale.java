package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import analyse.*;
import filters.*;
import lecture.*;
import toTexte.*;

/**
 * Classe principale du projet, il contient le main
 * @author Groupe de Zététique
 * 
 */
public class Principale {
    public static void main(String[] args) throws IOException {

    	FileChecker fc = new FileChecker(new FileNameFilterEndsPDF(), "Programmes"); 
        String s = Console.choice(fc.getFiles());
    	System.out.println(s);
    	
    	ToTexteFrom ttf = new ToTexteFromPDF(s);
        
    	System.out.println("Quelle analyse voulez-vous faire?");
    	AnalyseOption ao = Console.choice(initOptions(ttf.getTexte()));
    	
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
