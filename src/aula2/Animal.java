package aula2;

abstract public class Animal {

	private int peso;
	private int altura;
	private String cor;
	
	public Animal() {
		System.out.println("Construtor de animal");
	}

	public Animal( int peso, int altura, String cor ) {
		this.peso = peso;
		this.altura = altura;
		this.cor = cor;
	}
	
	public void comer() {
		System.out.println("Sou onívoro, como tudo!");
	}

	public void dormir() {
		System.out.println("Deitei e dormi");
	}

	public void andar() {
		System.out.println("Estou andando por aí");
	}

	public void fazerBarulho() {
		System.out.println("Huf! Huf! Huf!");
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
