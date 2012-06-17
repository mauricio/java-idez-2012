package arquivos;

import java.io.File;

public class XMLInvalidoException 
	extends RuntimeException {

	private File file;
	
	/**
	 *
	 */
	private static final long serialVersionUID = -6814101372514956155L;

	public XMLInvalidoException( File file, String mensagem, Throwable cause ) {
		super(mensagem, cause);		
		this.file = file;
	}
	
	public XMLInvalidoException( File file, Throwable cause ) {
		super(cause);
		this.file = file;
	}
	
	public File getFile() {
		return file;
	}
	
}
