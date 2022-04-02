import java.util.Scanner;

public class AgendaContatos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Contato[] agenda = new Contato[5];
		int pos = 0;
		String contFixo = new String();
		String contCelular = new String();

		for (int i = 0; i < 5; i++) {
			agenda[i] = new Contato();
			System.out.print("Digite o nome [" + (i + 1) + "]: ");
			agenda[i].setNome(input.nextLine());
			System.out.print("Digite o telefone [" + (i + 1) + "]: ");
			agenda[i].setTelefone(input.nextLine());
			System.out.print("Digite o tipo [" + (i + 1) + "]: ");
			agenda[i].setTipoTelefone(Tipo.valueOf(input.nextLine().toUpperCase()));
			System.out.println("");
		}

		System.out.println("--- CADASTRO -- FINALIZADO ---\n");

		while (pos != -2) {
			System.out.print("Digite uma posição [1-5]: ");
			pos = Integer.parseInt(input.nextLine()) - 1;

			if (pos == -2) {
				System.out.println("\n"+"--- ENCERRANDO -- O -- PROGRAMA ---\n");
				break;
			} else if (pos >= 0 && pos <= 4) {
				System.out.printf("%n%s, %s: %s%n%n", agenda[pos].getNome(),
						agenda[pos].getTipoTelefone().toString().toLowerCase(), agenda[pos].getTelefone());
			} else {
				System.out.println("Essa posição não é válida.\n");
			}
		}
		input.close();
		
		for(Contato i: agenda) {
			if(i.getTipoTelefone().equals(Tipo.FIXO)) {
				contFixo += i.getNome() + ", ";
			} else {
				contCelular += i.getNome() + ", ";
			}
		}
		
		System.out.println("Contatos Fixos: " + contFixo);
		System.out.println("Contatos Celular: " + contCelular + "\n");
		System.out.println("--- FIM -- DE -- PROGRAMA ---");
		
	}
}
