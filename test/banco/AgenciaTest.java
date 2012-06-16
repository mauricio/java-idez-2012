package banco;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AgenciaTest {

	@Test
	public void testAdicionarConta() {
		
		Agencia agencia = new Agencia();
		
		Conta conta = new Conta();
		conta.depositar( new BigDecimal("100") );
		
		agencia.addConta( conta );
		
		Conta contaVazia = new Conta();
		
		agencia.addConta( contaVazia );

		agencia.getContas().add( contaVazia );
		
		Assert.assertTrue( agencia.getContas().contains( conta ) );
		Assert.assertFalse( "Não deve adicionar conta vazia",  
				agencia.getContas().contains( contaVazia ) );
		
	}
	
}
