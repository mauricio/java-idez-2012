package xml;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionMain {

	public static void main(String[] args) {
		
		Class<?> clazz = PessoaJuridica.class;
		System.out.println("Variáveis");
		for ( Field f : clazz.getDeclaredFields() ) {			
			System.out.printf( 
					"%s %s%n", 
					f.getType(), 
					f.getName() );			
		}
		System.out.println("Métodos:");
		for ( Method m : clazz.getDeclaredMethods() ) {
			System.out.printf( 
					"%s %s( %s )%n", 
					m.getReturnType(), 
					m.getName(),
					Arrays.asList( m.getParameterTypes() ));				
		}
		
	}
	
}
