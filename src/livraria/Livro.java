package livraria;

public class Livro {

	String nome;
	
	public void alugar( String pessoa ) {
	
		if ( "José".equals( pessoa ) ) {
			return;
		}
		
		System.out.println("Alugando o livro para " + pessoa);		
	}
		
}
