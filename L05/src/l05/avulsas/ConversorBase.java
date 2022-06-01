package l05.avulsas;

import java.util.Scanner;

public class ConversorBase {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Número binário: ");
		String binario = input.nextLine();
		
		input.close();
		
		int decimal = Integer.parseInt(binario, 2);
		String hexadecimal = Integer.toHexString(decimal);
		
		System.out.println("Base Hexadecimal: " + hexadecimal.toUpperCase());
		System.out.println("Base Decimal: " + decimal);
		
	}

}
