package exercicios;

public class Pessoa implements Comparable<Pessoa> {

	private String cpf;
	private String nome;

	public Pessoa() {}
	
	public Pessoa( String cpf, String nome ) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Pessoa o) {		
		return this.getNome().compareTo( o.getNome() ) * -1;
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

	
	@Override
	public String toString() {
		return String.format("%s - %s", this.getNome(), this.getCpf());
	}
	
}