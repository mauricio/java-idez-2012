package aula2;

import java.util.Date;

public class ImprimidorTest {

	public static void main(String[] args) {		
		Imprimidor i = new Imprimidor();
		
		Date data = new Date();
		Object objectData = data;
		
		String texto = "Meu texto";
		Object objectTexto = texto;
		
		i.imprimir( data );
		i.imprimir( objectData );
		i.imprimir(texto);
		i.imprimir( objectTexto );
		
		i.imprimir( true );
		i.imprimir( 10 );
		i.imprimir( 50L );		
		
	}
	
}