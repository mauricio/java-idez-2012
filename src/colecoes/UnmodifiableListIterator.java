package colecoes;

import java.util.ListIterator;

public class UnmodifiableListIterator <E> 
	extends UnmodifiableIterator<E>
	implements ListIterator<E> {

	private ListIterator<E> listIterator;
	
	public UnmodifiableListIterator( ListIterator<E> listIterator ) {
		super(listIterator);
		this.listIterator = listIterator;
	}

	@Override
	public void add(E e) {
		throw new UnsupportedOperationException("Este iterator não é modificável");
	}

	@Override
	public boolean hasPrevious() {
		return this.listIterator.hasPrevious();
	}

	@Override
	public int nextIndex() {
		return this.listIterator.nextIndex();
	}

	@Override
	public E previous() {
		return this.listIterator.previous();
	}

	@Override
	public int previousIndex() {
		return this.listIterator.previousIndex();
	}

	@Override
	public void set(E e) {
		throw new UnsupportedOperationException("Este iterator não é modificável");		
	}

}