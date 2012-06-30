package bancodedados;

import java.util.List;

public interface Cadastro <T> {

	public void adicionar(T c);
	public List<T> listar();
	
}