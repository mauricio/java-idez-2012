package aula2;

public class Leao extends Felino {

	private boolean chefe;
		
	public Leao() {
		System.out.println("Construtor de leão");
	}
	
	public boolean isChefe() {
		return chefe;
	}
	
	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}
	
	public void comerComoFelino() {
		super.comer();
	}	
	
	@Override
	public void comer() {
		System.out.println( "Comendo carne como leão" );
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Roaaaaaaaaaaaaaaaaaaaarrrr!");
	}
	
}
