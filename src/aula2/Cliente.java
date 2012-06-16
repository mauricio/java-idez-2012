package aula2;

import java.util.Date;

public class Cliente extends Object {

	private String nome = null;
	private Date dataDeNascimento = null;
	private String cpf = null;

	public Cliente() {
		this( null, null, null );
	}
	
	public Cliente( String nome) {
		this( nome, null, null );
	}
	
	public Cliente( String nome, String cpf ) {
		this( nome, cpf, null );
	}
	
	public Cliente( String nome, String cpf, Date dataDeNascimento ) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return String.format( "%s-%s", this.getNome(), this.getCpf() )
				.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {		
		boolean resultado = false;
		
		if ( obj instanceof Cliente ) {
			Cliente cliente = (Cliente) obj;
			resultado =
					this.getNome().equals( cliente.getNome() ) &&
					this.getCpf().equals( cliente.getCpf() );
		}
		
		return resultado;
	}
	
}
