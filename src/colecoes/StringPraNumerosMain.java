package colecoes;

import java.util.ArrayList;
import java.util.Collection;

public class StringPraNumerosMain {

	public static void main(String[] args) {
		Collection<String> stringNumeros = new ArrayList<String>(); 
		stringNumeros.add("1");
		stringNumeros.add("7");
		stringNumeros.add("9");
		stringNumeros.add("76"); 
		
		Mapper<String,Integer> mapper = new Mapper<String, Integer>() {			
			@Override
			public Integer map(String e) {
				return (int) Math.pow( Integer.valueOf(e) , 2);
			}
		};
		
		Collection<Integer> resultado = CollectionUtils.map(stringNumeros, mapper);
		
		System.out.println( resultado );
		
	}
	
}