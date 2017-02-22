package toTexte;

import java.io.IOException;

import lecture.PDFManager;

/**
 * Cette classe désigne le comportement à adopter lorsqu'il s'agit d'un fichier pdf
 * @author Groupe de Zététique
 *
 */
public class ToTextFromPDF extends ToTextFrom{

	public String getText() {
		PDFManager pdfManager = new PDFManager();
		pdfManager.setFilePath(fichier);
		try {
			return pdfManager.ToText();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
