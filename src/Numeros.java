import java.math.BigDecimal;
import java.math.BigInteger;

public class Numeros {

	public static void main(String[] args) {
		
		System.out.println(1.01 + 1.17);
		
		BigDecimal primeiro = new BigDecimal("1.01");
		BigDecimal segundo = new BigDecimal("1.17");
		
		System.out.println(primeiro.add( segundo ));
		
		BigInteger esquerda = new BigInteger( 
				String.valueOf(Long.MAX_VALUE) );
		
		System.out.println( esquerda.pow(2) );
		
	}
	
}
