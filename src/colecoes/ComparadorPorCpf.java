package colecoes;

import java.util.Comparator;

import exercicios.Pessoa;

public class ComparadorPorCpf implements Comparator<Pessoa> {

	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getCpf().compareTo(o2.getCpf());
	}
	
}
