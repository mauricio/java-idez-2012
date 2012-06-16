package arquivos;

import java.io.File;
import java.io.IOException;

public class PessoasMain {

	public static void main(String[] args) throws IOException {
		
		PessoasXML xml = new PessoasXML();		
		xml.ler( new File("pessoas.xml") );
		System.out.println("José");
		
	}
	
}
