package xml;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import arquivos.XMLInvalidoException;

public class Serializador {

	public void serializar( Object object, File file ) {
		
		Class<?> clazz = object.getClass();
		String root = this.getRoot(clazz);
		
		try {
			
			XMLStreamWriter writer = 
					XMLOutputFactory
						.newFactory()
						.createXMLStreamWriter( 
								new FileWriter(file) );

			writer.writeStartDocument();
			writer.writeStartElement( root );
			
			for ( Field f : clazz.getDeclaredFields() ) {
				f.setAccessible(true);
				
				Propriedade p = 
						f.getAnnotation( Propriedade.class );
				
				String nome = p.nome();
				
				writer.writeStartElement( nome );
				writer.writeCharacters( f.get( object ).toString() );
				writer.writeEndElement();
				
			}
			
			writer.writeEndElement();
			writer.writeEndDocument();
			writer.flush();
			writer.close();
		} catch ( Exception e ) {
			throw new IllegalStateException(e);
		}
		
	}
	
	public String getRoot( Class<?> clazz ) {		
		Serializavel s =
				clazz.getAnnotation( Serializavel.class );
		
		return s.nome();	
	}
	
}
