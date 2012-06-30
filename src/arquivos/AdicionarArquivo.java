package arquivos;

import java.io.FileWriter;

public class AdicionarArquivo {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer = 
				new FileWriter("clientes.csv", true);

		writer.write( String.format("Maria;35;%n") );
		writer.write( String.format("José;35;%n") );
		writer.write( String.format("Carlos;35;%n") );
		
	    writer.flush();
	    writer.close();
		
	}

}
