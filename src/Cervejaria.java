public class Cervejaria {

	public static void main(String[] args) {

		int cervejas = 10;

		while (cervejas > 0) {

			System.out.printf(
					"%d %s na freezer%n", 
					cervejas, 
					selecionarFlexao( cervejas, "cerveja", "cervejas" ));

			System.out.println("Pego uma garrafa, passo pra frente");
			cervejas = cervejas - 1;
			
			System.out.printf( 
					"Agora %s %d %s na freezer%n", 
					selecionarFlexao( cervejas, "é", "são" ), 
					cervejas, 
					selecionarFlexao( cervejas, "cerveja", "cervejas" ) );

			System.out.println();
		}

	}
	
	public static String selecionarFlexao( int quantidade, String singular, String plural ) {
		if ( quantidade > 1) {
			return plural;
		} else {
			return singular;
		}
	}
	

}
