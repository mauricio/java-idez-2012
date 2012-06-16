package arquivos;

import java.io.File;

public class PessoasMain {

	public static void main(String[] args) {
		
		PessoasXML xml = new PessoasXML();		
		xml.ler( new File("pessoas.xml") );
		System.out.println("José");
		
	}
	
}
