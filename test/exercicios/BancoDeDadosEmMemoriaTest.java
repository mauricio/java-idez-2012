package exercicios;

import org.junit.Assert;
import org.junit.Test;

public class BancoDeDadosEmMemoriaTest extends BaseBancoDeDadosTest {

	@Override
	public BancoDeDados criarBanco() {
		return new BancoDeDadosEmMemoria();
	}

	@Test
	public void testAdicionarDiretamente() {
		BancoDeDados banco = this.criarBanco();
		Pessoa p = new Pessoa("000.000.000-00", "José");
		try {
			banco.listar().add(p);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertTrue(banco.listar().contains(p));
	}

}