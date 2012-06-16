package aula2;

public class Felino extends Animal {

	public Felino() {
		System.out.println("Construtor de felino");
	}
	
	@Override
	public void comer() {
		System.out.println( "Comendo carne como felino!" );
	}	
	
}