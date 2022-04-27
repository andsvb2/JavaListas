package lista.sem03.numPrimos;
import java.util.Scanner;

public class TestaNumPrimo {

	public static void main(String[] args) {
		
//		long startTime = System.currentTimeMillis();
		
		CDF cdf = new CDF();
		Scanner input = new Scanner(System.in);
		int contador = 2;
		
		System.out.print("Número para testar: ");
		int num = input.nextInt();
//		int num = 100000;
		
		input.close();
		
		while (contador < num) {
			if (cdf.ePrimo(contador)) {
				System.out.println(contador);
			}
			contador++;						
		}
		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}
}
