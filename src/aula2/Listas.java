package aula2;

import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {		
		List<String> nomes = new LinkedList<String>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Cláudia");
		
		System.out.println( nomes.indexOf( "Carlos" ) );
		System.out.println( nomes.get(3) );
		System.out.println( nomes.remove( "José" ) );
		System.out.println( nomes );
	}
	
}