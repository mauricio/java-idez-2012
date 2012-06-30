package xml;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class Serializador {

	public void serializar(Object object, File file) {

		Class<?> clazz = object.getClass();
		String root = this.getRoot(clazz);

		try {

			XMLStreamWriter writer = XMLOutputFactory.newFactory()
					.createXMLStreamWriter(new FileWriter(file));

			writer.writeStartDocument();
			writer.writeStartElement(root);

			for (Field f : clazz.getDeclaredFields()) {
				f.setAccessible(true);

				Propriedade p = f.getAnnotation(Propriedade.class);

				if (p != null) {
					String nome = null;

					if ("".equals(p.value())) {
						nome = f.getName();
					} else {
						nome = p.value();
					}

					writer.writeStartElement(nome);
					writer.writeCharacters(f.get(object).toString());
					writer.writeEndElement();
				}

			}

			writer.writeEndElement();
			writer.writeEndDocument();
			writer.flush();
			writer.close();
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}

	public <T> T ler(File file, Class<T> clazz) {
		try {
			T resultado = clazz.newInstance();

			Map<String,Field> propriedades = this.getFields( clazz );
			
			XMLStreamReader reader = XMLInputFactory
					.newFactory()
					.createXMLStreamReader( 
							new FileReader(file) );
			
			String elementoAtual = null;
			
			while ( reader.hasNext() ) {
				int evento = reader.next();
				switch (evento) {
				case XMLStreamConstants.START_ELEMENT: {
					elementoAtual = reader.getLocalName();
					break;
				}
				case XMLStreamConstants.END_ELEMENT : {
					elementoAtual = null;
					break;
				}
				case XMLStreamConstants.CHARACTERS : {
					if ( elementoAtual != null 
							&& propriedades
									.keySet()
									.contains( elementoAtual ) ) {
						Field f = propriedades.get( elementoAtual );
						f.set( resultado , reader.getText() );
					}
					
					break;
				}					
				}
				
			}
			
			reader.close();
			
			return resultado;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	private String getRoot(Class<?> clazz) {
		Serializavel s = clazz.getAnnotation(Serializavel.class);

		if (s == null) {
			throw new ClasseNaoSerializavelException(clazz);
		}

		return s.nome();
	}
	
	private Map<String,Field> getFields( Class<?> clazz ) {

		Map<String,Field> propriedades = 
				new HashMap<String, Field>();
		
		for ( Field f : clazz.getDeclaredFields() ) {
			f.setAccessible(true);
			Propriedade p = f.getAnnotation( Propriedade.class );
			
			if ( p != null ) {
				String chave = null;
				if ( "".equals( p.value() ) ) {
					chave = f.getName();
				} else {
					chave = p.value();
				}
				propriedades.put( chave , f);
			}			
		}
		
		return propriedades;
	}

}
