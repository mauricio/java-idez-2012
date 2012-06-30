package xml;

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SerializadorTest {

	@Test
	public void testGerarPessoa() throws Exception {

		Pessoa p = new Pessoa();
		p.setNome("Maria");
		File pessoaFile = new File("pessoa.xml");
		Serializador serializador = new Serializador();
		serializador.serializar(p, pessoaFile);

		String content = lerArquivo( pessoaFile );
		
		Assert.assertTrue( 
				content.contains(
						"<nome-completo>Maria</nome-completo>") );
	}
	
	@Test
	public void testGerarPessoaJuridica() throws Exception {
		
		PessoaJuridica p = new PessoaJuridica();
		p.setCnpj( "8888-0000-8888" );
		p.setInscricaoEstadual( "9999-9999-1111" );
		
		File arquivo = new File("pessoa-juridica.xml");
		Serializador serializador = new Serializador();
		serializador.serializar( p , arquivo);
		
		String conteudo = lerArquivo(arquivo);
		
		Assert.assertTrue( 
				conteudo.contains( 
						"<cnpj>8888-0000-8888</cnpj>" ) );
		Assert.assertTrue( 
				conteudo.contains( 
"<inscricao-estadual>9999-9999-1111</inscricao-estadual>" ) );		
	}
	
	private String lerArquivo( File file ) throws Exception {
		Scanner s = new Scanner(file);
		StringBuilder builder = new StringBuilder();
		
		while ( s.hasNext() ) {
			builder.append( s.nextLine()  );
		}
		
		s.close();
		
		return builder.toString();
	}

}
