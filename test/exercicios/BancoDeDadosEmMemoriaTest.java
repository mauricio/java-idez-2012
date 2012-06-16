package exercicios;

import org.junit.Assert;
import org.junit.Test;

public class BancoDeDadosEmMemoriaTest {

	@Test
	public void testAdicionar() {		
		BancoDeDados banco = new BancoDeDadosEmMemoria();		
		Pessoa p = new Pessoa("000.000.000-00", "José");
		
		banco.adicionar(p);
		
		Assert.assertTrue(banco.listar().contains( p ));
	}
	
}
