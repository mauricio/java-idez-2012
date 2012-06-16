package exercicios;

public class BancoDeDadosEmMemoriaTest extends BaseBancoDeDadosTest {

	@Override
	public BancoDeDados criarBanco() {
		return new BancoDeDadosEmMemoria();
	}
	
}