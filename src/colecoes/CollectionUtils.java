package colecoes;

import java.util.ArrayList;
import java.util.Collection;

import annotations.ClassInfo;

@ClassInfo(
		criadaEm="30/06/2012",
		criadaPor="Maurício Linhares")
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
	
	public static <ACC,IN> ACC foldLeft( 
			Collection<IN> collection, FoldLeft<ACC, IN> fold) {
		
		ACC result = null;
		
		
		
		return result;
	}
	
}
