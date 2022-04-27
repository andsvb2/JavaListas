package l04.trianguloFloyd;
import java.util.Scanner;

public class MainTriangulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número que forma o limite do triângulo: ");
		int num = input.nextInt();
		input.close();
		
		/*
		 * O trecho abaixo foi adaptado de: https://stackoverflow.com/a/54758926/16978367
		 */
		
		for(int i = 0, controle = 0; i < num; controle++) {
			for(int j = 0; j < controle; i++) {
				if (i == num) {
					break;
				} else {
					System.out.print(i + 1 + " ");
					j++;
				}
			}
			System.out.println(" ");
		}
	}
}