package configuracao;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ConfiguracaoTest {
	
	@Test
	public void testCarregarArquivo() throws Exception {		
		Configuracao configuracao = new ConfiguracaoEmArquivoCSV();
		
		String nome = "José";
		String idade = "10";
		String cidade = "João Pessoa";
		
		configuracao.put("nome", nome);
		configuracao.put("idade", idade);
		configuracao.put("cidade", cidade);
		
		File file = File.createTempFile("arquivo", ".csv");		
		configuracao.salvar( file );
		
		Configuracao outraConfiguracao = new ConfiguracaoEmArquivoCSV();
		outraConfiguracao.carregar(file);
		
		Assert.assertEquals( cidade, outraConfiguracao.get("cidade") );
		Assert.assertEquals( nome, outraConfiguracao.get("nome") );
		Assert.assertEquals( idade, outraConfiguracao.get("idade") );
	}
	
	public static void main(String[] args) throws Exception {
		
		Configuracao configuracao = new ConfiguracaoEmArquivoCSV();
		
		configuracao.put("nome", "José");
		configuracao.put("idade", "10");
		configuracao.put("cidade", "João Pessoa");
		
		File file = new File("configuracao.txt");
		
		configuracao.salvar(file);
		
	}
	
}
