package aula2;

public class Cachorro extends Animal implements BichoDeEstimacao {

	private String dono;
	
	@Override
	public String getDono() {
		return this.dono;
	}
	
	@Override
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	@Override
	public void brincar() {
		System.out.println("Brincando!");
	}
	
}