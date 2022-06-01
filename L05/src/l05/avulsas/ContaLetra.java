package l05.avulsas;
import java.util.Scanner;

public class ContaLetra {

	public static void main(String[] args) {
		
		int vCont = 0, cCont = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Frase a ser contada: ");
		String stringContagem = input.nextLine();
		input.close();
		
		for(int i = 0; i < stringContagem.length(); i++) {
			
			char c = stringContagem.toLowerCase().charAt(i);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vCont++;
			} else if (c >= 'a' && c <= 'z') { // o else if conta apenas letras, pulando números e outros caracteres, usando a tabela ascii
				cCont++;
			}
			
//			 outra forma de implementar a mesma coisa que o else if acima, mas aqui outros caracteres, como números, seriam contados como consoantes.
//			else if (c == ' ') {
//				continue;
//			} else {
//				cCont++;
//			}
			
		}
		
		System.out.println("Vogais: " + vCont);
		System.out.println("Consoantes: " + cCont);
	}
}
