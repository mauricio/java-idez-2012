package configuracao;

import java.io.File;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Scanner;

public class ConfiguracaoEmArquivoCSV extends ConfiguracaoMap {

	@Override
	public void salvar(File file) throws Exception {

		PrintWriter writer = new PrintWriter(file);

		for (Entry<String, String> entry : this.getConfiguracoes().entrySet()) {
			writer.printf("%s,%s%n", entry.getKey(), entry.getValue());
		}

		writer.flush();
		writer.close();
	}
	
	@Override
	public void carregar(File file) throws Exception {
		
		Scanner s = new Scanner(file);
		
		while ( s.hasNext() ) {
			String line = s.nextLine().trim();
			if ( line.length() > 0 ) {
				String[] pair = line.split(",");
				this.put( pair[0].trim(), pair[1].trim() );
			}					
		}
		
		s.close();
	}

}
