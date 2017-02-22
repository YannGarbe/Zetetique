package genealizationTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import filters.FileNameFilterEndsPDF;
import generalization.TransformerFile;
import toTexte.ToTextFromPDF;

public class TransformerTest {

	private TransformerFile trans;
	
	@Before
	public void init() {
		this.trans = new TransformerFile ("Programmes");
	}
	
	@Test
	public void countTransformerTest() {
		int nb = this.trans.getListWithFilter(new FileNameFilterEndsPDF(), new ToTextFromPDF()).length;
		assertEquals(2, nb);
	}

}
