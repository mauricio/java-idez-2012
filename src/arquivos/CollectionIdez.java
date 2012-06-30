package arquivos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface CollectionIdez <E> {

	public boolean add( E e );
	public boolean addAll( Collection<? extends E> c );
	
	
}
