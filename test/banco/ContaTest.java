package banco;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

	@Test
	public void testDepositar() {		
		Conta conta = new Conta();
		boolean resultado = conta.depositar( new BigDecimal("100") );
		
		Assert.assertEquals( new BigDecimal("100"), conta.getSaldo() );
		Assert.assertTrue("Deveria ser true", resultado);
	}

	@Test
	public void testDepositarComValorNegativo() {
		
		Conta conta = new Conta();
		boolean resultado = conta.depositar( new BigDecimal("-200")  );
		
		Assert.assertEquals( BigDecimal.ZERO, conta.getSaldo() );
		Assert.assertFalse( "Deveria ser false", resultado);
	}
	
	@Test
	public void testSacar() {		
		Conta conta = new Conta();
		conta.depositar( new BigDecimal("300") );
		boolean resultado = conta.sacar( new BigDecimal( "250" ) );
		
		Assert.assertEquals( new BigDecimal("50"), conta.getSaldo() );
		Assert.assertTrue( "Deveria ser true", resultado );
	}

	@Test
	public void testSacarComValorMaior() {
		Conta conta = new Conta();
		conta.depositar( new BigDecimal("300") );
		boolean resultado = conta.sacar( new BigDecimal( "350" ) );
		
		Assert.assertEquals( new BigDecimal("300"), conta.getSaldo() );
		Assert.assertFalse( "Deveria ser false", resultado );
	}
	
	@Test
	public void testSacarComValorNegativo() {		
		Conta conta = new Conta();
		conta.depositar( new BigDecimal("300") );
		boolean resultado = conta.sacar( new BigDecimal( "-250" ) );
		
		Assert.assertEquals( new BigDecimal("300"), conta.getSaldo() );
		Assert.assertFalse( "Deveria ser false", resultado );
	}
		
	
	@Test
	public void testCriarContaComSaldo() {
		BigDecimal saldo = new BigDecimal( "300" );
		Conta conta = Conta.criar( saldo );
		
		Assert.assertEquals( saldo, conta.getSaldo() );		
	}
	
	@Test
	public void testCriarContaComSaldoNegativo() {
		BigDecimal saldo = new BigDecimal( "-300" );
		Conta conta = Conta.criar( saldo );
		
		Assert.assertNull( "A conta deve ser nula", conta );
		
	}	
	
	
}