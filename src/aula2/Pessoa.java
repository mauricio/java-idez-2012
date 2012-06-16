package aula2;

abstract public class Pessoa {

	private String nome;
	private Endereco endereco = new Endereco();

	//public Pessoa() {}
	
	public Pessoa( String nome ) {
		this.nome = nome;
	}
	
	public abstract String getIdentificador(); 
	
	@Override
	public int hashCode() {
		return this.getIdentificador().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if ( obj instanceof Pessoa ) {
			Pessoa pessoa = (Pessoa) obj;
			result = this.getIdentificador().equals( pessoa.getIdentificador() );
		}
		
		return result;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
