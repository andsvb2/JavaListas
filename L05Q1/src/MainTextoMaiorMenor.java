import java.util.Scanner;

public class MainTextoMaiorMenor {
//	Questão 01

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a série de números: ");
		String numEntrada = input.nextLine();
//		String numEntrada = "12, 1, 3, 56, 33, 22, 100, 99, 0, -8, 5, 54, 14";
		input.close();
		
		String[] arrayString = numEntrada.split(",");
		
		int[] serieNumeros = new int[arrayString.length];

		for(int i = 0; i < serieNumeros.length; i++) {
			serieNumeros[i] = Integer.parseInt(arrayString[i].trim());
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
				
		for(int j: serieNumeros) {
			maior = Integer.max(maior, j);
			menor = Integer.min(menor, j);
		}
		
		System.out.println("O maior número lido foi: " + maior);
		System.out.println("O menor número lido foi: " + menor);
		
		
	}

}
