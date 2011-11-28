import static org.junit.Assert.*;

import org.junit.Test;


public class OrdenaFraseSortTest {

	
	@Test
	public void deveQuebrarLinhaLajota() {
		String frase = OrdenaFrase.contarPalavras("A lajota quando cai quebra.");
		assertEquals("A cai lajota quando quebra.", frase);
	}
	
	@Test
	public void deveQuebrarLinhaCadeira() {
		String frase = OrdenaFrase.contarPalavras("A cadeira serve para sentar.");
		assertEquals("A para serve cadeira sentar.", frase);
	}
	
	@Test
	public void deveQuebrarLinhaJabuti1() {
		String frase = OrdenaFrase.contarPalavras("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		assertEquals( "Um viu dez jabuti xereta pequeno cegonhas felizes.", frase);
	}
	
}
