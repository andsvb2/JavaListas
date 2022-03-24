import java.util.Scanner;

public class ProgramaPorteiro {

	public static void main(String[] args) {

		Porteiro porteiro = new Porteiro();
		int contador = 0;
		
		do {
			Pessoa p1 = new Pessoa();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Qual seu nome?");
			p1.setNome(input.nextLine());
			
			System.out.println("Qual sua idade?");
			p1.setIdade(Integer.parseInt(input.nextLine()));
			
			System.out.println("Qual seu sexo?");
			String sexo = input.nextLine().toUpperCase();
			
			input.close();
			
			if (sexo.equalsIgnoreCase("MASCULINO") || sexo.equalsIgnoreCase("FEMININO")) {
				p1.setSexo(Sexo.valueOf(sexo));
			} else {
				continue;
			}
			
			String mensagem = porteiro.boasVindas(p1);
			
			System.out.println(mensagem);
			contador++;
		} while (contador < 10);
	}
}
