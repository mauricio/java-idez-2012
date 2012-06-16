import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um inteiro:");
		int inteiro = s.nextInt();		
		System.out.printf("O inteiro digitado foi %d%n", inteiro);	
		
		System.out.println("Digite um double:");
		double flutuante = s.nextDouble();		
		System.out.printf("O double digitado foi %.2f%n", flutuante);
		
	}
	
}