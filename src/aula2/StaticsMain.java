package aula2;

public class StaticsMain {

	public static void main(String[] args) {
		
		System.out.println( Statics.PI );
		
		Statics s = new Statics();
		
		System.out.println( Statics.NOME_DA_PESSOA );
		
		Statics.NOME_DA_PESSOA = "Maria";
		
		System.out.println( Statics.NOME_DA_PESSOA );
		
		s.NOME_DA_PESSOA = "João";
		
		System.out.println( Statics.NOME_DA_PESSOA );
		System.out.println( s.NOME_DA_PESSOA );	
		
		System.out.println( Statics.NOME_DA_PESSOA.indexOf( "ã" ) );
		
	}
	
}
