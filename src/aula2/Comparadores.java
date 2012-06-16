package aula2;

public class Comparadores {

	public static void main(String[] args) {
		
		String nome1 = "José";
		String nome2 = new String("José");
		String nome3 = "José";
		
		System.out.println( nome1 == nome2 );
		System.out.println( nome1 == nome3 );
		
		
		Integer numero1 = Integer.valueOf(1);
		Integer numero2 = Integer.valueOf(1);
		
		System.out.println( numero1 == numero2 );
		
	}
	
}
