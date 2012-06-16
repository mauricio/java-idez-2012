package excecoes;

import java.util.Collections;
import java.util.List;

public class ExcecoesEmColecoes {

	public static void main(String[] args) {
		List<String> nomes = Collections.emptyList();

		try {
			nomes.add("José");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
