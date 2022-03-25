import java.util.Scanner;

public class TestaNumPrimo {

	public static void main(String[] args) {
		
//		long startTime = System.currentTimeMillis();
		
		CDF cdf = new CDF();
		Scanner input = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Número para testar: ");
		int num = input.nextInt();
		
		input.close();
		
		while (contador <= num) {
			if (cdf.ePrimo(contador)) {
				System.out.println(contador);
			}
			contador++;						
		}
		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}
}
