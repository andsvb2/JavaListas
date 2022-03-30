import java.util.Scanner;

public class ProgramaNumeros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arrayNumeros = new int[10];
		
		System.out.println("Digite 10 números:");
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = input.nextInt();
		}

		input.close();
		
		System.out.print("Ordem original: ");
		for (int num: arrayNumeros) {
			System.out.print(num + ", ");
		}
		
		System.out.print("\nOrdem inversa: ");
		int iMenos = arrayNumeros.length - 1;
		for (; iMenos >= 0; iMenos--) {
			System.out.print(arrayNumeros[iMenos]);
			if ((iMenos - 1) < 0) {
				System.out.print(".");
			} else {
				System.out.print(", ");
			}
		}

		System.out.print("\nPosições ímpares: ");
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arrayNumeros[i]);
				if ((i + 2) < arrayNumeros.length) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
		}
		
		System.out.print("\nPosições pares: ");
		for (int i = 0; i < arrayNumeros.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arrayNumeros[i]);
				if ((i + 2) < arrayNumeros.length) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
		}
	}
}
