package bancodedados;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class CadastroDeClientesTeste  {

	@Test
	public void testInserir() {		
		Cadastro<Cliente> cadastro = 
				new CadastroDeClientes(true);
		Cliente cliente = new Cliente();
		cliente.setNome("José");
		cliente.setCpf("055.055.055-00");
		cliente.setDataDeNascimento( new Date() );
		
		cadastro.adicionar( cliente );		
		List<Cliente> clientes = cadastro.listar();		
		Assert.assertEquals( 1, clientes.size() );
		Cliente c = clientes.get(0);
		
		Assert.assertEquals( cliente.getNome(), c.getNome() );
		Assert.assertEquals( cliente.getCpf(), c.getCpf() );
		Assert.assertEquals( 
				cliente.getDataDeNascimento(), 
				c.getDataDeNascimento() );
	}
	
}
