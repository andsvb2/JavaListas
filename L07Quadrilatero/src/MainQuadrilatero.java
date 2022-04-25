import java.util.Scanner;

public class MainQuadrilatero {

	public static void main(String[] args) {

		Quadrilatero[] formas = new Quadrilatero[10];
		Scanner input = new Scanner(System.in);
		int quadrados = 0;
		int retangulos = 0; 
		
		for(int i = 0; i < formas.length;) {
			Quadrilatero q;
			int alt, com;
			
			System.out.print("Informe a altura: ");
			alt = input.nextInt();
			System.out.print("Informe o comprimento: ");
			com = input.nextInt();
			System.out.println();
			
			if (alt == com) {
				q = new Quadrilatero(alt);
			} else {
				q = new Quadrilatero(alt, com);
			}
			
			boolean flag = false;
			
			for(int j = 0; j < i; j++) {
				if (q.equals(formas[j])) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				formas[i] = q;
				if (formas[i].isQuadrado()) {
					quadrados++;
				} else {
					retangulos++;
				}
				i++;
			}
		}
		
		System.out.println("Quadrados: " + quadrados);
		System.out.println("Retangulos: " + retangulos);
		
		input.close();
	}

}
