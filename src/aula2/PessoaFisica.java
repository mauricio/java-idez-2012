package aula2;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica( String nome ) {
		super(nome);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String getIdentificador() {
		return this.getCpf();
	}
	
}