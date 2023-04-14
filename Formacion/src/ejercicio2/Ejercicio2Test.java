package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void textoTest() {
		String comprob=Ejercicio2.sacarEspacio();
		String cortado="frasecortadajijiji";
		assertEquals(comprob, cortado);
	}
	

}
