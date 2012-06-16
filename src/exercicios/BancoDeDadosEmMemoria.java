package exercicios;

import java.util.ArrayList;
import java.util.List;

import colecoes.UnmodifiableList;

public class BancoDeDadosEmMemoria implements BancoDeDados {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Pessoa> pessoasNaoModificavel = 
			new UnmodifiableList<Pessoa>(this.pessoas);
	
	@Override
	public void adicionar(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		this.pessoas.remove(pessoa);
	}

	@Override
	public List<Pessoa> listar() {
		return this.pessoasNaoModificavel;
	}

	@Override
	public Pessoa encontrarPessoaPeloNome(String nome) {
		return null;
	}

	@Override
	public Pessoa encontrarPessoaPeloCPF(String cpf) {
		return null;
	}
	
}