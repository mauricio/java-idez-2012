package banco;

import java.math.BigDecimal;

public class Conta {

	private BigDecimal saldo = BigDecimal.ZERO;
	
	public Conta() {}
	
	private Conta( BigDecimal saldo ) {
		this.saldo = saldo;
	}
	
	public boolean depositar( double valor ) {
		return this.depositar(new BigDecimal(valor));
	}
	
	public boolean depositar( BigDecimal valor ) {		
		
		if ( valor.compareTo( BigDecimal.ZERO ) > 0 ) {
			this.saldo = this.saldo.add(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean sacar( double valor ) {
		return this.sacar(new BigDecimal(valor));
	}
	
	public boolean sacar( BigDecimal valor ) {	
		
		if ( valor.compareTo( BigDecimal.ZERO ) > 0 &&
				valor.compareTo(this.saldo) < 1 ) {			
			this.saldo = this.saldo.subtract( valor );
			return true;			
		} else {
			return false;
		}
		
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}

	/**
	 * 
	 * Cria uma nova conta com o saldo definido. O saldo definido
	 * deve ser maior do que zero
	 * 
	 * @param saldo um valor qualquer maior do que zero
	 * @return uma conta criada com o saldo definido ou null se o saldo 
	 * for inválido
	 */
	
	public static Conta criar( BigDecimal saldo ) {
		
		Conta conta = null;
		
		if ( saldo.compareTo( BigDecimal.ZERO ) > 0 ) {
			conta = new Conta(saldo);
		}
		
		return conta;
		
	}
	
}
