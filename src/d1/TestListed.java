package d1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.Test;

public class TestListed {

	@Test
	public void testArYraElementas() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		assertTrue(e1.contains(5));
	}

	@Test
	public void testArYraElementasKurioNera() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		assertFalse(e1.contains(6));
	}

	@Test
	public void testArGrazinaNajiElementa() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		assertEquals(9, e1.returnElement(2));
	}

	@Test(expected = NoSuchElementException.class)
	public void testArGrazinaFalseJeiguNeraNojoElemento() {

		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		
		e1.returnElement(10);

	}
	
	@Test
	public void testArIsmetaElementa() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		e1.deleteWithValue(9);
		assertFalse(e1.contains(9));
	}
	
	
	@Test
	public void testArIsmetaElementaIrSumazinaListoDydi() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		e1.deleteWithValue(9);
		assertEquals(3, e1.getSize());
	}
	
	@Test
	public void testArGrazinaListoDydi() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		assertEquals(4, e1.getSize());
	}
	
	@Test
	public void testArGrazinaMasyva() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		assertArrayEquals(new int[] {5, 7, 9, 11}, e1.toArray());
		//assertEquals(4, e1.getSize());
	}
	
}
