package threads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FatorialMain {

	private static final ExecutorService pool = 
			Executors.newFixedThreadPool( 8 );
	
	public static void main(String[] args) throws Exception {
		
		Collection<CalculadorDeFatorial> fatoriais = new ArrayList<CalculadorDeFatorial>();

		for ( int x = 0; x < 200; x++ ) {
			fatoriais.add( new CalculadorDeFatorial(BigInteger.valueOf(10000)) );
		}
		System.out.println("começou");
		long tempoInicial = System.currentTimeMillis();
		
		executarAssincrono( fatoriais );
		executarSincrono(fatoriais);
		
		long tempoFinal = System.currentTimeMillis() - tempoInicial;
		System.out.println(tempoFinal);
	}
	
	public static void executarSincrono(Collection<CalculadorDeFatorial> fatoriais) {		
		for ( CalculadorDeFatorial c : fatoriais ) {
			c.call();			
		}			
	}

	public static void executarAssincrono(Collection<CalculadorDeFatorial> fatoriais)
	throws Exception {
		
		for ( CalculadorDeFatorial c : fatoriais ) {
			Future<BigInteger> future = pool.submit(c);
			BigInteger resultado = 
					future.get( 10, TimeUnit.SECONDS );
		}			
		
		pool.shutdown();
		
		while ( !pool.isTerminated() ) {
			try {
				Thread.sleep(1000);
			} catch ( Exception e ) {
				
			}
		}
		
	}
	
}
