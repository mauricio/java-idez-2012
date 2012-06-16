package arquivos;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class IOUtils {

	private IOUtils() {}
	
	public static void close( Closeable c ) {
		
		if ( c != null ) {
			
			if ( c instanceof Flushable ) {
				Flushable f = (Flushable) c;
				try {
					f.flush();
				} catch ( IOException e ) {
					throw new IllegalStateException( "Não foi possível fazer flush", e);
				}
			}
			
			try {
				c.close();
			} catch ( IOException e ) {
				throw new IllegalStateException( "Não foi possível fazer close", e);
			}
			
		}
		
	}
	
	public static void close( XMLStreamReader r ) {
		
		if ( r != null ) {
			try {
				r.close();
			} catch ( XMLStreamException e ) {
				throw new IllegalStateException(e);
			}
		}
		
	}
	
}