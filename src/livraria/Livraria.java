package livraria;

public class Livraria {

	public static void main(String[] args) {
		
		Livro b = new Livro();
		b.nome = "Senhor dos Anéis";
		Livro c = new Livro();
		c.nome = "Guia do Mochileiro das Galáxias";
		
		Livro d = c;
		c = b;
		
		System.out.println( d.nome );
		
		c.nome = "Duas Torres";
		
		System.out.println( c.nome );
		System.out.println( b.nome);
		
		
	}
	
}
