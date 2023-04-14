package ejercicioArrayNumeros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
	private App app=new App();
	private int numEsperado;
	private int [] num= {0,-1,7};
	@Test
	void testSuma() {
		numEsperado = 6;
		assertEquals(numEsperado, app.suma().apply(num));
	}
	@Test
	void testMedia() {
		numEsperado = 2;
		assertEquals(numEsperado, app.media().media(num));
	}

}
