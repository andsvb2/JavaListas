import java.util.Scanner;

public class ProgramaPorteiro {

	public static void main(String[] args) {

		Porteiro porteiro = new Porteiro();
		int contador = 1;
		Scanner input = new Scanner(System.in);
		
		while (contador <= 10) {
			
			Pessoa p1 = new Pessoa();
			
			System.out.print("Nome: ");
			p1.setNome(input.nextLine());
			
			System.out.print("Idade: ");
			p1.setIdade(Integer.parseInt(input.nextLine()));
			
			System.out.print("Sexo (M, F): ");
			String sexo = input.nextLine().toUpperCase();
			
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
				p1.setSexo(Sexo.valueOf(sexo));
			} 
			
			System.out.printf("%n" + porteiro.boasVindas(p1) + "%n%n");
			contador++;
		}
		
		input.close();
	}
}
