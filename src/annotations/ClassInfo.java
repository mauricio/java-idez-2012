package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ClassInfo {

	String criadaEm();
	String criadaPor();
	String ultimaModificacaoEm() default "";
	String ultimaModificacaoPor() default "" ;
	int revisao() default 1 ;
	
}
