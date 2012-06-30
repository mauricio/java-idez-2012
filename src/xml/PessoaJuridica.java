package xml;

@Serializavel(nome = "pessoa-juridica")
public class PessoaJuridica {

	@Propriedade
	private String cnpj;
	
	@Propriedade("inscricao-estadual")
	private String inscricaoEstadual;
	
	private String nomeDeFantasia;
	
	public String getNomeDeFantasia() {
		return nomeDeFantasia;
	}
	
	public void setNomeDeFantasia(String nomeDeFantasia) {
		this.nomeDeFantasia = nomeDeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

}
