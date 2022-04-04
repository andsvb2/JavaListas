import java.util.Scanner;

public class MainTestaMaquina {

	public static void main(String[] args) {
		MaquinaDeLavar maquina = new MaquinaDeLavar();
		Scanner input = new Scanner(System.in);

		System.out.print("Qual a quantidade de roupas para lavar? ");
		int qtdRoupas = Integer.parseInt(input.nextLine());
		Roupa[] cesto = new Roupa[qtdRoupas];
		System.out.println("");

		for (int i = 0; i < cesto.length; i++) {
			cesto[i] = new Roupa();
			System.out.print("Cor da " + (i + 1) + "ª roupa (branca ou colorida): ");
			cesto[i].setCor(Cor.valueOf(input.nextLine().toUpperCase()));

			System.out.print("Tamanho da " + (i + 1) + "ª roupa (p, m ou g): ");
			cesto[i].setTamanho(Tamanho.valueOf(input.nextLine().toUpperCase()));

			System.out.print("Estado da " + (i + 1) + "ª roupa (limpa ou suja): ");
			cesto[i].setEstado(Estado.valueOf(input.nextLine().toUpperCase()));

			System.out.println("");
		}

		input.close();

		System.out.println("Cesto de roupas.");
		listaRoupas(cesto);
		int tempo = maquina.lavar(cesto);

		if (tempo == -1) {
			System.out.println("\nNão é possível realizar a lavagem.\nSepare as roupas brancas das coloridas.");
		} else {
			System.out.printf("\nTempo necessário para lavagem: %d minutos.\n\n", tempo);
			System.out.println("Roupas após a lavagem.");
			listaRoupas(cesto);
		}
	}
	
	public static void listaRoupas(Roupa[] monte) {
		for (int i = 0; i < monte.length; i++) {
			System.out.printf((i + 1) + "ª roupa: %s, %s, %s.\n", monte[i].getCor().toString().toLowerCase(),
					monte[i].getTamanho().toString().toLowerCase(), monte[i].getEstado().toString().toLowerCase());
		}
	}
}