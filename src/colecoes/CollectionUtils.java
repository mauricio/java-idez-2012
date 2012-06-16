package colecoes;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

	private CollectionUtils() {}
	
	public static <IN,OUT> Collection<OUT> map( Collection<IN> collection, 
			Mapper<IN,OUT> mapper ) {
		
		Collection<OUT> result = new ArrayList<OUT>();
		
		for ( IN element : collection ) {
			result.add( mapper.map(element) );
		}
		
		return result;
	}
	
	public static <IN,OUT> OUT foldLeft( 
			Collection<IN> collection, FoldLeft<OUT, IN> fold) {
		
		OUT result = null;
		
		
		
		return result;
	}
	
}
