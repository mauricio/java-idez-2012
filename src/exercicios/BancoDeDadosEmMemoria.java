package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDeDadosEmMemoria implements BancoDeDados {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Pessoa> pessoasNaoModificavel = Collections.unmodifiableList(this.pessoas);
	
	@Override
	public void adicionar(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> listar() {
		return this.pessoasNaoModificavel;
	}

	@Override
	public Pessoa encontrarPessoaPeloNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa encontrarPessoaPeloCPF(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
