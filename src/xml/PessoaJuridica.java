package xml;

@Serializavel(nome = "pessoa-juridica")
public class PessoaJuridica {

	@Propriedade(nome="cnpj")
	private String cnpj;
	
	@Propriedade(nome="inscricao-estadual")
	private String inscricaoEstadual;

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
