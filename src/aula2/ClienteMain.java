package aula2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteMain {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome( "José" );
		cliente1.setCpf( "000.000.000-00" );
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		cliente2.setCpf( "111.111.111-11" );
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add( cliente1 );
		clientes.add( cliente2 );
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Maria");
		cliente3.setCpf( "111.111.111-11" );
		
		System.out.println(clientes.contains( cliente3 ));
		
		for ( int x = 0; x < clientes.size(); x++ ) {
			Cliente cliente = clientes.get(x);
			System.out.println( cliente.getCpf() );
		}
		
		for ( Cliente cliente : clientes ) {
			System.out.println( cliente.getCpf() );
		}
		
		Iterator<Cliente> iterator = clientes.iterator();
		
		while ( iterator.hasNext() ) {
			Cliente cliente = iterator.next();
			System.out.println( cliente.getCpf() );
			
			if ( "000.000.000-00".equals( cliente.getCpf() ) ) {
				iterator.remove();
			}
			
		}
		
		System.out.println( clientes );
		
	}
	
}
