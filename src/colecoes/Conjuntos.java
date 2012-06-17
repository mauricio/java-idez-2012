package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import exercicios.Pessoa;

public class Conjuntos {

	public static void main(String[] args) {

		SortedSet<String> nomes = new TreeSet<String>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("João");
		nomes.add("Roberto");
		nomes.add("Carla");

		//System.out.println(nomes);

		Pessoa p1 = new Pessoa("000.000.000-00", "Maria");
		Pessoa p2 = new Pessoa("000.000.000-00", "Maria");
		Pessoa p3 = new Pessoa("000.000.000-11", "João");
		Pessoa p4 = new Pessoa("000.000.000-22", "Zélia");
		Pessoa p5 = new Pessoa("000.000.000-33", "Xavier");

		Set<Pessoa> pessoas = new TreeSet<Pessoa>( 
				new ComparadorPorCpf() 
				);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}

		pessoas.remove(new Pessoa("000.000.000-00", "Joe"));

		System.out.println(pessoas);

	}

}
