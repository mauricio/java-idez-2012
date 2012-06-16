package aula2;

import java.io.PrintStream;
import java.util.Date;

public class Imprimidor {

	private PrintStream saida = System.out;

	public void imprimir( String texto ) {
		this.saida.print( "Imprimindo string " );
		this.saida.println( texto );
	}

	public void imprimir( Date date ) {
		this.saida.print( "Imprimindo date " );
		this.saida.println( date );
	}	
	
	public void imprimir( Object object ) {
		this.saida.printf( 
				"Imprimindo object %s - %s%n", 
				object, 
				object.getClass() );
	}
	
}
