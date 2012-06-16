package configuracao;

import java.util.HashMap;
import java.util.Map;

public abstract class ConfiguracaoMap implements Configuracao {

	private Map<String,String> configuracoes = 
			new HashMap<String, String>();
	
	protected Map<String, String> getConfiguracoes() {
		return configuracoes;
	}
	
	@Override
	public String get(String chave) {
		return this.configuracoes.get( chave );
	}
	
	@Override
	public void put(String chave, String valor) {
		this.configuracoes.put( chave , valor);
	}
	
}