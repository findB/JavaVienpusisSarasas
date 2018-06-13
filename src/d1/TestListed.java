package d1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestListed {

	@Test
	public void testArYraElementas() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		assertTrue(
				e1.contains(5)
		);
	}
	
	@Test
	public void testArYraElementasKurioNera() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		assertFalse(
				e1.contains(6)
		);
	}
	
	@Test
	public void testArGrazinaNajiElementa() {
		ListedElements e1 = new ListedElements();
		e1.add(5);
		e1.add(7);
		e1.add(9);
		e1.add(11);
		assertEquals(
				9,
				e1.returnElement(2)
		);
	}
}
