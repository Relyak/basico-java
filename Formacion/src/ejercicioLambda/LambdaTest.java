package ejercicioLambda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LambdaTest {
	private Lambda lamb= new Lambda();
	private int numEsperado;

	@Test
	void testDev() {
		numEsperado = 5;
		assertEquals(numEsperado, lamb.dev().valor());
	}

	@Test
	void testOb() {
		numEsperado = 10;
		assertEquals(numEsperado, lamb.ob().ope(20, -10 ));
	}

	@Test
	void testObIni() {
		String array[] = new String[5];
		lamb.obIni().ini(array, "*");
		assertArrayEquals(array,new String[] {"*","*","*","*","*"});
	}
}
