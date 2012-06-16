package exercicios;

public class Pessoa {

	private String cpf;
	private String nome;

	public Pessoa() {}
	
	public Pessoa( String cpf, String nome ) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return this.getCpf().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		boolean resultado = false;
		
		if ( obj instanceof Pessoa ) {
			Pessoa p = (Pessoa) obj;
			resultado = this.getCpf().equals( p.getCpf() );
		}
		
		return resultado;
	}
	
}