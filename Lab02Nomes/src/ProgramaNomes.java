import java.util.Scanner;

public class ProgramaNomes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] arrayNomes = new String[4];
		
		System.out.println("Digite quatro nomes:");
		
		for (int i = 0; i < arrayNomes.length; i++) {
			arrayNomes[i] = input.nextLine();
			}

		System.out.print("Digite o nome que quer pesquisar: ");
		String nomeTeste = input.nextLine();
		input.close();
		
		boolean achou = false;
		for (String nome: arrayNomes) {
			if (nomeTeste.equals(nome)) {
				achou = true;
				System.out.println(nomeTeste + " está entre os cadastrados.");
				break;
			}
		}
		
		if (!achou)
			System.out.println(nomeTeste + " não está entre os cadastrados.");
	}
}
