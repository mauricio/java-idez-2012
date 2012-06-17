package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import exercicios.Pessoa;

public class PessoasXML {

	public void escrever(Collection<Pessoa> pessoas, File file) {
		Writer writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("<pessoas>");
			writer.write("</pessoas>");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi possível escrever no arquivo");
		} finally {
			IOUtils.close(writer);
		}
	}
	
	/*
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
	 */
	
	/**
	 * 
	 * @param file
	 * @return
	 * @throws IllegalStateException é lançada quando não for possível ler o arquivo
	 * @throws IllegalArgumentException é lançada quando o arquivo XML não for 
	 * válido
	 */
	
	public Collection<Pessoa> ler( File file ) 
			throws 
			IllegalStateException, 
			IllegalArgumentException,
			IOException
			{
		
		Collection<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLStreamReader reader = null;
		try {
			reader = factory.createXMLStreamReader( new FileReader(file) );
			while ( reader.hasNext() ) {
				reader.next();
			}
		} catch ( FileNotFoundException e ) { 
			throw new IllegalStateException("Arquivo não encontrado", e);
		} catch ( IOException e ) {
			throw new IllegalStateException("Problema lendo do arquivo", e);
		} catch ( XMLStreamException e ) {
			System.out.println( "Erro de sintaxe!" );
			throw new XMLInvalidoException(file, "Problema de sintaxe no XML", e);
		} finally {
			IOUtils.close(reader);
			System.out.println( "Finally rodando!" );
		}
		
		return pessoas;
	}

}
