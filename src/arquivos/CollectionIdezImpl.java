package arquivos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionIdezImpl <E> implements CollectionIdez<E> {
	
	private List<E> itens = new ArrayList<E>();
	
	public boolean add(E e) {
		return false;
	};
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		
		for ( E e : c ) {
			this.itens.add(e);
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		CollectionIdez<Number> numeros = new CollectionIdezImpl<Number>();
		List<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add( 5 );
		inteiros.add( 10 );
		inteiros.add( 90);
		
		numeros.addAll( inteiros );
		
		
		
	}
	
	
}