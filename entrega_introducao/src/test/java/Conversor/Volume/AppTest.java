package Conversor.Volume;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

public class AppTest {
	
@Test
	public void testConversor1() {
		
	// Teste 1 : 
	// Volume em metros cubicos: 9
	// Resultado esperado : 9000 litros
		
		float vol = 9f;
		float resultEsperado = 9000f;

		float volume = Conversor.convertVolume(vol);
		Assert.assertEquals(resultEsperado, volume, 0.0f);
	}

@Test
	public void testConversor2() {
	
	// Teste 1 : 
	// Volume em metros cubicos: 89
	// Resultado esperado : 89000 litros
	
		float vol = 89f;
		float resultEsperado = 89000f;

		float volume = Conversor.convertVolume(vol);
		Assert.assertEquals(resultEsperado, volume, 0.0f);
	}
}
