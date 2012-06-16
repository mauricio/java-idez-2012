package configuracao;

import java.io.File;

public interface Configuracao {

	String get( String chave );
	void put( String chave, String valor );
	void salvar( File file ) throws Exception;
	void carregar( File file ) throws Exception;
	
}