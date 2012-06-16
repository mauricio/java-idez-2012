
public class ArraysTest {

	public static void main(String[] args) {
		
		int[] inteiros = { 1,2,3,4,5 };

		int maisInteiros[] = new int[4];
		maisInteiros[0] = 1;
		maisInteiros[1] = 5;
		maisInteiros[2] = 3;
		//maisInteiros[4] = 9;
				
		System.out.println( inteiros[4] );
		
		int cinco = inteiros[4];
		
		System.out.println(cinco);
		
		System.out.println("array:");
		
		for ( int x = 0; x < inteiros.length; x++) {
			System.out.println( inteiros[x] );
		}
		
	}
	
}
