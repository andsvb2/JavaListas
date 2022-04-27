package lista.sem03.triangulos;
import java.util.Scanner;

public class ProgramaTriangulos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int contEqu = 0, contEsc = 0, contIso = 0, contador = 0, resposta = 0;

		do {
			Triangulo t = new Triangulo();
			
			System.out.print("Lado 1: ");
			t.setLado1(input.nextInt());
			
			System.out.print("Lado 2: ");
			t.setLado2(input.nextInt());
			
			System.out.print("Lado 3: ");
			t.setLado3(input.nextInt());
			
			switch (t.tipo()) {
			case EQUILÁTERO:
				contEqu++;
				break;
			case ISÓSCELES:
				contIso++;
				break;
			case ESCALENO:
				contEsc++;
				break;
			}
			
			System.out.printf("%nGostaria de informar um novo triângulo?%nDigite: 1 para 'sim'; 2 para 'não': ");
			resposta = input.nextInt();
			
			contador++;
			
			if (resposta == 1) {
				System.out.println("");
			} else {
				System.out.printf("%nForam informados %d triângulos.%nEquilátero: %d%nIsósceles: %d%nEscaleno: %d", contador, contEqu,contIso, contEsc);
			}
			
		} while (resposta == 1);
		
		input.close();
	}
}
