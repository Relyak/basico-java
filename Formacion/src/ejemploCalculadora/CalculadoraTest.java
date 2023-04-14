package ejemploCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test 
	void sumaTest() {
		int res= Calculadora.suma(2,3);
		int resul=5;
		assertEquals(res, resul);
	}
	

}
