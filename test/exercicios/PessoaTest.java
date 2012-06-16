package exercicios;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

	@Test
	public void testEquals() {		
		Pessoa pessoa1 = new Pessoa("000.000.000-00", "José");
		Pessoa pessoa2 = new Pessoa("000.000.000-00", "José");
		
		Assert.assertTrue( pessoa1.equals( pessoa2 ));		
	}
	
	@Test
	public void testNotEquals() {
		Pessoa pessoa1 = new Pessoa("000.000.000-00", "José");
		Pessoa pessoa2 = new Pessoa("000.000.000-01", "José");
		
		Assert.assertFalse( pessoa1.equals( pessoa2 ));		
	}
	
	@Test
	public void testSameHashcode() {
		Pessoa pessoa1 = new Pessoa("000.000.000-00", "José");
		Pessoa pessoa2 = new Pessoa("000.000.000-00", "José");
		
		Assert.assertTrue( pessoa1.hashCode() == pessoa2.hashCode());
	}
	
}
