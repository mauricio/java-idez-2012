package colecoes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UnmodifiableList <E> implements List<E> {

	private List<E> list;
	
	public UnmodifiableList( List<E> list ) {
		this.list = list;
	}

	@Override
	public boolean add(E e) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("Esta lista não é modificável");	
	}

	@Override
	public boolean contains(Object o) {
		return this.list.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.list.containsAll(c);
	}

	@Override
	public E get(int index) {
		return this.list.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return this.list.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return new UnmodifiableIterator<E>( this.list.iterator() );
	}

	@Override
	public int lastIndexOf(Object o) {
		return this.list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return new UnmodifiableListIterator<E>( this.list.listIterator() );
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new UnmodifiableListIterator<E>( this.list.listIterator(index) );
	}

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException("Esta lista não é modificável");
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return this.list.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		return this.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.toArray(a);
	}
	
	
	
}