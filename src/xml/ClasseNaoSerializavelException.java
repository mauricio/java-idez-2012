package xml;

public class ClasseNaoSerializavelException 
	extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2117896485057755379L;

	private Class<?> source;
	
	public ClasseNaoSerializavelException( Class<?> o ) {
		super( String.format(
				"A classe %s não tem a anotação %s",
				o.getName(),
				Serializavel.class.getName()
				) );
		this.source = o;
	}
	
	public Class<?> getSource() {
		return source;
	}
	
	
}
