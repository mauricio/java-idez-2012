package exercicios;

import java.util.List;

public interface BancoDeDados {
	
	public void adicionar( Pessoa pessoa );
	
	public void remover( Pessoa pessoa );
	
	public List<Pessoa> listar();
	
	public Pessoa encontrarPessoaPeloNome( String nome );
	
	public Pessoa encontrarPessoaPeloCPF( String cpf );
	
}