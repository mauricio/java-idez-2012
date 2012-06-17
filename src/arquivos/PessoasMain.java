package arquivos;

import java.io.File;
import java.io.IOException;

public class PessoasMain {

	public static void main(String[] args) throws IOException {
		
		PessoasXML xml = new PessoasXML();		
		try {
			xml.ler( new File("pessoas.xml") );
		} catch ( XMLInvalidoException e ) {
			e.printStackTrace();
			System.out.printf("O erro foi no arquivo %s%n", e.getFile().getAbsolutePath());
		}
		System.out.println("José");
		
	}
	
}
