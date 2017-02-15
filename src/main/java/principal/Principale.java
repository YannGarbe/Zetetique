package principal;

import java.io.IOException;

import lecture.PDFManager;

/**
 * Hello world!
 *
 */
public class Principale 
{
    public static void main(String[] args) throws IOException {

        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("Tests/CR.pdf");
        System.out.println(pdfManager.ToText()); 
    }
    
}
