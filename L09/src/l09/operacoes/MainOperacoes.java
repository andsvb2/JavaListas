package l09.operacoes;

import java.util.Scanner;

public class MainOperacoes {

	public static void main(String[] args) {
		
		OperacaoMatematica operacao = null;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual operação gostaria de realizar:"
				+ "\n1 - soma;"
				+ "\n2 - subtração;"
				+ "\n3 - multiplicação;"
				+ "\n4 - divisão.");
		int opcao = Integer.parseInt(input.nextLine());

		switch (opcao) {
		case 1:
			operacao = new Somar();
			break;
		case 2:
			operacao = new Subtrair();
			break;
		case 3:
			operacao = new Multiplicar();
			break;
		case 4:
			operacao = new Dividir();
			break;
		default:
			break;
		}
		
		System.out.print("Digite o primeiro operando: ");
		operacao.setOperando1(Integer.parseInt(input.nextLine()));
	
		System.out.print("Digite o segundo operando: ");
		operacao.setOperando2(Integer.parseInt(input.nextLine()));
		
		operacao.imprimirResultado();
		
		input.close();
	}
}
