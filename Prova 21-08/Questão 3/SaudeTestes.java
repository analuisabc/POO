package provaQ3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaudeTestes {

	@Test
	public void testeIMC() {
		// criado objeto "saude" da classe Saude que queremos testar utilizando um construtor criado (sem ser o padrão) com parâmetros 20, 1.64 e 62
		Saude saude = new Saude(20, 1.64, 62);
		
		//teste verifica se o método "calcularIMC" retorna o valor 23 (valor esperado) com arredondamento para 0.5 (terceiro parâmetro)
		assertEquals(saude.calculaIMC(), 23, 0.5);
	}
	
	@Test
	public void testeCondição() {
		// objeto "saude" da classe Saude a ser testado usando construtor criado com parâmetros 20, 1.64 e 62
		Saude saúde = new Saude(20, 1.64, 62);
		
		//teste verifica se retornará verdadeiro o método "equals" aplicado ao método condiçãoFísica.
		assertTrue(saúde.condiçãoFísica().equals("Peso adequado") );
	}
}
