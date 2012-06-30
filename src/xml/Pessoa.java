package xml;

@Serializavel(nome="pessoa")
public class Pessoa {

	@Propriedade("nome-completo")
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
