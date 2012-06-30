package threads;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class CalculadorDeFatorial 
	implements Callable<BigInteger> {

	private BigInteger i;
	
	public CalculadorDeFatorial( BigInteger i ) {
		this.i = i;
	}
	
	@Override
	public BigInteger call() {
		return Fatorial.fatorial(this.i);
	}
	
}
