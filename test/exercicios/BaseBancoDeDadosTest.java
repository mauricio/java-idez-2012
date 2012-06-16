package exercicios;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public abstract class BaseBancoDeDadosTest {

	public abstract BancoDeDados criarBanco();
	
	@Test
	public void testAdicionar() {		
		BancoDeDados banco = this.criarBanco();		
		Pessoa p = new Pessoa("000.000.000-00", "José");
		
		banco.adicionar(p);
		
		Assert.assertTrue(banco.listar().contains( p ));
	}
	
	@Test
	public void testRemover() {
		BancoDeDados banco = this.criarBanco();
		Pessoa p1 = new Pessoa("000.000.000-00", "José");
		Pessoa p2 = new Pessoa("000.000.000-99", "José");
		
		banco.adicionar(p1);
		banco.adicionar(p2);
		
		banco.remover(p1);
		
		List<Pessoa> pessoas = banco.listar();
		
		Assert.assertEquals(1, pessoas.size() );
		Assert.assertTrue( pessoas.contains(p2) );
		
	}
	
}
